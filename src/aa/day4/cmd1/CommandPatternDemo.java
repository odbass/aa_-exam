package aa.day4.cmd1;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
	
		Brocker brocker = new Brocker();
		
		brocker.takeOrder(new BuyStock(new Stock("APPL", 10)));
		brocker.takeOrder(new BuyStock(new Stock("APPL", 20)));
		brocker.placeOrders();
		
		
		brocker.takeOrder(new BuyStock(new Stock("GM", 10)));
		brocker.takeOrder(new BuyStock(new Stock("SEC", 10)));
	
		brocker.placeOrders();
		
		brocker.takeOrder(new BuyStock(new Stock("HYUN", 10)));	
		brocker.takeOrder(new SellStock(new Stock("APPL", 10)));
		brocker.takeOrder(new SellStock(new Stock("HYUN", 10)));
			
		brocker.placeOrders();
		
	}
}
