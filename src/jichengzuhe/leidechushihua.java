package jichengzuhe;

class Root{
	static{
		System.out.println("Root�����ʼ��");
	}
	{
		System.out.println("Rootʵ����ʼ����");
	}
	public Root() {
		System.out.println("Root���޲γ�ʼ��");
	}
}
class Mid extends Root{
	static {
		System.out.println("Mid�����ʼ��");
	}
	{
		System.out.println("Mid��ʵ�γ�ʼ��");
	}
	public Mid() {
		System.out.println("Mid���޲γ�ʼ��");
	}
	public Mid(String msg) {
		this();
		System.out.println("Mid�Ǵ��ι������������ֵ��"+msg);
	}
}
class Leaf extends Mid{
	static {
		System.out.println("Leaf�����ʼ��");
	}
	{
		System.out.println("Leaf��ʵ����ʼ��");
	}
	public Leaf() {
		super ("���Java����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
public class leidechushihua {

	public static void main(String[] args) {
		new Leaf();
		new Leaf();
	}

}
