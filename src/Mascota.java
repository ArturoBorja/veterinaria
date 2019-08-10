
public class Mascota {
	String nombre;
	String tipo;
	String raza;
	public Mascota(String nombre, String tipo, String raza) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.raza = raza;
	}
	public Mascota() {
		super();
		nombre = "firulai";
		tipo = "perro";
		raza = "labrador";
	}
	public void Imprimir() {
		System.out.println("\t"+nombre);
		System.out.println("\tEs un "+tipo+" de raza "+raza);
	}
}
