package jicheng;

public class superzaigouzhaoqizhong extends Bird{
	String name=null;
	public superzaigouzhaoqizhong() {
		name=super.name;
	}
	public static void main(String[] args) {
		superzaigouzhaoqizhong b=new superzaigouzhaoqizhong();
		System.out.println(b.name);
	}
}
