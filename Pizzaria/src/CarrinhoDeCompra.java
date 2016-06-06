public class CarrinhoDeCompra {
		
	public int precoTotal = 0;
	
	public void incluirPizza(Pizza p){
		
		if ( p.getQtdIngredientes() > 0){		
			this.precoTotal += p.getPreco();	
		}
		else{
			System.out.println("Esta pizza não pode ser adicionada sem ingredientes.");
		}
	}

	public int getPrecoTotal() {
		return precoTotal;
	}
	
	public void totalizaIngredientes(){
		
		for( String key: Pizza.listaIngredientes.keySet() ){
			
			System.out.println("A Qtd. apurada para o ingrediente: " + key + " foi de: " + Pizza.listaIngredientes.get(key) );
		}
	}	

}
