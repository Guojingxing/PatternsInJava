package client;

import clothing.Clothing;

public class ClientChildren extends Clients {
	public ClientChildren() {
		styleOrder = new StyleSweater();
		sizeOrder = new SizeSmall();
		colorOrder = new ColorRed();
		patternOrder = new PatternOn();
	}
	@Override
	public String WearClothes(Clothing c) {
		String s = "Children: My mom bought me a "+ c + ",\n I will tell my friends.";
		return s;
	}
}
