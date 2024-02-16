package burger_v02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import burger_v01.FoodMenu;
import burger_v01.Order;

public class MenuList {
	
	List<FoodMenu> burgerMenu = new ArrayList<>();
	List<FoodMenu> dessertMenu = new ArrayList<>();
	List<FoodMenu> snackMenu = new ArrayList<>();
	List<FoodMenu> drinkMenu = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	Order order = new Order();
	
	public MenuList() {
		
		burgerMenu.add(new FoodMenu("1. 베이컨 토마토 디럭스" , "5800"));
		burgerMenu.add(new FoodMenu("2. 상하이 스파이스 치킨" , "5500"));
		burgerMenu.add(new FoodMenu("3. 빅맥" , "5500"));
		burgerMenu.add(new FoodMenu("4. 맥 치킨" , "4600"));
		burgerMenu.add(new FoodMenu("5. 불고기버거" , "3100"));
		
		dessertMenu.add(new FoodMenu("1. 맥플러리", "2500"));
		dessertMenu.add(new FoodMenu("2. 선데이 아이스크림", "1300"));
		dessertMenu.add(new FoodMenu("3. 아포가토", "2000"));
		dessertMenu.add(new FoodMenu("4. 아이스크림콘", "800"));
		dessertMenu.add(new FoodMenu("5. 스트로베리콘", "900"));
		
		snackMenu.add(new FoodMenu("1. 소시지 스낵랩", "2500"));
		snackMenu.add(new FoodMenu("2. 카페라떼", "3000"));
		snackMenu.add(new FoodMenu("3. 치킨덴더", "5000"));
		snackMenu.add(new FoodMenu("4. 치즈스틱", "2300"));
		
		drinkMenu.add(new FoodMenu("1. 코카콜라", "1100"));
		drinkMenu.add(new FoodMenu("2. 스프라이트", "1100"));
		drinkMenu.add(new FoodMenu("3. 환타", "1100"));
		drinkMenu.add(new FoodMenu("4. 아이스아메리카노", "1200"));
	}
	void showInfo() {
		
		BurgerMenu burgerMenu = new BurgerMenu();
		
		System.out.println("원하는 메뉴를 고르시오");
		System.out.println("1. 버거 | 2. 스낵 | 3. 디저트 | 4. 음료수 | 5. 장바구니 | 5. 주문 취소");
		System.out.println();
		System.out.println("선택하세요");
		int menuchoice = sc.nextInt();
		sc.nextLine();
		
		switch(menuchoice) {
		case 1:
			burgerMenu.showBugerMenu();
			break;
		case 2:
			showDessertMenu();
			break;
		case 3:
			showSnackMenu();
			break;
		case 4:
			showDrinkMenu();
			break;
		case 5:
			showOrderMenu();
			break;
		}
	}
	

}
