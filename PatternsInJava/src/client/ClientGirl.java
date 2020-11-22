package client;

import clothing.Clothing;

public class ClientGirl extends Clients {
	public ClientGirl() {
		styleOrder = new StyleSkirt();
		sizeOrder = new SizeMedium();
		colorOrder = new ColorRed();
		patternOrder = new PatternOn();
	}
	@Override
	public String WearClothes(Clothing c) {
		String s = "Girl: My nice "+ c + ", and here is how I wear it.";
		return s;
	}
}
