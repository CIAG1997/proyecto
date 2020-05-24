package examenPOO;

import java.awt.image.RescaleOp;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Restaurante El Buen Desayuno"+"\n");
		
	Cocinerio e = new Cocinerio();
	Cocinerio g = new Cocinerio(5,"pedro","col. ato","a");
	Cocinerio f = new Cocinerio(4,"juan","col. cruz","b"); 
	
	listaIngredientes a = new listaIngredientes(100, "tomates");
	listaIngredientes c = new listaIngredientes(50, "cebollas");
	
	
	Receta b = new Receta("tomate con cebolla","armueso");
	
	//e.agregarCosinero(g);
	//e.agregarCosinero(f);
	//e.imprimirCocinero();
	
	b.agregarRecetaI(a);
	b.agregarRecetaI(c);
	b.imprimirIngredientesR();
	
	}

}
