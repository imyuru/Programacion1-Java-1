package demo;
import javax.swing.*;
public class JOPEJ10 {

	public static void main(String[] args) {
		 int resp=JOptionPane.showConfirmDialog(null,"Estas en el curso de JAVA?");
		 if (JOptionPane.OK_OPTION == resp){
		 System.out.println("Selecciona opción Afirmativa");
		 }
		 else{
		 System.out.println("No selecciona una opción afirmativa");
		 }


	}

}
