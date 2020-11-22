package clothingFactory;

public class JapaneseFactory extends Factory {
	public JapaneseFactory() {
		s = "Japanese";
	}
	@Override
	public String toString() {
		return "This factory often produces Kimono "
				+ "and some Japanese traditional Suits";
	}
}
