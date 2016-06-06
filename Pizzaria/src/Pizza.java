import java.util.HashMap;
import java.util.Map;

public class Pizza{
	
	int qtdIngredientes = 0;
	
	static Map<String,Integer> listaIngredientes = new HashMap<>();
		
	public void adicionaIngrediente(String ingrediente){
			
		Pizza.contabilizaIngrediente(ingrediente);
		
		this.qtdIngredientes++;
	}
	
	
	public static void contabilizaIngrediente(String ingrediente){
		
		if ( !Pizza.listaIngredientes.containsKey(ingrediente) ){
			
			Pizza.listaIngredientes.put(ingrediente, 1);
		}
		else{
			
			Pizza.listaIngredientes.computeIfPresent(ingrediente,(k,v) -> v + 1);
		}
	}

	
	public int getPreco(){	
		int totalPizza = 0;
		
		if(getQtdIngredientes() > 0 && getQtdIngredientes() <= 2 ){	
			totalPizza = 15;
		}
		
		if( getQtdIngredientes() >= 3 && this.qtdIngredientes <= 5 ){
			totalPizza = 20;
		}
			
		if( getQtdIngredientes() > 5 ){
			totalPizza = 23;
		}
		
		return totalPizza;
	}

	public int getQtdIngredientes() {
		return qtdIngredientes;
	}

}
