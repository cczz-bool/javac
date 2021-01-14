package xia;
abstract class Device{
	private String name;
	public abstract double getPrice();
	public Device() {
	}
	public Device(String neme) {
		this.name=name;
	}
	protected abstract String getName();
}
public class niminglei1 {
	public void test(Device d) {
		System.out.println("购买一个"+d.getName()+",花掉了"+d.getPrice());
	}
	public static void main(String[] args) {
		niminglei1 b=new niminglei1();
		b.test(new Device("电子示波器") {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 158.56;
			}

			@Override
			protected String getName() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		Device d=new Device() {
			
			{
				System.out.println("匿名内部类的初始化");
			}
			public double getPrice() {
				// TODO Auto-generated method stub
				return 56.2;
			}
			public String getName() {
				return "键盘";
			}
		};
		b.test(d);
	}
}
