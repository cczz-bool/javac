package xia;

public class laibulei {
	private double weight;
	public laibulei() {
	}
	public laibulei(double weight) {
		this.weight=weight;
	}
	private class CowLeg{
		private double length;
		private String color;
		public CowLeg() {
		}
		public CowLeg(double length,String color) {
			this.length=length;
			this.color=color;
		}
		public void info() {
			System.out.println("��ǰţ�ȵ���ɫ�ǣ�"+color+"��"+length);
			System.out.println("��ţ�����ڵ�ţ�أ�"+weight);
		}
	}
	public void test() {
		CowLeg c=new CowLeg(1.12,"�ڰ����");
		c.info();
		}
	public static void main(String[] args) {
		laibulei cow=new laibulei(378.9);
		cow.test();
	}
}
