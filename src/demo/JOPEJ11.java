package demo;
import javax.swing.*;
public class JOPEJ11 extends JOPEJ10 {

	public static void main(String[] args) {
		int resp;
		 resp=JOptionPane.showConfirmDialog(null,"Estas en el curso de JAVA?","Cuestionario",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		 
		 if (JOptionPane.OK_OPTION == resp){
		 System.out.println("Selecciona opción Afirmativa");
		}
		else{
			System.out.println("No selecciona una opción afirmativa");
		 }



	}

}
