package clothingFactory;

public class EuropeanFactory extends Factory {
	public EuropeanFactory() {
		s = "European";
	}
	@Override
	public String toString() {
		return "This factory are well in Renaissance-styled clothing.";
	}
}
