package clothing;

public class Sweater extends Clothing{
	private static Sweater sweater = null;
	
	private Sweater(String c) {
		country = c;
	}
	//�����������ģʽ
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
