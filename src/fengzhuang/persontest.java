package fengzhuang;

public class persontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p=new person();
		p.setAge(1000);
		System.out.println("未设置age成员变量");
		p.setAge(30);
		System.out.println("成功设置age成员变量后："+p.getAge());
		p.setName("李刚");
		System.out.println("成功设置age成员变量："+p.getName());
	}

}
