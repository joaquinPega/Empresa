package empresa.logica.com;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private int legajo;
	private int codigoArea;
	protected double sueldo;
	
	public Empleado(String nombre,String apellido,int legajo,int codigoArea,double sueldo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.legajo=legajo;
		this.codigoArea=codigoArea;
		this.sueldo = sueldo;
	}
	/**
	 * @author joaquin.pega
	 * @return Should return sueldo;
	 */
	public abstract double getSueldo();
	
	public void setCodigoArea(int codigoArea){
		this.codigoArea=codigoArea;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	public int getCodigoArea() {
		return codigoArea;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
