package jichengzuhe;

class Root{
	static{
		System.out.println("Root的类初始化");
	}
	{
		System.out.println("Root实例初始化块");
	}
	public Root() {
		System.out.println("Root的无参初始化");
	}
}
class Mid extends Root{
	static {
		System.out.println("Mid的类初始化");
	}
	{
		System.out.println("Mid的实参初始化");
	}
	public Mid() {
		System.out.println("Mid的无参初始化");
	}
	public Mid(String msg) {
		this();
		System.out.println("Mid是带参构造器，其参数值："+msg);
	}
}
class Leaf extends Mid{
	static {
		System.out.println("Leaf的类初始化");
	}
	{
		System.out.println("Leaf的实例初始化");
	}
	public Leaf() {
		super ("疯狂Java讲义");
		System.out.println("执行Leaf的构造器");
	}
}
public class leidechushihua {

	public static void main(String[] args) {
		new Leaf();
		new Leaf();
	}

}
