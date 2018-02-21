package by.htp.mainmodel;

public class Sweet {

	private String title;
	private double sugar;
	private double weight;

	public Sweet(String title, double sugar, double weight) {
		this.title = title;
		this.sugar = sugar;
		this.weight = weight;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSugar() {
		return sugar;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// @Override
	// public String toString() {
	// return "Sweets - title candy " + title + ", % sugar = " + sugar + ", weight
	// candy in gramm = " + weight + " ";
	// }

}
