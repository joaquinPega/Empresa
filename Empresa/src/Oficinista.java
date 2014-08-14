
public class Oficinista extends Empleado {

	public Oficinista(String nombre, String apellido, int legajo,
			int codigoArea, double sueldo) {
		super(nombre, apellido, legajo, codigoArea, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return this.sueldo;
	}

}
