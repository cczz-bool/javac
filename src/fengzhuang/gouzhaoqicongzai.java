package fengzhuang;

public class gouzhaoqicongzai {
	public String name;
	public int age;
	public String color;
	public int higth;
	public gouzhaoqicongzai() {
	}
	public gouzhaoqicongzai(String name,int age) {
		this.name=name;
		this.age=10;
	}
	public gouzhaoqicongzai(String name,int age,String color,int hight)
	{
		this(name,age,color);
		this.age=age;
		this.higth=hight;
	}
	public gouzhaoqicongzai(String name,int age,String color)
	{
		this(name,age);
		this.color=color;
	}
	public static void main(String[] args) {
		gouzhaoqicongzai b=new gouzhaoqicongzai();
		gouzhaoqicongzai b1=new gouzhaoqicongzai("cz",21);
		System.out.println("��ʼ��ǰ������"+b.name+"  ���䣺"+b.age+"\n��ʼ�������֣�"+b1.name+"  ���䣺"+b1.age);
		gouzhaoqicongzai b2=new gouzhaoqicongzai("cz",21,"��ɫ");
		System.out.println(b2.name+" "+b2.age+" "+b2.color);
		gouzhaoqicongzai b3=new gouzhaoqicongzai("cz",21,"��ɫ",150);
		System.out.println(b3.name+" "+b3.age+" "+b3.color+" "+b3.higth);
	}
	
}
