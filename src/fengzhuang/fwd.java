package fengzhuang;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class fwd {
	static ByteBuffer by=ByteBuffer.allocate(512);
	static List<SocketChannel> channelList=new ArrayList<>();
    public static void main(String[] args) {
    	try {
			ServerSocketChannel serverSocket=ServerSocketChannel.open();
			serverSocket.bind(null);
			SocketAddress socketAddress=new InetSocketAddress("127.0.0.1",8888);
			serverSocket.configureBlocking(false);
			while(true)
			{
				for(SocketChannel socketChannel:channelList) {
					int read=socketChannel.read(by);
					if(read>0)
					{
						System.out.println("read------1111---"+read);
						by.flip();
						byte[] bs=new byte[read];
						by.get(bs);
						String content=new String(bs);
						System.out.println(content);
						by.flip();
					}
				}
				SocketChannel accept=serverSocket.accept();
				if(accept!=null) {
					System.out.println("conn success");
					accept.configureBlocking(false);
					channelList.add(accept);
					System.out.println(channelList.size()+"list --size");
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
