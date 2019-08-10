
public class Persona {
	String nombre;
	String apellido;
	int edad;
	String sexo;
	Mascota mascota;
	public Persona(String nombre, String apellido, int edad, String sexo, Mascota mascota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.mascota = mascota;
	}
	public Persona() {
		nombre = "fulanito";
		apellido = "nadie";
		edad = 18;
		sexo = "baron";
		mascota = new Mascota();
	}
	public void Imprimir() {
		System.out.println(nombre+" "+apellido+"\n"+sexo+" de "+edad+" años");
		System.out.println("tiene a :");
		mascota.Imprimir();
	}
}
