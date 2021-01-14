package jichengzuhe;

public class baozhaunglei {
	public static void main(String[] args) {
		Integer inObj=5;
		Object boolOjb=true;
		int t=inObj;
		if(boolOjb instanceof Boolean) {
			boolean b=(Boolean) boolOjb;
			System.out.println(b);
		}
	}
}
