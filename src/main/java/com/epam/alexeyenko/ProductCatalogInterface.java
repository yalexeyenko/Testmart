package com.epam.alexeyenko;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.alexeyenko.model.Product;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService", targetNamespace = "http://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductsv2(String category);

}