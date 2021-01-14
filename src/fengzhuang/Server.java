package fengzhuang;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Server {

	private Selector selector;
	//选择器，作用是Nio中能够检测多个NIO通道，并能够知晓通道是否为堵。
	private ByteBuffer buffer = ByteBuffer.allocate(2048);
	//缓冲区，给ByteBuffer分配2048个字节
	private ServerSocket serverSocket;
	private Map<String, Object> set = new HashMap<>();
	private Map<String, String> names = new HashMap<>();

	public Server(int port) throws IOException {
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
		//打开服务器
		serverSocketChannel.configureBlocking(false);//堵塞
		serverSocket = serverSocketChannel.socket();
		serverSocket.bind(new InetSocketAddress(port));
		//上面两个表示连接port端口
		selector = Selector.open();
		serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		System.out.println("server start on " + port);
	}

	public void listen() throws IOException {
		while (true) {
			selector.select();
			//使用选择器
			Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
			//表示通道已经准备就绪，用选择器来进入通道
			while (iterator.hasNext()){
				//给其输入一个值
				SelectionKey key = iterator.next();
				iterator.remove();
				handleKey(key);
			}
			selector.selectedKeys().clear();
		}
	}
	private void handleKey(SelectionKey key) throws IOException {
		ServerSocketChannel server;
		SocketChannel client;
		if (key.isAcceptable())//测试此键的通道是否已准备好接受新的套接字连接
		{
			server = ((ServerSocketChannel) key.channel());//连接通道
			client = server.accept();//接受到此通道套接字的连接。
			client.configureBlocking(false);//堵塞
			client.register(selector, SelectionKey.OP_READ);
			System.out.println("receive connection from " + client.getRemoteAddress());
			boardMsg("当前有" + (names.size() + 1) + "人\n", null);
			write(client, "欢迎来到聊天室，请输入你的昵称！");
			key.interestOps(SelectionKey.OP_ACCEPT);
		} else if (key.isReadable())//测试此键的通道是否已准备好进行读取，如果此键的通道不支持读取操作，则此方法始终返回 false。
			{
			client = ((SocketChannel) key.channel());//练级通道
			try {
				String[] msg = rec(client).split("###");
				if (msg.length > 0) {
					if (msg.length == 1) {
						if (set.containsKey(msg[0])) {
							//名字有相同的
							write(client, " 重复的昵称：" + msg[0] + " ! 请重新输入!");
						} else {
							set.put(msg[0], null);//添加mas[0]
							names.put(client.getRemoteAddress().toString(),msg[0]);//添加姓名，如果姓名相同就用msg[0]代替
							write(client, "hello " + msg[0]);
						}
					} else if (msg.length == 2) {
						System.out.println(client.getRemoteAddress() + " named " + msg[0] + " said： " + msg[1]);
						boardMsg(msg[0] + " 说: " + msg[1], client);
					}
				}
				key.interestOps(SelectionKey.OP_READ);
			} catch (Exception e) {
				String address = client.getRemoteAddress().toString();
				System.out.println("receive disconnection from " + address);
				String name = names.get(address);
				set.remove(name);
				names.remove(address);
				client.close();
				boardMsg(name + " 离开了聊天室!" + "还剩" + names.size() + "人!", null);
			}
		}
	}

	private void boardMsg(String msg, SocketChannel except) throws IOException {
		for (SelectionKey k : selector.keys()) {
			Channel target = k.channel();
			if (target.isOpen() && target instanceof SocketChannel && target != except) {
				write((SocketChannel) target, msg);
			}
		}
	}

	private String rec(SocketChannel channel) throws IOException {
		buffer.clear();
		int count = channel.read(buffer);
		return new String(buffer.array(), 0, count, StandardCharsets.UTF_8);
	}

	private void write(SocketChannel channel, String content) throws IOException {
		buffer.clear();
		buffer.put(content.getBytes(StandardCharsets.UTF_8));//将content放入到集合中去
		buffer.flip();
		channel.write(buffer);
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server(7777);
		server.listen();
	}
}


