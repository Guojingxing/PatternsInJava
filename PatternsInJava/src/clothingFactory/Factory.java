package clothingFactory;

import client.*;
import clothing.*;

public abstract class Factory {
	private Clothing c = null;
	protected String s = "ordinary";
	public Tailor tailor = Tailor.GetInstance();
	//����ģʽ
	public Clothing CreateClothing(Clients client){
		String style = client.styleOrder.Style();
		//�����·���ʽ�ֱ��õ���Ӧ���·���������������Ҫ��ʱ�����һ����
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
		
		//����·��ĳߴ硢��ɫ���Ƿ��л���
		c.setSize(size);
		c.setColor(color);
		c.setPattern(pattern);
		
		tailor.Producting();
		
		return c;
	} 
}
