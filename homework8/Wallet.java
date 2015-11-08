class Wallet{
	private String material;
	private double price;
	private double money;
	private String colour;
	private boolean slot;
	private double weight;
	private String status;
	public Wallet(String material, String colour, double price, double money, double weight, boolean slot, String status) {
		this.material = material;
		this.price = price;
		this.money = money;
		this.colour = colour;
		this.slot = slot;
		this.status = status;
		this.weight = weight  + this.money * 3;
	}
	public void addPrice(double price) {
		this.price += price;
	}
	public void subtractPrice(double price) {
		this.price -= price;
	}
	public void putMoney(double money) {
		this.money += money;
		this.price += money;
		this.weight += money * 3;
	}
	public void slot() {
		this.slot = true; 
	}
	public void toInteract(char e) {
		if (e == '+') {
			addPrice(1000);
		}
		if (e == '-') {
			addPrice(1000);
		}
		if (e == 'P') {
			putMoney(200);
		}
	}
	public String getStatus(){
		if (getSlot()) {
			status = " One slot is occupied.";
		}
		else status = " There's not occupied slots.";
		return status;
	}
	public String getMaterial() {
		return material;
	}
	public double getPrice() {
		return price;
	}
	public double getMoney() {	
		return money;
	}
	public String getColour() {
		return colour;
	}
	public boolean getSlot() {
		return slot;
	}
	public double getWeight() {
		return weight;
	}
	public String getWallet() {
		return ("------------------------" + "\n" + " Object Wallet:" + "\n" + " Price is " + getPrice() + " rubles." + "\n" +  
				" Material is " + getMaterial() + "." + "\n" + " Colour is " + getColour() + "." + "\n" + " Cash is " + getMoney() + " rubles." +
				"\n" + " Weight is " + getWeight() + "." + "\n" + getStatus() + "\n" + "------------------------");
	}
}