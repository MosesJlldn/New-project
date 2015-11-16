import java.util.GregorianCalendar;

class Food {
	private String name;
	private final double fats;
	private final double proteins;
	private final double volume;
	private final GregorianCalendar bestUntil;
	public Food(String name, double fats, double proteins, double volume, GregorianCalendar bestUntil) {
		this.setName(name);
		this.fats = fats;
		this.proteins = proteins;
		this.volume = volume;
		this.bestUntil = (GregorianCalendar)bestUntil.clone();
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
	public GregorianCalendar getBestUntil() {
		return bestUntil;
	}
	public boolean getFresh() {
		GregorianCalendar current = new GregorianCalendar();
		return (this.getBestUntil().after(current));
	}
	public boolean getHealthy() {
		if ((fats / volume) > 0.5) {
			return false;
		}
		if ((proteins / volume) < 0.25) {
			return false;
		}
		return true;
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
				"\nBestUntil:" + getBestUntil().getTime() + "." + "\nHealthy:" + getHealthy() + ".");
	}
}