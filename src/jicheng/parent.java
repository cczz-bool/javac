package jicheng;

class paren{
	public String name="cz";
}
class par extends paren{
	public String name="cczz";
}
public class parent {
	public static void main(String[] args) {
		par d=new par();
		System.out.println(d.name);
		System.out.println(((paren) d).name);
	}
}
