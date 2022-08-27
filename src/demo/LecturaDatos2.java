package demo;
import java.util.Scanner;
public class LecturaDatos2
{
	public static void main(String[] args)
	{
		int edad;
		String nombre;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Por favor ingrese su nombre");
		nombre = scanner.nextLine(); 
		System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");
		edad = scanner.nextInt(); 
		System.out.println(nombre + " tiene " + (edad) + " años."); 
	}
}
