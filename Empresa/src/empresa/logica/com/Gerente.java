package empresa.logica.com;
import java.util.ArrayList;


public class Gerente extends SupervisorTecnico {
	private String codAuto;
	private String lugarEstacionamiento;
	private ArrayList<SupervisorTecnico> supervisoresACargo = new ArrayList<>();
	private double bono;
	
	public Gerente(String nombre, String apellido, int legajo, int codigoArea,
			double sueldo,String auto,String lugarEstacionamiento,double bono) {
		super(nombre, apellido, legajo, codigoArea, sueldo);
		this.codAuto = auto;
		this.lugarEstacionamiento = lugarEstacionamiento;
		this.bono = bono;
	}

	@Override
	public double getSueldo() {
		// TODO Auto-generated method stub
		return super.getSueldo()+ bono;
	}

	public String getCodAuto() {
		return codAuto;
	}

	public void setCodAuto(String codAuto) {
		this.codAuto = codAuto;
	}

	public String getLugarEstacionamiento() {
		return lugarEstacionamiento;
	}

	public void setLugarEstacionamiento(String lugarEstacionamiento) {
		this.lugarEstacionamiento = lugarEstacionamiento;
	}

	public ArrayList<SupervisorTecnico> getSupervisoresACargo() {
		return supervisoresACargo;
	}

	public void addSupervisorACargo(SupervisorTecnico supervisor) {
		this.supervisoresACargo.add(supervisor);
	}

	public double getBono() {
		return bono;
	}
	
}
