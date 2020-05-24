package examenPOO;

public class listaIngredientes {
	
	private int cantidad;	
    private Partes partes;
	private String nombre;
	
    public listaIngredientes(int pCantidad, String pNombre) {
    	
    	cantidad = pCantidad;
    	nombre = pNombre;
    	
    }
    
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Partes getPartes() {
		return partes;
	}
	public void setPartes(Partes partes) {
		this.partes = partes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarListaIngredientes() {
		
		
		
	}
}
