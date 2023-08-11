package br.com.moreira;

public class Main {
	
	public static void main (String[]args) {		
		Product product = new Product("Sneaker", 5);
		
		Specification<Product> inStock = new ProductInStockSpecification(3);
		Specification<Product> notInStock = new ProductInStockSpecification(7);
		Specification<Product> complexSpec = inStock.and(notInStock.not());
		
		if (complexSpec.isSatisfiedBy(product)) {
			System.out.println("The product satisfy the complex specification");
		}else {
			System.out.println("The product not satisfy the complex specification");
		}
	}	
}
