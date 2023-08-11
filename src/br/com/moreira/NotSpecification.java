package br.com.moreira;

public class NotSpecification<T> extends CompositeSpecification<T> {
	
	private Specification<T> specification;

	public NotSpecification(Specification<T> specification) {
		this.specification = specification;
	}

	@Override
	public boolean isSatisfiedBy(T t) {
		return !specification.isSatisfiedBy(t);
	}

	

}
