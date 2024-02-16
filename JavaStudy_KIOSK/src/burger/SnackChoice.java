package burger;

import java.util.Scanner;

public class SnackChoice {
	Scanner sc = new Scanner(System.in);
	void showInfo() {
		Snack snack = new Snack();
		snack.showInfo();
		
		int snackPrice = 0;
		int snackmenu = 0;
		
		while(true) {
			int snackChoice = sc.nextInt();
			if (snackChoice == 1) {
				snackPrice = 3100;
				break;
			}
			else if (snackChoice == 2) {
				snackPrice = 2900;
				break;
			}
			else if (snackChoice == 3) {
				snackPrice = 2200;
				break;
			}
			else if (snackChoice == 4) {
				snackPrice = 2200;
				break;
			}
			else if (snackChoice == 5) {
				snackPrice = 2000;
				break;
			}
			else if (snackChoice == 6) {
				snackPrice = 1200;
				break;
			}
			else if (snackChoice == 7) {
				snackPrice = 0;
				break;
			}
			else {
				System.out.println("잘못입력하였습니다");
				System.out.println("다시 입력하여주세요");
				snack.showInfo();
			}
		}
		
	}
}
