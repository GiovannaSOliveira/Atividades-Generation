package variaveisEOperadores;

import java.util.Scanner;

public class Prática4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3, n4, diferenca;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira 4 valores para receber as diferenças entre os pares. \nInsira o valor 1");
		n1 = leia.nextFloat();
		System.out.println("\nInsira o segundo valor");
		n2 = leia.nextFloat();
		System.out.println("\nInsira o terceiro valor");
		n3 = leia.nextFloat();
		System.out.println("\nInsira o quarto valor");
		n4 = leia.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + diferenca);
		
		
		
		
		
		
	}

}
