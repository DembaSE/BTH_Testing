package project;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a basket for managing products.
 */
public class Basket {
	private Map<String, Double> products;
	
	/**
     * Constructs a new empty basket.
     */
	public Basket() {
		products = new HashMap<String, Double>();
	}

    /**
     * Adds a product to the basket.
     *
     * @param productName the name of the product to add
     * @param price the price of the product
     */

	public void addProduct(String productName, double price) {
		products.put(productName, price);
	}
	
	 /**
     * Removes a product from the basket.
     * @param productName the name of the product to remove
     */

	public void removeProduct(String productName) {
		products.remove(productName);
	}
	
	 /**
     * Gets the count of products in the basket.
     *
     * @return the number of products in the basket
     */

	public int getProductCount() {
		return products.size();
	}
	
	/**
     * Calculates the total price of all products in the basket.
     *
     * @return the total price of all products in the basket
     */

	public double getTotalPrice() {
		double totalPrice = 0;
		for (double price : products.values()) {
			totalPrice += price;
		}
		return totalPrice;
	}

}
