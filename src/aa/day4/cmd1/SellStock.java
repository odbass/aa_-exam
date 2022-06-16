package aa.day4.cmd1;

public class SellStock implements Order {

	private Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void excute() {
		stock.sell();
	}

}
