package PizzaBillGenerator;

public class Main {
 
	 public static void main(String[] args) {
		Pizza basePizza = new Pizza(false);
		basePizza.addExtraTopping();
		basePizza.addExtraCheese();
		basePizza.takeAway();
		basePizza.getBill();
		
		DeluxePizza dp = new DeluxePizza(false);
		dp.takeAway();
		dp.getBill();
	 }
}
