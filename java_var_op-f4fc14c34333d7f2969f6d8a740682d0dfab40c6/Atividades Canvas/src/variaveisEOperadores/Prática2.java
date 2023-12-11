package variaveisEOperadores;

import java.util.Scanner;

public class Prática2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, nota4, mediaFinal;
	
		Scanner valores = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = valores.nextFloat();
		System.out.println("\n Insira a segunda nota: ");
		nota2 = valores.nextFloat();
		System.out.println("\nInsira a terceira nota: ");
		nota3 = valores.nextFloat();
		System.out.println("\nInsira a quarta nota: ");
		nota4 = valores.nextFloat();
		
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A média final é: " + mediaFinal);
		
		
	}

}
