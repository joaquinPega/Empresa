package empresa.logica.com;

public class SupervisorTecnico extends Empleado {
	private int antiguedad;
	
	public SupervisorTecnico(String nombre, String apellido, int legajo,
			int codigoArea, double sueldo) {
		super(nombre, apellido, legajo, codigoArea, sueldo);
		
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public double getSueldo() {
		return this.sueldo+ (this.sueldo*(0.05*(double)antiguedad));
	}

}
