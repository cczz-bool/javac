package jicheng;

class man{
	public String name="cczz";
	public man() {
		System.out.println("¹¹ÔìÆ÷");
	}
}
public class fulei extends man{
	String name = null;
	public void max() {
		System.out.println(super.name);
	}
	public void mad() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fulei f=new fulei();
		f.mad();
		f.max();
	}

}
