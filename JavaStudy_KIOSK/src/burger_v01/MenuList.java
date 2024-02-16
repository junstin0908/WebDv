package burger_v01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuList {
	
	List<FoodMenu> bugerMenu = new ArrayList<>();
	List<FoodMenu> dessertMenu = new ArrayList<>();
	List<FoodMenu> snackMenu = new ArrayList<>();
	List<FoodMenu> drinkMenu = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	Order order = new Order();
	
	public MenuList() {
		
		bugerMenu.add(new FoodMenu("1. 베이컨 토마토 디럭스" , "5800"));
		bugerMenu.add(new FoodMenu("2. 상하이 스파이스 치킨" , "5500"));
		bugerMenu.add(new FoodMenu("3. 빅맥" , "5500"));
		bugerMenu.add(new FoodMenu("4. 맥 치킨" , "4600"));
		bugerMenu.add(new FoodMenu("5. 불고기버거" , "3100"));
		
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
		System.out.println("원하는 메뉴를 고르시오");
		System.out.println("1. 버거 | 2. 스낵 | 3. 디저트 | 4. 음료수 | 5. 장바구니 | 5. 주문 취소");
		System.out.println();
		System.out.println("선택하세요");
		int menuchoice = sc.nextInt();
		sc.nextLine();
		
		switch(menuchoice) {
		case 1:
			showBugerMenu();
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
	
	
	
	public void showBugerMenu() {
		System.out.println();
		System.out.println("1. 버거메뉴");
		System.out.println();
		for (int i = 0 ; i < bugerMenu.size(); i++) {
			FoodMenu foodMenu = bugerMenu.get(i);
			
			System.out.println(foodMenu.getName() + " | " + foodMenu.getPrice());
		}
		
		System.out.println("상품 선택 하시오");
		int choiceBuger = sc.nextInt();
		sc.nextLine();
		
		int bugerinfo = choiceBuger -1;
		
		FoodMenu selBuger = bugerMenu.get(bugerinfo);
		System.out.println("\n" + "\"" + selBuger.getName() + " | " + selBuger.getPrice() + "\"");
		System.out.println("장바구니에 추가 하시겠습니까?");
		System.out.println("1. 확인 | 2. 취소");
		int check = sc.nextInt();
		sc.nextLine();
		
		if(check == 1) {
			order.addbasket(selBuger);
			System.out.println(selBuger.getName() + "가 장바구니에 추가되었습니다");
			System.out.println();
			
		} else if ( check == 2) {
			System.out.println("주문이 취소 되었습니다");
		} else {
			System.out.println("잘못 입력 하였습니다 ");
			
		}
		showInfo();
		
	}
	
	public void showDessertMenu() {
		System.out.println();
		System.out.println("2. 디저트 메뉴");
		System.out.println();
		for (int i = 0 ; i < dessertMenu.size(); i++) {
			FoodMenu foodMenu = dessertMenu.get(i);
			
			System.out.println(foodMenu.getName() + " | " + foodMenu.getPrice());
		}
		
		System.out.println("상품 선택 하시오");
		int choiceDessert = sc.nextInt();
		sc.nextLine();
		
		int dessertinfo = choiceDessert -1;
		
		FoodMenu selDessert = dessertMenu.get(dessertinfo);
		System.out.println("\n" + "\"" + selDessert.getName() + " | " + selDessert.getPrice() + "\"");
		System.out.println("장바구니에 추가 하시겠습니까?");
		System.out.println("1. 확인 | 2. 취소");
		int check = sc.nextInt();
		sc.nextLine();
		
		if(check == 1) {
			order.addbasket(selDessert);
			System.out.println(selDessert.getName() + "가 장바구니에 추가되었습니다");
			System.out.println();
			
		} else if ( check == 2) {
			System.out.println("주문이 취소 되었습니다");
		} else {
			System.out.println("잘못 입력 하였습니다 ");
			
		}
		showInfo();
		
	}
	
	public void showSnackMenu() {
		System.out.println();
		System.out.println("3. 스낵메뉴");
		System.out.println();
		for (int i = 0 ; i < snackMenu.size(); i++) {
			FoodMenu foodMenu = snackMenu.get(i);
			
			System.out.println(foodMenu.getName() + " | " + foodMenu.getPrice());
		}
		
		System.out.println("상품 선택 하시오");
		int choiceSnack = sc.nextInt();
		sc.nextLine();
		
		int snackinfo = choiceSnack -1;
		
		FoodMenu selSnack = snackMenu.get(snackinfo);
		System.out.println("\n" + "\"" + selSnack.getName() + " | " + selSnack.getPrice() + "\"");
		System.out.println("장바구니에 추가 하시겠습니까?");
		System.out.println("1. 확인 | 2. 취소");
		int check = sc.nextInt();
		sc.nextLine();
		
		if(check == 1) {
			order.addbasket(selSnack);
			System.out.println(selSnack.getName() + "가 장바구니에 추가되었습니다");
			System.out.println();
			
		} else if ( check == 2) {
			System.out.println("주문이 취소 되었습니다");
		} else {
			System.out.println("잘못 입력 하였습니다 ");
			
		}
		showInfo();
		
	}
	
	public void showDrinkMenu() {
		System.out.println();
		System.out.println("4. 음료수 메뉴");
		System.out.println();
		for (int i = 0 ; i < drinkMenu.size(); i++) {
			FoodMenu foodMenu = drinkMenu.get(i);
			
			System.out.println(foodMenu.getName() + " | " + foodMenu.getPrice());
		}
		
		System.out.println("상품 선택 하시오");
		int choiceDrink = sc.nextInt();
		sc.nextLine();
		
		int drinkinfo = choiceDrink -1;
		
		FoodMenu selDrink = drinkMenu.get(drinkinfo);
		System.out.println("\n" + "\"" + selDrink.getName() + " | " + selDrink.getPrice() + "\"");
		System.out.println("장바구니에 추가 하시겠습니까?");
		System.out.println("1. 확인 | 2. 취소");
		int check = sc.nextInt();
		sc.nextLine();
		
		if(check == 1) {
			order.addbasket(selDrink);
			System.out.println(selDrink.getName() + "가 장바구니에 추가되었습니다");
			System.out.println();
			
		} else if ( check == 2) {
			System.out.println("주문이 취소 되었습니다");
		} else {
			System.out.println("잘못 입력 하였습니다 ");
			
		}
		showInfo();
		
	}
	
	public void showOrderMenu() {
		System.out.println("아래와 같이 주문 하시겠습니까?");
		System.out.println();
		
		List<FoodMenu> basket = order.getbasket();
		
		for(int i = 0 ; i < basket.size(); i++) {
			FoodMenu menu = basket.get(i);
			
			System.out.println(menu.getName() + " | " + menu.getPrice());
		}
		System.out.println();
		System.out.println("Total");
		System.out.println("W" + order.totalPrice());
		
		System.out.println("1. 주문 | 2. 메뉴판");
		int checkNum = sc.nextInt();
		sc.nextLine();
		
		if(checkNum == 1) {
			OrderComplete();
		} else if (checkNum == 2) {
			System.out.println("메뉴판으로 돌아갑니다");
			showInfo();
		}
	}
	
	public void OrderComplete() {
		int orderNumber = order.getOrderNumber();
		System.out.println("주문이 완료되었습니다");
		System.out.println();
		System.out.println("대기 번호는 " + orderNumber + " 입니다");
		System.out.println();
	}
	
	
	

}
