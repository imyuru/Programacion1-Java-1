package ejemplos;

import java.util.Scanner;

public class DiasMes {
	private int mes;
	private int año;
	 
    public DiasMes(int mes, int año){
    	this.mes=mes;
    	this.año=año;
    	
    	
    }
    
    public int clasificaMes() {
    	int dias=0;
    	switch (this.mes) {
    	 case 1:
    	 case 3:
    	 case 5:
    	 case 7:
    	 case 8:
    	 case 10:
    	 case 12:
    		  dias=31;
    		  break;
    	 case 4:
    	 case 6:
    	 case 11:
    		 dias=30;
    		 break;
    	 case 2:
    		 if(año%4==0) {
    			 dias=29;
    		 }
    		 else {
    			 dias=28;
    			 break;
    		 }
    		
    		 
    	}
		return dias;
    }

	public static void main(String[] args) {
		int dias;
		int mes,año;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el mes: ");
		mes=sc.nextInt();
		System.out.println("Ingrese el año");
		año=sc.nextInt();
		DiasMes dm= new DiasMes(mes,año);
		dias=dm.clasificaMes();
		System.out.println("El mes "+mes+" Tiene "+ dias+" dias ");

	}

}
