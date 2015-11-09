class SkinThing{
	protected boolean genuine;
	private String color;
	private double price;
	protected final double minprice = 100;
	public SkinThing(boolean genuine, String color, double price) {
		this.setGenuine(genuine);
		this.setColor(color);
	}
	public void setPrice(double price) {
		if (genuine) 
			this.price = minprice + 200;
		else
			this.price = minprice + 100;
	}
	public double getPrice() {
		return price;
	}
	public void setGenuine(boolean genuine) {
		this.genuine = genuine;
	}
	public boolean getGenuine() {
		return genuine;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}