package burger;

import java.util.Scanner;

public class BurgerChoice {
    Scanner sc = new Scanner(System.in);
    public class BugerChoice{
    	private int burgerPrice;
    	private int burgerChoice;
		public int getBurgerPrice() {
			return burgerPrice;
		}
		public void setBurgerPrice(int burgerPrice) {
			this.burgerPrice = burgerPrice;
		}
		public int getBurgerChoice() {
			return burgerChoice;
		}
		public void setBurgerChoice(int burgerChoice) {
			this.burgerChoice = burgerChoice;
		}
    	
    	
    }
    
    
    
    void showInfo() {
        Burger burger = new Burger();
        MenuChoice menuChoice = new MenuChoice();
        burger.showInfo();
        int burgerPrice = 0;
        int burgermenu = 0;
        int burgerChoice;
        while (true) {
        	burgerChoice = sc.nextInt();
//        	setBurgerChoice(sc.nextInt());
            if (burgerChoice == 1 || burgerChoice == 2 || burgerChoice == 3 ||
                burgerChoice == 4 || burgerChoice == 5) {
            	  System.out.println("1. 단품");
                  System.out.println("2. 세트");
                  burgermenu = sc.nextInt();
                  sc.nextLine();
              
                if (burgermenu == 1) {
                    if (burgerChoice == 1) {
                        burgerPrice = 5800;
                    } else if (burgerChoice == 2 || burgerChoice == 3) {
                        burgerPrice = 5500;
                    } else if (burgerChoice == 4) {
                        burgerPrice = 4600;
                    } else if (burgerChoice == 5) {
                        burgerPrice = 3100;
                    }
                    break;
                } else if (burgermenu == 2) {
                    if (burgerChoice == 1) {
                        burgerPrice = 7700;
                    } else if (burgerChoice == 2 || burgerChoice == 3) {
                        burgerPrice = 6900;
                    } else if (burgerChoice == 4) {
                        burgerPrice = 5900;
                    } else if (burgerChoice == 5) {
                        burgerPrice = 4900;
                    }
                    break;
                } else {
                    System.out.println("잘못 입력하였습니다");
                    System.out.println("다시 입력하여주세요");
                    
                    continue;
                }

            } else if (burgerChoice == 6) {
                burgerPrice = 0;
                break;
            } else {
                System.out.println("잘못 입력하였습니다");
                System.out.println("다시 입력하여주세요");
                burger.showInfo();
                continue;
            }
        }
//        menuChoice.showInfo();
       
        	
        }
   
    }

