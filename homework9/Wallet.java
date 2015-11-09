class Wallet extends SkinThing{
	private double price;
	private double money;
	private boolean slot;
	private double weight;
	private String status;
	public Wallet(boolean genuine, String color, double price, double money, double weight, boolean slot, String status) {
		super(genuine, color, price);
		this.price = price;
		this.money = money;
		this.setColor(color);
		this.slot = slot;
		this.status = status;
		this.weight = weight  + this.money * 3;
	}
	public void setPrice(double price) {
		if (genuine) 
			this.price = minprice + 400;
		else
			this.price = minprice + 200;
	}
	public void putMoney(double money) {
		this.money += money;
		this.price += money;
		this.weight += money * 3;
	}
	public void slot() {
		this.slot = true; 
	}
	public String getStatus(){
		if (getSlot()) {
			status = " One slot is occupied.";
		}
		else status = " There's not occupied slots.";
		return status;
	}
	public double getPrice() {
		return price;
	}
	public double getMoney() {	
		return money;
	}
	public boolean getSlot() {
		return slot;
	}
	public double getWeight() {
		return weight;
	}
}