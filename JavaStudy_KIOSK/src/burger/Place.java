package burger;

import java.util.Scanner;

public class Place {
	String outdoor;
	String indoor;
	Scanner sc = new Scanner(System.in);
	void showInfo() {
		
		
		
		String place = null;
//		switch(placeNum) {
//		case 1 : 
//			String place = "포장";
//		case 2 :
//			String place1 = "매장";
//			
//		}
		while (true) {
			System.out.println("1. 포장하기");
			System.out.println("2. 먹고가기");
			int placeNum = sc.nextInt();
			if(placeNum == 1 ) {
				place = "포장";
				break;
			} else if(placeNum == 2	) {
				place = "매장";
				break;
			} else {
				System.out.println("잘못 입력하였습니다");
				System.out.println("다시 입력하여 주십시오");
				
				
			} 
			
		}
		
	}
}
