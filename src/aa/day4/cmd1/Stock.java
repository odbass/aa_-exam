package aa.day4.cmd1;

public class Stock {
	private String name;
	private int quantity;

	public Stock (String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public void buy() {
		System.out.println("Buy " + name + " , " + quantity);
	}

	public void sell() {
		System.out.println("Sell " + name + " , " + quantity);
	}
}
