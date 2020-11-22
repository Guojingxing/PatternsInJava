package clothing;

public class TShirt extends Clothing{
	private static TShirt tShirt = null;
	
	private TShirt(String c) {
		country = c;
	}
	//懒汉单例设计模式
	public static TShirt GetInstance(String s) {
		if(null == tShirt)
			tShirt = new TShirt(s);
		return tShirt;
	}
	@Override
	public String toString() {
		return country + " T-Shirt" + super.toString();
	}
}
