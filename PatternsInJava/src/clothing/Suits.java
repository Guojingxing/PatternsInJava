package clothing;

public class Suits extends Clothing{
	private static Suits suits = null;
	
	private Suits(String c) {
		country = c;
	}
	//�����������ģʽ
	public static Suits GetInstance(String s) {
		if(null == suits)
			suits = new Suits(s);
		return suits;
	}
	@Override
	public String toString() {
		return country + " suits" + super.toString();
	}
}
