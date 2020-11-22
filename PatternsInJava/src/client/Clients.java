package client;

import clothing.Clothing;

public abstract class Clients {
	public StyleOrder styleOrder;
	public SizeOrder sizeOrder;
	public ColorOrder colorOrder;
	public PatternOrder patternOrder;
	
	public Clients() {
		styleOrder = new StyleSkirt();
		sizeOrder = new SizeMedium();
		colorOrder = new ColorRed();
		patternOrder = new PatternOn();
	}
	
	public void setStyleOrder(StyleOrder style) {
		styleOrder = style;
	}
	public void setSizeOrder(SizeOrder size) {
		sizeOrder = size;
	}
	public void setColorOrder(ColorOrder color) {
		colorOrder = color;
	}
	public void setPatternOrder(PatternOrder pattern) {
		patternOrder = pattern;
	}
	//²ßÂÔÄ£Ê½
	public abstract String WearClothes(Clothing c);
}
