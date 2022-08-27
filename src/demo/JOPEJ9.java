package demo;
import javax.swing.*;
public class JOPEJ9 {

	public static void main(String[] args) {
		 String[] dias = {
		 "Lunes",
		 "Martes",
		 "Miércoles",
		 "Jueves",
		 "Viernes",
		 "Sábado"
		 };

		 String resp = (String) JOptionPane.showInputDialog(null, "Seleccione un dia", "Dias de la Semana", JOptionPane.QUESTION_MESSAGE,null, dias, dias[0]);

	}

}
