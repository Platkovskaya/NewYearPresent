package by.htp.mainmodel;

public class Candy extends Sweet {

	private int count;

	public Candy(String title, double weight, double sugar, int count) {
		super(title, sugar, weight);
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Candys : count - " + count + ", title - " + getTitle() + ", count of sugar % - " + getSugar()
				+ ", weight candy gr - " + getWeight() + " ";
	}

}
