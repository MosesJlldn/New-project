class Glasses {
	private double price;
	private double diopter;
	private String material;
	private String colour;
	private double hp;
	private boolean dressed;
	private boolean inventory;
	private String status;
	private boolean saled;

	public Glasses(double price, double diopter, String material, boolean dressed, String colour, double hp, boolean inventory, String status, boolean saled) {
		this.price = price;
		this.diopter = diopter;
		this.material = material;
		this.colour = colour;
		this.dressed = dressed;
		this.hp = hp; 
		this.status = status;
		this.saled = saled;
	}
	public void addPrice(double price) {
		this.price += price;
	}
	public void subtractPrice(double price) {
		this.price -= price;
	}
	public void repair(double damage) {
		this.hp += damage; 
	}
	public void damage(double damage) {
		this.hp -= damage;
	} 
	public void putIn() {
		this.inventory = true;
		this.dressed = false;
	}
	public void putOn() {
		this.dressed = true;
		this.inventory = false;
	}
	public void sale() {
		this.inventory = false;
		this.dressed = false;
		this.saled = true;
	}
	public void throwG() {
		this.dressed = false;
		this.inventory = false;
	}
	public void changeLenses(double diopter) {
		this.diopter = diopter;
	}
	public void toInteract(char e) {
			if (e == 'W')
				putOn(); 
			if (e == 'S') 
				sale();
			if (e == 'T') 
				throwG();
			if (e == '+')
				addPrice(100);
			if (e == '-') {
				if (price > 0)
					subtractPrice(100);
				else
					System.out.println("Price can't be lower!");
			}
			if (e == 'I') 
				putIn();
			if (e == 'R') {
				if (hp < 100) 
					repair(25);
				else
					System.out.println("HP is already 100% !");
			}
			if (e == 'H') {
				if (hp > 0) 
					damage(25);
				else
					System.out.println("Glasses is already totally destroyed!");
			}
	}
	public String getStatus() {
		if (getInventory()) 
			status = "in wallet."; 
		if (getDressed())
			status =  "dressed.";
		if ((!getInventory()) && (!getDressed()))
			status = "saled or throwed.";
		return status;
	}	
	public double getDiopter() {
		return diopter;
	}
	public boolean getSaled() {
		return saled;
	}
	public String getColour() {
		return colour;
	}
	public String getMaterial() {
		return material;
	}
	public double getHP() {
		return hp;
	}
	public double getPrice() {
		return price;
	}
	public boolean getDressed() {
		return dressed;
	}
	public boolean getInventory() {
		return inventory;
	}
	public String getGlasses() {
		return ("------------------------" + "\n" + " Object Glasses:" + "\n" + " Price is " + getPrice() + " rubles." + "\n" + " Diopter = " + getDiopter() + "." + "\n" +  
				" Material is " + getMaterial() + "." + "\n" + " Colour is " + getColour() + "." + "\n" + 
				" HP = " + getHP() + " percent." + "\n" + " Glasses is " + getStatus() + "\n" + "------------------------");
	}
}


