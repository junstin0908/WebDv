package burger_v01;

import lombok.Data;


public class FoodMenu {
	
	private String name;
	private String price;
	
	
	public FoodMenu(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {return name;}
	public String getPrice() {return price;}
	
	
	

}
