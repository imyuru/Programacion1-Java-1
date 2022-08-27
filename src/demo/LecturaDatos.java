package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LecturaDatos
{
	public static void main(String[] args) throws IOException
	{
		String nombre, entrada;
		int edad; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Por favor ingrese su nombre");
		nombre = br.readLine(); 
		System.out.println("Bienvenido " + nombre );
		System.out.println("Por favor ingrese su edad");
		entrada = br.readLine();
		edad = Integer.parseInt(entrada);
		System.out.println(nombre + " tiene " + (edad) + " años."); 
 }
}