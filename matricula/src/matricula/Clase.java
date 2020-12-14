package matricula;

public class Clase {
	private String codigo;
	private String nombre;
	
	public Clase() {
		
	}
	
	public Clase (String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
		
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
    public String toString() { 
        return String.format("\nCódigo: " + this.getCodigo() + "\nClase: " + this.getNombre()); 
    }
}
