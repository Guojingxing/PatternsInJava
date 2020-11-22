package client;

import clothing.Clothing;

public class ClientAged extends Clients {
	public ClientAged() {
		styleOrder = new StyleSweater();
		sizeOrder = new SizeMedium();
		colorOrder = new ColorBlue();
		patternOrder = new PatternOn();
	}
	@Override
	public String WearClothes(Clothing c) {
		String s = "Aged: I got my "+ c + " and it fits me.";
		return s;
	}
}