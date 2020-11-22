package clothing;

public class Sweater extends Clothing{
	private static Sweater sweater = null;
	
	private Sweater(String c) {
		country = c;
	}
	//懒汉单例设计模式
	public static Sweater GetInstance(String s) {
		if(null == sweater)
			sweater = new Sweater(s);
		return sweater;
	}
	@Override
	public String toString() {
		return country + " sweater" + super.toString();
	}
}
