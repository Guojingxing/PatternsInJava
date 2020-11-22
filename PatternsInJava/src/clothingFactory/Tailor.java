package clothingFactory;

import clothingStore.Observer;

public class Tailor implements Observer{
	private String style;
	private String size;
	private String color;
	private String pattern;
	
	//饿汉单例设计模式
	private static Tailor t = new Tailor();
	private Tailor() {}
	public static Tailor GetInstance() {
		return t;
	}
	
	@Override
	public void update(String style, String size, String color, String pattern) {
		this.style = style;
		this.size = size;
		this.color = color;
		this.pattern = pattern;
		System.out.println("The tailor know all the latest data of the clothing.");
	}
	public void Producing() {
		System.out.println("Producing clothes...");
		System.out.println("Style:" + style + "\nSize:" + size);
		System.out.println("Color:" + color + "\nPattern:" + pattern);
		System.out.println("Finishing Producing clothes...");
	}
}
