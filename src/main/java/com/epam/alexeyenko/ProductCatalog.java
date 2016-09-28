package com.epam.alexeyenko;

import java.util.List;

import javax.jws.WebService;

import com.epam.alexeyenko.business.ProductServiceImpl;
import com.epam.alexeyenko.model.Product;

@WebService(endpointInterface = "com.epam.alexeyenko.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	ProductServiceImpl productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.alexeyenko.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.epam.alexeyenko.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.epam.alexeyenko.ProductCatalogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.epam.alexeyenko.ProductCatalogInterface#getProductsv2(java.lang.
	 * String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
}
