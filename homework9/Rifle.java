class Rifle extends Weapon {

	public Rifle(int magazine, double caliber, int bullets) {
		super(magazine, caliber, bullets, "Automatic rifle");
	}
	public void toShot() {
		if (bullets > 0) 
			this.bullets -= 3;
		else 
			System.out.println("Magazine is empty!");
	}

}
