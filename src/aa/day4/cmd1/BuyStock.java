package aa.day4.cmd1;

public class BuyStock implements Order {

	private Stock stock;
	
	public BuyStock (Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void excute() {
		stock.buy();
	}

}
