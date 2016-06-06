
public class Principal {
	
	public static void main(String args[]){
		
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		p2.adicionaIngrediente("ing1");
		p2.adicionaIngrediente("ing2");
		p2.adicionaIngrediente("ing3");
		p2.adicionaIngrediente("ing4");
		p2.adicionaIngrediente("ing5");
		
		p3.adicionaIngrediente("ing1");
		p3.adicionaIngrediente("ing2");
		p3.adicionaIngrediente("ing2");
		p3.adicionaIngrediente("ing3");
		p3.adicionaIngrediente("ing4");
		p3.adicionaIngrediente("ing5");
		p3.adicionaIngrediente("ing6");
		
		
		CarrinhoDeCompra c = new CarrinhoDeCompra();
		
		System.out.println("Incluindo a pizza P1");
		c.incluirPizza(p1);
		
		System.out.println("Incluindo a pizza P2");
		c.incluirPizza(p2);
		
		System.out.println("Incluindo a pizza P3");
		c.incluirPizza(p3);
		
		if ( c.getPrecoTotal() > 0 ){
			System.out.println("Preço total: " + c.getPrecoTotal());	
		}
		else{
			System.out.println("Ainda não foram incluídas pizzas ao carrinho!");
		}
		
		
		System.out.println("\nImprimindo a totalização de Ingredientes...");
		c.totalizaIngredientes();
		
	}

}
