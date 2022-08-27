package ejemplos;

import java.util.Scanner;

/*
 * Se desea un programa que lea el nombre de una persona y su edad
 * si la edad de la persona es mayor o igual a 18 años el programa debe escribir
 * el nombre de la persona y el mensaje es mayor de edad
 * */
public class Edad {
	private String nombre;
	private int edad;
	
	public Edad(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	public String evaluarEdad() {
		String mensaje ="";
		if(this.edad>=18) {
			mensaje=this.nombre+" es mayor de edad";
		}
		else if (this.edad>=11) {
			mensaje=this.nombre+" es menor de edad";
		}
		else {
			mensaje=this.nombre+" es niño";
			
		}
		return mensaje;
	}

	public static void main(String[] args) {
		int edad;
		String nombre;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		nombre=sc.nextLine();
		System.out.println("Ingrese su edad");
		edad=sc.nextInt();
		Edad ed=new Edad(nombre,edad);
		mensaje=ed.evaluarEdad();
		System.out.print(mensaje);
	}

}
