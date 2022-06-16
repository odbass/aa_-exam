package aa.day4.cmd1;

import java.util.LinkedList;
import java.util.List;

public class Brocker {
	private List<Order> orders = new LinkedList<Order>();
	
	public void takeOrder(Order order) {
		orders.add(order);
	}
	
	public void placeOrders() {
		orders.stream().forEach(order -> {
			order.excute();
		});	
	
		orders.clear();
	}
}

