package by.itstep.myproject.model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void deleteProduct(Product product) {
		products.remove(product);
	}

	public Product getProductOfIndex(int i) {
		return products.get(i);
	}

	public Product findProduct(String title) {
		for (Product product : products) {
			if (product.getTitle().equalsIgnoreCase(title)) {
				return product;
			}
		}
		return null;
	}

}
