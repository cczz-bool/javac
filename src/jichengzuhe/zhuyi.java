package jichengzuhe;
class Ayimal{
	private void beat() {
		System.out.println("����������������");
	}
	public void breadthe() {
		beat();
		System.out.println("��һ��������һ�����������С�������");
	}
}
class Bied{
	private Ayimal a;
	public Bied(Ayimal a) { 
		this.a=a;
	}
	public void breathe() {
		a.breadthe();
	}
	public void fly() {
		System.out.println("����������ڷ��衣��������");
	}
}
class Worf{
	private Ayimal a;
	public Worf(Ayimal a) {
		this.a=a;
	}
	public void breadthe() {
		a.breadthe();
	}
	public void run() {
		System.out.println("����½���Ͽ��ٱ��ܡ���������");
	}
}
public class zhuyi {
	public static void main(String[] args) {
		Ayimal a1=new Ayimal();
		Bied b=new Bied(a1);
		b.breathe();
		b.fly();
		Ayimal a2=new Ayimal();
		Worf w=new Worf(a2);
		w.breadthe();
		w.run();
	}
}
