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
		System.out.println("初始化前：名字"+b.name+"  年龄："+b.age+"\n初始化后：名字："+b1.name+"  年龄："+b1.age);
		gouzhaoqicongzai b2=new gouzhaoqicongzai("cz",21,"红色");
		System.out.println(b2.name+" "+b2.age+" "+b2.color);
		gouzhaoqicongzai b3=new gouzhaoqicongzai("cz",21,"红色",150);
		System.out.println(b3.name+" "+b3.age+" "+b3.color+" "+b3.higth);
	}
	
}
