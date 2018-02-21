//Новогодний подарок. Определить иерархию конфет и прочих сладостей.
//Создать несколько объектов-конфет. Собрать детский подарок с определе-
//нием его веса. Провести сортировку конфет в подарке на основе одного
//из параметров. Найти конфету в подарке, соответствующую заданному ди-
//апазону содержания сахара.

package by.htp.mainrunner;

import by.htp.mainmodel.Candy;
import by.htp.mainmodel.Present;
import by.htp.mainmodel.Sweet;

public class MainApp {

	public static void main(String[] args) {

		Present present = new Present();

		Sweet caramel = new Candy("Caramel", 10, 3, 5);
		Sweet chocolate = new Candy("Chocolate", 15, 5, 6);
		Sweet ledinets = new Candy("Ledinets", 12, 4, 6);

		System.out.println("\"Present\"");

		present.addSweet(caramel);
		present.addSweet(chocolate);
		present.addSweet(ledinets);

		for (int i = 0; i < present.getSweetsOfPresent().length; i++) {
			System.out.println(present.getSweetsOfPresent()[i].toString());
		}
		System.out.println();

		present.showWeightOfPresent();
		System.out.println();
		present.showSweetsInSugarRange(4, 5);
		System.out.println();
		present.showSweetsSortWeight();

	}

}
