package jichengzuhe;
	
class Animal{
	private void beat() {
		System.out.println("����������������");
	}
	public void breadthe() {
		beat();
		System.out.println("��һ��������һ�����������С�������");
	}
}
class Bird extends Animal{
	public void fily() {
		System.out.println("������������ɷ��衣����");
	}
}
class Wolf extends Animal{
	public void run() {
		System.out.println("����½���Ͽ��ٱ��ܡ�������");
	}
}
public class zhuyidian {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.breadthe();			//b.breadthe��w.breadthe��д��
		b.fily();
		Wolf w=new Wolf();
		w.breadthe();
		w.run();
	}

}
