package burger_v01;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<FoodMenu> basket;
	
	private int orderNumber;
	
	public Order() {
		basket = new ArrayList<>();
		orderNumber = 1;
	}
	
	public List<FoodMenu> getbasket() {return basket;}
	
	public int getOrderNumber() {return orderNumber;}
	// 현재 orderNumber 리턴
	
	public void setOrderNumber(int orderNumber) {this.orderNumber = orderNumber;}
	// OrderNumber 를 넘겨 받아 Order() 에서 선언한 OrderNumber 에 넘겨받은 OrderNumber으로 초기화
	
	public void addbasket(FoodMenu menu) {basket.add(menu);}
	// 장바구니에 들어온 FoodMenu 형식의 menu 를 받아 안의 정보를 basket 에 추가
	
	public void Clearbasket() {basket.clear();}
	// 장바구니 초기화
	
	public int totalPrice() {
		int total = 0;
		for(FoodMenu menu : basket) {
			int price = Integer.parseInt(menu.getPrice());
		        total += price;
		}
		
		
		return total;
	}

}
