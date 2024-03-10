package project;
import java.util.HashMap;
import java.util.Map;

public class Basket {
	 private Map<String, Double> products;

	    public Basket() {
	        products = new HashMap<String, Double>();
	    }

	    public void addProduct(String productName, double price) {
	        products.put(productName, price);
	    }

	    public void removeProduct(String productName) {
	        products.remove(productName);
	    }

	    public int getProductCount() {
	        return products.size();
	    }

	    public double getTotalPrice() {
	        double totalPrice = 0;
	        for (double price : products.values()) {
	            totalPrice += price;
	        }
	        return totalPrice;
	    }

}
