class Weapon {
	protected int magazine;
	protected int bullets;
	protected String type;
	protected double caliber;
	public Weapon(int magazine, double coliber, int bullets, String type) {
		this.setMagazine(magazine);
		this.setCaliber(coliber);
		this.setBullets(bullets);
	}
	public void toShot() {
		if (bullets > 0) 
			this.bullets -= 1;
		else 
			System.out.println("Magazine is empty!");
	}
	public void toReload() {
		if (bullets < magazine) {
			while (bullets < magazine)
				this.bullets++;
		}
		else
			System.out.println("Magazine is full!");
	}
	public void setCaliber(double caliber) {
		this.caliber = caliber;
	}
	public void setMagazine(int magazine) {
		this.magazine = magazine;
	}
	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	public String getType() {
		return type;
	}
	public double getCaliber() {
		return caliber;
	}
	public int getMagazine() {
		return magazine;
	}
	public int getBullets() {
		return bullets;
	}
}