
#  🇺🇸 EN_US

# Specification Pattern in Java

The Specification pattern is a way to encapsulate business rules into reusable objects, allowing them to be combined, tested, and altered independently of the rest of the application. In this guide, we delve into a Java implementation of this pattern.

## Table of Contents

- [Components](#components)
  - [Specification<T>](#specificationt)
  - [CompositeSpecification<T>](#compositespecificationt)
  - [Logical Operators](#logical-operators)
  - [ProductInStockSpecification](#productinstockspecification)
- [Practical Use](#practical-use)
- [Advantages](#advantages)
- [Disadvantages](#disadvantages)

## Components

### `Specification<T>`

**Definition:** A generic interface that establishes a contract for all specifications.

**Significance:** Provides a foundation for creating various business rules. Encapsulates the concept of a business rule as an object.

### `CompositeSpecification<T>`

**Definition:** An abstract class that implements `Specification<T>`, providing standard methods to combine specifications.

**Significance:** Introduces the ability to combine specifications to craft more complex business rules.

### Logical Operators

- `AndSpecification<T>`
- `OrSpecification<T>`
- `NotSpecification<T>`

**Definition:** Concrete implementations representing the logical AND, OR, and NOT operators, respectively.

**Significance:** Allow multiple specifications to be combined to craft richer business rules.

### `ProductInStockSpecification`

**Definition:** A specific implementation that checks if a product has an adequate quantity in stock.

**Significance:** Exemplifies the encapsulation of a business rule.

## Practical Use

```java
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Shoes", 5);
        Specification<Product> inStockSpec = new ProductInStockSpecification(3);
        Specification<Product> notInStockSpec = new ProductInStockSpecification(7);
        Specification<Product> complexSpec = inStockSpec.and(notInStockSpec.not());

        if (complexSpec.isSatisfiedBy(product)) {
            System.out.println("The product meets the complex specification!");
        } else {
            System.out.println("The product doesn't meet the complex specification.");
        }
    }
}
```

The code above defines a business rule using the Specification pattern. It combines basic specifications to create a more complex rule and evaluates if a product adheres to that rule.

## Advantages

1. **Business Logic Encapsulation:** Separates business rule verification logic from the client code.
2. **Combinability:** Enables intuitive union of business rules.
3. **Reusability:** Avoids code duplication by reusing existing specifications.
4. **Clarity and Legibility:** Makes business rules expressed in code more comprehensible.
5. **Facilitates Testing:** Each specification is isolated, making unit test writing more straightforward.

## Disadvantages

1. **Added Complexity:** In simpler scenarios, the pattern can introduce an unnecessary layer of complexity.
2. **Learning Curve:** It might be a bit challenging for developers unfamiliar with the pattern to understand it initially.
3. **Performance:** If many specifications are used together or if they are poorly optimized, there could be a performance hit when evaluating the rules.
4. **Refactoring:** Changes in business rules might require significant refactoring if the pattern isn't well-implemented.


---
 🇧🇷 ## PT_BR

# Padrão Specification em Java

O padrão Specification é uma forma de encapsular regras de negócios em objetos reutilizáveis, permitindo combiná-las, testá-las e alterá-las independentemente do restante da aplicação. Neste guia, exploramos uma implementação Java desse padrão.

## Sumário

- [Componentes](#componentes)
  - [Specification<T>](#specificationt)
  - [CompositeSpecification<T>](#compositespecificationt)
  - [Operadores Lógicos](#operadores-lógicos)
  - [ProductInStockSpecification](#ProductInStockSpecification)
- [Uso Prático](#uso-prático)
- [Vantagens](#vantagens)
- [Desvantagens](#desvantagens)

## Componentes

### `Specification<T>`

**Definição:** Interface genérica que estabelece um contrato para todas as especificações.

**Importância:** Fornece uma base para a criação de várias regras de negócios. Encapsula o conceito de uma regra de negócio como um objeto.

### `CompositeSpecification<T>`

**Definição:** Classe abstrata que implementa `Specification<T>`, fornecendo métodos padrão para combinar especificações.

**Importância:** Introduz a capacidade de combinar especificações para criar regras de negócios mais complexas.

### Operadores Lógicos

- `AndSpecification<T>`
- `OrSpecification<T>`
- `NotSpecification<T>`

**Definição:** Implementações concretas que representam operadores lógicos AND, OR e NOT, respectivamente.

**Importância:** Permitem combinar várias especificações para criar regras de negócio mais ricas.

### `ProductInStockSpecification`

**Definição:** Implementação específica que verifica se um produto tem uma quantidade suficiente em estoque.

**Importância:** Exemplifica o encapsulamento de uma regra de negócio.

## Uso Prático

```java
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

```

O código acima define uma regra de negócio utilizando o padrão Specification. Combina especificações básicas para criar uma regra mais complexa e avalia se um produto atende a essa regra.

## Vantagens

1. **Encapsulamento de Lógica de Negócios:** Separa a lógica de verificação de regras de negócios do código cliente.
2. **Combinabilidade:** Permite a união de regras de negócios de forma intuitiva.
3. **Reusabilidade:** Evita duplicação de código ao reutilizar especificações existentes.
4. **Clareza e Legibilidade:** Torna as regras de negócio expressas no código mais compreensíveis.
5. **Facilita os Testes:** Cada especificação é isolada, tornando a escrita de testes unitários mais direta.

## Desvantagens

1. **Complexidade Adicional:** Em cenários mais simples, o padrão pode adicionar uma camada desnecessária de complexidade.
2. **Curva de Aprendizado:** Pode ser um pouco desafiador para desenvolvedores que não estão familiarizados com o padrão compreendê-lo inicialmente.
3. **Performance:** Se muitas especificações forem usadas juntas ou se forem mal otimizadas, pode haver impacto na performance ao avaliar as regras.
4. **Refatoração:** Mudanças nas regras de negócios podem exigir refatoração significativa se o padrão não for bem implementado.

---

