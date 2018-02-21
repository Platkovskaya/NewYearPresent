package by.htp.mainmodel;

public class Present {

	private Sweet[] sweetsOfPresent = new Sweet[0];

	public Sweet[] getSweetsOfPresent() {
		return sweetsOfPresent;
	}

	public void addSweet(Sweet sw) {
		Sweet[] sweets = new Sweet[this.sweetsOfPresent.length + 1];

		for (int i = 0; i < this.sweetsOfPresent.length; i++) {
			sweets[i] = this.sweetsOfPresent[i];
		}

		sweets[sweets.length - 1] = sw;
		this.sweetsOfPresent = sweets;
	}

	public void showWeightOfPresent() {

		double totalWeight = 0;

		for (int i = 0; i < this.sweetsOfPresent.length; i++) {

			double weightOfSweet = this.sweetsOfPresent[i].getWeight();

			int countOfCandys = ((Candy) this.sweetsOfPresent[i]).getCount();

			totalWeight += weightOfSweet * countOfCandys;
		}

		System.out.println("Weight of present: " + totalWeight);
	}

	public void showSweetsInSugarRange(double from, double to) {

		System.out.println("\"Count Sugar in % from '" + from + "' to '" + to + "' in candys\":");
		System.out.println();

		for (int i = 0; i < this.sweetsOfPresent.length; i++) {

			double currentSugar = this.sweetsOfPresent[i].getSugar();

			if (currentSugar >= from && currentSugar <= to) {
				System.out.println("title - " + this.sweetsOfPresent[i].getTitle() + ", count of sugar % - "
						+ this.sweetsOfPresent[i].getSugar() + ", weight candy gr - "
						+ this.sweetsOfPresent[i].getWeight());
			}
		}
	}

	public void showSweetsSortWeight() {
		Sweet[] sortSweets = sweetsOfPresent;
		for (int i = sortSweets.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sortSweets[j].getWeight() > sortSweets[j + 1].getWeight()) {
					Sweet tmp = sortSweets[j];
					sortSweets[j] = sortSweets[j + 1];
					sortSweets[j + 1] = tmp;
				}
			}
		}
		System.out.println("\"Sort candy by weight\"");

		for (int i = 0; i < sweetsOfPresent.length; i++) {
			System.out.println(getSweetsOfPresent()[i].toString());
		}

	}

}
