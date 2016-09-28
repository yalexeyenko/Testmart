package com.epam.alexeyenko.business;

import java.util.ArrayList;
import java.util.List;

import com.epam.alexeyenko.model.Product;

public class ProductServiceImpl {
	private List<String> bookList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");

		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");

		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Start Trek Into Darkness");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Music");
		return categories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return bookList;
		case "movies":
			return bookList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "1234", 999.99));
		productList.add(new Product("Another Book", "ABC", 12.50));
		return productList;
	}
}
