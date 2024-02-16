package burger_v02;

import java.util.List;
import java.util.Scanner;

public class BurgerMenu {
    Scanner sc = new Scanner(System.in);
//    MenuList menuList = new MenuList();
    MenuList menuList;
    public BurgerMenu(MenuList menuList) {
        this.menuList = menuList;
    }
   

    public void showBugerMenu() {
        System.out.println();
        System.out.println("1. 버거메뉴");
        System.out.println();
        for (int i = 0; i < burgerMenu.size(); i++) {
            FoodMenu foodMenu = burgerMenu.get(i);
            System.out.println(foodMenu.getName() + " | " + foodMenu.getPrice());
        }

        System.out.println("상품 선택 하시오");
        int choiceBurger = sc.nextInt();
        sc.nextLine();

        int burgerinfo = choiceBurger - 1;

        FoodMenu selBurger = burgerMenu.get(burgerinfo);
        System.out.println("\n" + "\"" + selBurger.getName() + " | " + selBurger.getPrice() + "\"");
        System.out.println("장바구니에 추가 하시겠습니까?");
        System.out.println("1. 확인 | 2. 취소");
        int check = sc.nextInt();
        sc.nextLine();

        if (check == 1) {
            // 장바구니 추가 코드
            System.out.println(selBurger.getName() + "가 장바구니에 추가되었습니다");
            System.out.println();

        } else if (check == 2) {
            System.out.println("주문이 취소 되었습니다");
        } else {
            System.out.println("잘못 입력 하였습니다 ");

        }
        // 다시 메뉴 보여주기
        menuList.showInfo();

    }
}
