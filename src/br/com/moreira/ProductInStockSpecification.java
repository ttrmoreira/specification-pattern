package br.com.moreira;

public class ProductInStockSpecification extends CompositeSpecification<Product>{

	private final int desiredAmount;
	
	public ProductInStockSpecification(int desiredAmount) {
		this.desiredAmount = desiredAmount;
	}
	
	@Override
	public boolean isSatisfiedBy(Product product) {
		return product.hasStock(desiredAmount);
	}

}
