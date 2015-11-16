import java.util.Calendar;

class Food {
	private String name;
	private final double fats;
	private final double proteins;
	private final double volume;
	private final Calendar bestUntil;
	public Food(String name, double fats, double proteins, double volume, Calendar bestUntil) {
		this.setName(name);
		this.fats = fats;
		this.proteins = proteins;
		this.volume = volume;
		this.bestUntil = bestUntil;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getFats() {
		return fats;
	}
	public double getProteins() {
		return proteins;
	}
	public double getVolume() {
		return volume;
	}
	public Calendar getBestUntil() {
		return bestUntil;
	}
	public String getFresh() {
		Calendar current = Calendar.getInstance();
		if (this.getBestUntil().before(current)) {
			return("Fresh");
		}
		else {
			return("Not fresh");
		}
	}
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o.getClass() != this.getClass())
			return false;
		if (this == o)
			return true;
		Food that = (Food) o;
		if (this.getVolume() != that.getVolume()) {
			return false;
		}
		if (this.getProteins() != that.getProteins()) {
			return false;
		}
		if (this.getFats() != that.getFats()) {
			return false;
		}
		if (this.getFresh() != that.getFresh()) {
			return false;
		}
		if (this.getName() != that.getName()) {
			return false;
		}
		return true;
	}
	public String toString() {
		return ("Name:" + getName() + "." + "\nVolume:" + getVolume() + "." +
				"\nFats:" + getFats() + "." + "\nProteins:" + getProteins() + "." + 
				"\nFood is" + getFresh() + ".");
	}
}