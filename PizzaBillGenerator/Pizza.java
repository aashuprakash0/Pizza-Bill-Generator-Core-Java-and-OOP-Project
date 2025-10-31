package PizzaBillGenerator;

public class Pizza {

	private int Price; 
	private Boolean veg;
	private int extraCheesePrice=100;
	private int extraToppingsPrice=50;
	private int  backpackPrice=20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded= false;
	private boolean isOptedforTakeAway= false;
	
	
	public Pizza(Boolean veg) {
		this.veg=veg; 
		if(this.veg) {
			this.Price=300;
		}else {
			this.Price= 400;
		}
		basePizzaPrice=this.Price;
	}
	//Add Extra Cheese
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		System.out.println("Extra cheese added");
		this.Price+=extraCheesePrice;
		
	}
	//Add Extra Topping
	public void addExtraTopping() {
		isExtraToppingAdded= true;
		System.out.println("Extra topping added");
		this.Price+=extraToppingsPrice;
	}
	
	//For Takeaway
	
	public void takeAway() {
		isOptedforTakeAway= true;
		System.out.println("Take away opted");
		this.Price+=backpackPrice;
	}
	
	//For Bill
	public void getBill() {
		String bill="";
		System.out.println("Pizza : "+basePizzaPrice);
		if (isExtraCheeseAdded) {
			bill+="Extra Cheese Added : "+extraCheesePrice+"\n";
		}
		if (isExtraToppingAdded) {
			bill+="Extra Topping Added : "+extraToppingsPrice+"\n";
		}
		if (isOptedforTakeAway) {
			bill+="Take Away"+backpackPrice+"\n";
		}
		bill+="Bill : "+this.Price+"\n";
		System.out.println(bill);
	}
	
}

