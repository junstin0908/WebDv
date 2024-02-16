package burger;

import java.util.Scanner;

public class MenuChoice {
	void showInfo() {
		Menu menu = new Menu();
		BurgerChoice burgerChoice = new BurgerChoice();
		SnackChoice snackChoice = new SnackChoice();
		DessertsChoice dessertsChoice = new DessertsChoice();
		
		menu.showInfo();
		Scanner sc = new Scanner(System.in);
		while(true) {
			int menuchoice = sc.nextInt();
			sc.nextLine();
			if(menuchoice == 1) {
				burgerChoice.showInfo();
			}
			if(menuchoice == 2) {
				snackChoice.showInfo();
			}
			if(menuchoice == 3) {
				dessertsChoice.showInfo();
			} else {
				System.out.println("잘못입력하였습니다");
				System.out.println("다시 입력하여주세요");
				menu.showInfo();
			}
		}
	}
}
