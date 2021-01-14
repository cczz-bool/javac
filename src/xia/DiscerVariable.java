package xia;

public class DiscerVariable {
	private String prop="外部类实例变量";
	private class InClass{
		 private String prop="内部类实例变量";
		 public void poo() {
			 String prop="局部变量";
			 System.out.println("外部类实例变量值："+DiscerVariable.this.prop);
			 System.out.println("内部类的实例变量值："+this.prop);
			 System.out.println("局部变量的值："+prop);
		 }
	}
	public void tet() {
		InClass in=new InClass();
		in.poo();
	}
	public static void main(String[] args) {
		new DiscerVariable().tet();
	}
}
