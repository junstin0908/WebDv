package burger;

import java.util.Scanner;

public class DessertsChoice {
	void showInfo() {
		Desserts desserts = new Desserts();
		desserts.showInfo();
		
		Scanner sc = new Scanner(System.in);
		
		int dessertsPrice = 0;
		while(true) {
			int dessertsChoice = sc.nextInt();
			sc.nextLine();
			if(dessertsChoice == 1) {
				dessertsPrice = 3000;
				break;
			}
			else if(dessertsChoice == 2) {
				dessertsPrice = 2100;
				break;
			}
			else if(dessertsChoice == 3) {
				dessertsPrice = 3500;
				break;
			}
			else if(dessertsChoice == 4) {
				dessertsPrice = 1100;
				break;
			}
			else if(dessertsChoice == 5) {
				dessertsPrice = 1400;
				break;
			}
			else if(dessertsChoice == 6) {
				dessertsPrice = 0;
				break;
			} else {
				System.out.println("잘못입력하였습니다");
				System.out.println("다시 입력하여주세요");
				desserts.showInfo();
			}
			
		}
		
	}
}
