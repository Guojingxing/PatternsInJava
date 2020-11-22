package client;

import clothing.Clothing;

public class ClientBoy extends Clients {
	public ClientBoy() {
		styleOrder = new StyleTShirt();
		sizeOrder = new SizeLarge();
		colorOrder = new ColorBlack();
		patternOrder = new PatternOff();
	}
	@Override
	public String WearClothes(Clothing c) {
		String s = "Boy: Here is what I got, a "+ c + ", I'm gonna show it on Instagram.";
		return s;
	}
}
