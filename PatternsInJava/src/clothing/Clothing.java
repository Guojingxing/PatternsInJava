package clothing;

public abstract class Clothing {
	private String size;
	private String color;
	private String pattern;
	protected String country = null;
	protected String f = "Ordinary clothing";//ÒÂ·þÃèÊö
	
	protected Clothing() {}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String toString() {
		String s = " in "
				+ size + " size and "
				+ color + " color "
				+ pattern;
		if(null == country)
			f = f + s;
		else f = s;
		return f;
	}
}
