import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Imprimir(CrearLista());
	}
	public static List<Persona> CrearLista(){
		System.out.println("Cuantas personas");
		int cant = Entrada.entero();
		List<Persona> personas = new ArrayList<Persona>();
		
		for (int a = 0;a<cant;a++) {
			Persona p01 = new Persona();
			System.out.print("Ingrese Nombre: ");
			p01.nombre = Entrada.cadena();
			if(p01.nombre.equals("0")) {
				p01 = new Persona();
			}else {
				System.out.print("Ingrese Apellido: ");
				p01.apellido = Entrada.cadena();
				System.out.print("Ingrese Sexo: ");
				p01.sexo = Entrada.cadena();
				System.out.print("Ingrese Edad: ");
				p01.edad = Entrada.entero();
				System.out.print("Ingrese Nombre de mascota: ");
				p01.mascota.nombre = Entrada.cadena();
				System.out.print("Ingrese Tipo de mascota: ");
				p01.mascota.tipo = Entrada.cadena();
				System.out.print("Ingrese Raza de mascota: ");
				p01.mascota.raza = Entrada.cadena();
			}
			personas.add(p01);
		}
		
		return personas;
	}
	public static void Imprimir(List<Persona> ps) {
		for (Persona p01 : ps) {
			p01.Imprimir();
		}
	}
}
