package clothing;
/*
 * 单例模式
 */

public class Skirt extends Clothing{
	private static Skirt skirt = null;
	
	private Skirt(String c) {
		country = c;
	}
	//懒汉单例设计模式
	public static Skirt GetInstance(String s) {
		if(null == skirt)
			skirt = new Skirt(s);
		return skirt;
	}
	@Override
	public String toString() {
		return country + " skirt" + super.toString();
	}
}
