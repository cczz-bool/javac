package xia;

public class DiscerVariable {
	private String prop="�ⲿ��ʵ������";
	private class InClass{
		 private String prop="�ڲ���ʵ������";
		 public void poo() {
			 String prop="�ֲ�����";
			 System.out.println("�ⲿ��ʵ������ֵ��"+DiscerVariable.this.prop);
			 System.out.println("�ڲ����ʵ������ֵ��"+this.prop);
			 System.out.println("�ֲ�������ֵ��"+prop);
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
