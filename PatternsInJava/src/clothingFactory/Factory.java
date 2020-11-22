package clothingFactory;

import client.*;
import clothing.*;

public abstract class Factory {
	private Clothing c = null;
	protected String s = "ordinary";
	public Tailor tailor = Tailor.GetInstance();
	//工厂模式
	public Clothing CreateClothing(Clients client){
		String style = client.styleOrder.Style();
		//根据衣服款式分别拿到相应的衣服，懒汉单例（想要的时候才做一个）
		switch(style) {
		case "Skirt":
			c = Skirt.GetInstance(s);
			break;
		case "Suits":
			c = Suits.GetInstance(s);
			break;
		case "Sweater":
			c = Sweater.GetInstance(s);
			break;
		case "T-Shirt":
			c = TShirt.GetInstance(s);
			break;
		}
		
		String size = client.sizeOrder.Size();
		String color = client.colorOrder.Color();
		String pattern = client.patternOrder.Pattern();
		
		//设计衣服的尺寸、颜色、是否有花纹
		c.setSize(size);
		c.setColor(color);
		c.setPattern(pattern);
		
		tailor.Producting();
		
		return c;
	} 
}
