package burger;

import java.util.Scanner;

public class McMain {

	public static void main(String[] args) {
		
		Place place = new Place();
		BurgerChoice burgerChoice = new BurgerChoice();
		SnackChoice snackChoice = new SnackChoice();
		DessertsChoice dessertsChoice = new DessertsChoice();
		MenuChoice menuChoice = new MenuChoice();
		Check check = new Check();
		Scanner sc = new Scanner(System.in);
		
		place.showInfo();
//		menuChoice.showInfo();
		burgerChoice.showInfo();
		
		snackChoice.showInfo();
		
		dessertsChoice.showInfo();
		
//		check.showInfo();
	}

}
