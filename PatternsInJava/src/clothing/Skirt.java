package clothing;
/*
 * ����ģʽ
 */

public class Skirt extends Clothing{
	private static Skirt skirt = null;
	
	private Skirt(String c) {
		country = c;
	}
	//�����������ģʽ
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
