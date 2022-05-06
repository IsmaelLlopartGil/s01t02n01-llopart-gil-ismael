package edu.n1.exercise_1;

import java.util.*;

public class App {

	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();
		Product product1 = new Product("Palet Mànec Kent", 2500);
		products.add(product1);
		Product product2 = new Product("Palet Alvocat Hass", 3000);
		products.add(product2);
		Sale sale = new Sale(products);

		try {
			System.out.println("Total de la venda 1: " + sale.calculateTotal());
		} catch (EmptySaleException e) {
			System.out.println("Missatge excepció: \"EmptySaleException\": " + e.getMessage());
		}

		Sale voidSale = new Sale();

		try {
			System.out.println("Total de la venda 2: " + voidSale.calculateTotal());
		} catch (EmptySaleException e) {
			System.out.println("Missatge excepció \"EmptySaleException\": " + e.getMessage());
		}

		int[] array = { 1, 2, 3 };

		try {
			array[3] = 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Missatge excepció \"ArrayIndexOutOfBoundsException\": " + e);
		}
	}
}
