package esss;

import java.util.Scanner;

public class FPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" informe seu cpf: ");
		String nome = entrada.nextLine();
		System.out.println(" informe o valor do salario: ");
		Double presta�ao = entrada.nextDouble();
		System.out.println("informe o valor do presta��o:");
		Double salariobruto = entrada.nextDouble();
		
		Double salariodesconto = (presta�ao * 30) / 100;
		
		
		
		if(presta�ao > salariobruto){
		System.out.println(nome + " Autorizado");
		}else {
		System.out.println(nome + " n�o autorizado"); }
		
		
	
	
		
		
		
		
		
		
		
		
		

	}

}
