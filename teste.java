package esss;

import java.util.Scanner;

public abstract class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				Scanner entrada = new Scanner(System.in);
				
				System.out.println(" Escreva o seu primeiro n�mero: ");
				int valor1 = entrada.nextInt();
						
				System.out.println(" Escreva o seu segundo n�mero: ");		
				int valor2 = entrada.nextInt();
				
				if (valor1 > valor2) {
					
					System.out.println(valor1 + " � maior que " + valor2);
					
				}else {
					
					System.out.println(valor2 + " � maior que " + valor1);
				}
          
         

	}

}
