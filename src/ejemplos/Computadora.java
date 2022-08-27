package ejemplos;

public class Computadora {
	private String marca;
	private String modelo;
	private float precio=0.00f;
	private String capacidad;
	private String procesador;
	
	public Computadora(String marca, String modelo, float precio, String capacidad, String procesador) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.capacidad=capacidad;
		this.procesador=procesador;
	
	}
	public Computadora() {
		System.out.println("Soy el Constructor");
	}
	public void imprime() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Precio: "+ this.precio);
		System.out.println("Capacidad: "+ this.capacidad);
		System.out.println("Procesador: "+ this.procesador);
	}
	public static void main(String[] args) {
		Computadora cm=new Computadora();
		Computadora dex = new Computadora("Dell","Vostro",1200.95f,"2 Tera", "i9 intel");
		dex.imprime();
		Computadora hp321 = new Computadora("HP","Aspire",1000.95f,"2 Tera", "i9 intel");
		hp321.imprime();
	}

}
