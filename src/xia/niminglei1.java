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
		System.out.println("����һ��"+d.getName()+",������"+d.getPrice());
	}
	public static void main(String[] args) {
		niminglei1 b=new niminglei1();
		b.test(new Device("����ʾ����") {
			
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
				System.out.println("�����ڲ���ĳ�ʼ��");
			}
			public double getPrice() {
				// TODO Auto-generated method stub
				return 56.2;
			}
			public String getName() {
				return "����";
			}
		};
		b.test(d);
	}
}
