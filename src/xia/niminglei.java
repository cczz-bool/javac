package xia;
interface Product{
	double getPrice();
	String getName();
}
public class niminglei {
	public void test(Product p) {
		System.out.println("¹ºÂòÒ»¸ö£º"+p.getName()+",»¨µô"+p.getPrice());
	}
	public static void main(String[] args) {
		niminglei b=new niminglei();
		b.test(new Product() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 567.8;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "AGPÏÔ¿¨";
			}
		});
	}
}
