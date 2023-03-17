package esss;

import java.util.Scanner;

public class FPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" informe seu cpf: ");
		String nome = entrada.nextLine();
		System.out.println(" informe o valor do salario: ");
		Double prestaçao = entrada.nextDouble();
		System.out.println("informe o valor do prestação:");
		Double salariobruto = entrada.nextDouble();
		
		Double salariodesconto = (prestaçao * 30) / 100;
		
		
		
		if(prestaçao > salariobruto){
		System.out.println(nome + " Autorizado");
		}else {
		System.out.println(nome + " não autorizado"); }
		
		
	
	
		
		
		
		
		
		
		
		
		

	}

}
