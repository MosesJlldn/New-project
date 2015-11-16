class Shop {
	private final double maxWeight;
	private double money;
	private int countM;
	private double totalWeight;
	private Product mostExpensive;
	private Product[] product = new Product[100];
	public Shop(double money, double maxWeight, Object[] object, double totalWeight) {
		this.setMoney(money);
		this.maxWeight = maxWeight;
		this.mostExpensive = null;
		this.countM = 0;
		this.totalWeight = 0;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoney() {
		return money;
	}
	public double maxWeight() {
		return maxWeight;
	}
	public Product getMostExpensive() {
		return mostExpensive;
	}
	public double getTotalWeight() {
		return totalWeight;
	}
	public void addProduct(int i, Product p) {
		if (p.getWeight() + this.getTotalWeight() < this.maxWeight()) {
			this.product[i] = p;
			this.totalWeight += p.getWeight();
			this.money -= p.getPrice();
			if (p.getManufacturer() == "RU") {
				countM++;
			}
			if (this.mostExpensive == null) {
				this.mostExpensive = p;
			}
			else {
				if (p.getPrice() > this.mostExpensive.getPrice()) {
					this.mostExpensive = p;
				}
			}	
		}
	}

}