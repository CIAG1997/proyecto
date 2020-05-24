package examenPOO;

public class Receta {
	
	private String Nombre;
	private String tipo;
	private listaIngredientes listaIngredientes;
	private listaIngredientes listaIngrediente[];
	private int cont;
	private int cont2;
	
	public Receta(String pNombre, String pTipo) {
		
		this.Nombre = pNombre;
		this.tipo = pTipo;
		cont = -1;
		cont2 = 20;
		listaIngrediente = new listaIngredientes[cont2];
		
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public listaIngredientes getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(listaIngredientes listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
	
	public void agregarRecetaI(listaIngredientes listaIngredientes) {
		
		cont++;
		listaIngrediente[cont] = new listaIngredientes(listaIngredientes.getCantidad(),listaIngredientes.getNombre()); 
		
	}
	
	public void imprimirIngredientesR() {
		
		System.out.println("Reseta: "+Nombre+"\t\t"+"Tipo: "+tipo);
		System.out.println("\t"+"Lista De Ingredientes");
		System.out.println("Nombre: "+"\t\t\t"+"Libras:");
		for(int i= 0; i <= cont; i++){ 
						
			System.out.println(listaIngrediente[i].getNombre()+"\t\t\t"+listaIngrediente[i].getCantidad());
			
		}
		
	}

}
