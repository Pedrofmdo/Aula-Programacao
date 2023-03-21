package multp;

import java.util.Scanner;

public class multipp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    System.out.println("informe o tipo de combustivel");
	    String combustivel = sc.nextLine();
	    
	    System.out.println("informe a capacidade do tanque");
	    double capacidadeTanque = sc.nextDouble();
	    
	    if (combustivel.equalsIgnoreCase("G")) {
	        Double valorPago =  capacidadeTanque * 3.79;
	      System.out.println("O valor pago na Gasolina : " + valorPago);
		
	    }else {
	    	Double valorPago =  capacidadeTanque * 2.90;
	    	System.out.println("O valor pago no alcool : " + valorPago);
	     
	    	
	    	
	    }
		
	}

}
