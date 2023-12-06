package variaveisEOperadores;

import java.util.Scanner;

public class Prática3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float bruto, noturno, extras, descontos, liquido;
		String nome;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Bom dia colaborador. \nInsira seu nome completo");
		nome = leia.nextLine();
		
		System.out.println("\nInsira o valor do salário bruto: ");
		bruto = leia.nextFloat();
		System.out.println("\nVerificamos que você possui um adicional noturno. \n Por favor, insira o valor do adicional noturno");
		noturno = leia.nextFloat();
		System.out.println("\nVocê possui um adicional de horas extras. \nPor favor, insira o valor do seu bônus de horas extras");
		extras = leia.nextFloat();
		System.out.println("\nInsira o valor dos seus descontos");
		descontos = leia.nextFloat();
	
		System.out.println("\nObrigada colaborador(a) "+ nome + ", veja abaixo o valor a ser depositado.");
		liquido = bruto + noturno + (extras*5) - descontos;
		System.out.println("Salário líquido: " + liquido);
	

	}

}
