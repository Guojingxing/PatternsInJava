package clothingStore;

public class Waiter implements Observer{
	@Override
	public void update(String style, String size, String color, String pattern) {
		System.out.println("The waiter gets the latest information...");
	}
}
