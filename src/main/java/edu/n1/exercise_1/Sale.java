package edu.n1.exercise_1;

import java.util.*;

public class Sale {

	private ArrayList<Product> products;

	public Sale() {
	}

	public Sale(ArrayList<Product> products) {
		this.products = products;
	}

	public double calculateTotal() throws EmptySaleException {
		double total = 0;

		if (products == null) {
			EmptySaleException emptySaleException = new EmptySaleException("Per fer una venda primer has d’afegir productes.");
			throw emptySaleException;
		}

		for (Product product : products) {
			total += product.getPrice();
		}

		return total;
	}
}