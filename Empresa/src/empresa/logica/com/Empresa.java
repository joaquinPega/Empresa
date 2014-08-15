package empresa.logica.com;
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	private ArrayList<Gerente> gerentes = new ArrayList<>();
	private ArrayList<Oficinista> oficinistas = new ArrayList<>();
	private ArrayList<SupervisorTecnico> supervisores = new ArrayList<>();

	public ArrayList<Gerente> getGerentes() {
		return this.gerentes;
	}

	public ArrayList<Oficinista> getOficinistas() {
		return this.oficinistas;
	}

	public ArrayList<SupervisorTecnico> getSupervisores() {
		return this.supervisores;
	}

	public void addGerente(Gerente gerente) {
		this.gerentes.add(gerente);
	}

	public void addOficinista(Oficinista oficinista) {
		this.oficinistas.add(oficinista);
	}

	public void addSupervisor(SupervisorTecnico supervisor) {
		this.supervisores.add(supervisor);
	}

	public double diaDePago() {
		double a = 0;
		for (Gerente g : gerentes) {
			a += g.getSueldo();
		}
		for (Oficinista o : oficinistas) {
			a += o.getSueldo();
		}
		for (SupervisorTecnico s : supervisores) {
			a += s.getSueldo();
		}
		return a;
	}

	public static void main(String[] args) {
		Empresa e = new Empresa();
		Scanner sc = new Scanner(System.in);
		int i;
		boolean inMenu = true;
		while (inMenu) {
			String nombre,apellido,auto,lugarEstacionamiento;
			int legajo,codArea;
			double sueldo,bono;
			System.out.println("Menu creacion de empleados");
			System.out
					.println("1: crear oficinista| 2: crear supervisor tecnico| 3: crear gerente| 4: DoPayDay| 5: salir");
			try {
				i = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException n) {
				i = Integer.MAX_VALUE;
			}
			switch (i) {
			case 1:
				System.out.println("Ingrese nombre del oficinista");
				nombre = sc.nextLine();
				System.out.println("Ingrese el apellido");
				apellido = sc.nextLine();
				do{
					System.out.println("ingrese el legajo");
					try{
						legajo = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						legajo = Integer.MAX_VALUE;
					}
				}while(legajo == Integer.MAX_VALUE);
				do{
					System.out.println("ingrese el numero de area");
					try{
						codArea = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						codArea = Integer.MAX_VALUE;
					}
				}while(codArea == Integer.MAX_VALUE);
				do{
					System.out.println("Ingrese el salario pactado");
					try{
						sueldo = Double.parseDouble(sc.nextLine());
					}catch(NumberFormatException n){
						sueldo =-1;
					}
					
				}while(sueldo ==-1);
				e.addOficinista(new Oficinista(nombre,apellido,legajo,codArea,sueldo));
				break;
			case 2:
				System.out.println("Ingrese nombre del supervisor");
				nombre = sc.nextLine();
				System.out.println("Ingrese el apellido");
				apellido = sc.nextLine();
				do{
					System.out.println("ingrese el legajo");
					try{
						legajo = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						legajo = Integer.MAX_VALUE;
					}
				}while(legajo == Integer.MAX_VALUE);
				do{
					System.out.println("ingrese el numero de area");
					try{
						codArea = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						codArea = Integer.MAX_VALUE;
					}
				}while(codArea == Integer.MAX_VALUE);
				do{
					System.out.println("Ingrese el salario pactado");
					try{
						sueldo = Double.parseDouble(sc.nextLine());
					}catch(NumberFormatException n){
						sueldo =-1;
					}
					
				}while(sueldo ==-1);
				e.addSupervisor(new SupervisorTecnico(nombre,apellido,legajo,codArea,sueldo));
				break;
			case 3:
				System.out.println("Ingrese nombre del gerente");
				nombre = sc.nextLine();
				System.out.println("Ingrese el apellido");
				apellido = sc.nextLine();
				do{
					System.out.println("ingrese el legajo");
					try{
						legajo = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						legajo = Integer.MAX_VALUE;
					}
				}while(legajo == Integer.MAX_VALUE);
				do{
					System.out.println("ingrese el numero de area");
					try{
						codArea = Integer.parseInt(sc.nextLine());
					}catch(NumberFormatException n){
						codArea = Integer.MAX_VALUE;
					}
				}while(codArea == Integer.MAX_VALUE);
				do{
					System.out.println("Ingrese el salario pactado");
					try{
						sueldo = Double.parseDouble(sc.nextLine());
					}catch(NumberFormatException n){
						sueldo =-1;
					}
					
				}while(sueldo ==-1);
				System.out.println("Ingrese el nombre del auto");
				auto = sc.nextLine();
				System.out.println("ingrese el nombre del lugar del estacionamiento");
				lugarEstacionamiento = sc.nextLine();
				do{
					System.out.println("Ingrese el bono pactado");
					try{
						bono = Double.parseDouble(sc.nextLine());
					}catch(NumberFormatException n){
						bono =-1;
					}
					
				}while(bono ==-1);
				e.addGerente(new Gerente(nombre,apellido,legajo,codArea,sueldo,auto,lugarEstacionamiento,bono));
				break;
			case 4:
				System.out.println(e.diaDePago());
				break;
			case 5:
				inMenu=false;
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}
		sc.close();

	}
}
