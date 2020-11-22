package clothingFactory;

public class ChineseFactory extends Factory {
	public ChineseFactory() {
		s = "Chinese";
	}
	@Override
	public String toString() {
		return "Chinese Factory are well in making "
				+ "cheap and beautiful Chinese Traditional clothing";
	}
}
