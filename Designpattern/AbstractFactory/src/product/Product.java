package product;

public abstract class Product {
	public abstract String getName();
	public abstract int getPrice();
	
	@Override
	public String toString() {
		return "Product name : " + getName() + ", price : " + getPrice();
	}
}
