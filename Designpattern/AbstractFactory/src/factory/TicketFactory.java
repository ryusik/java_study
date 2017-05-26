package factory;

import product.Product;
import product.Ticket;

public class TicketFactory implements ProductAbstractFactory {
	private String name;
	private int price;
	
	public TicketFactory(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public Product createProduct() {
		return new Ticket(name, price);
	}

}
