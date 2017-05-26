import factory.ComputerFactory;
import factory.ProductFactory;
import factory.TicketFactory;
import product.Computer;
import product.Product;

public class main {

	public static void main(String[] args) {
		Product com = ProductFactory.getProduct(new ComputerFactory("computer1", 200000));
		Product ticket = ProductFactory.getProduct(new TicketFactory("트와이스", 100000));
		
		System.out.println(com.toString());
		System.out.println(ticket.toString());

	}

}
