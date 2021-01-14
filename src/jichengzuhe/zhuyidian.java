package jichengzuhe;
	
class Animal{
	private void beat() {
		System.out.println("心脏在跳动。。。");
	}
	public void breadthe() {
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中。。。。");
	}
}
class Bird extends Animal{
	public void fily() {
		System.out.println("我在天空中自由飞翔。。。");
	}
}
class Wolf extends Animal{
	public void run() {
		System.out.println("我在陆地上快速奔跑。。。。");
	}
}
public class zhuyidian {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.breadthe();			//b.breadthe将w.breadthe重写了
		b.fily();
		Wolf w=new Wolf();
		w.breadthe();
		w.run();
	}

}
