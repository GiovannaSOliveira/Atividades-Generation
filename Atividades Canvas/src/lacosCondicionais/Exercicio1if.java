package lacosCondicionais;

import java.util.Scanner;

public class Exercicio1if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, v;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva o valor de A");
		a = leia.nextInt();
		System.out.println("Escreva o valor de B");
		b = leia.nextInt();
		System.out.println("Escreva o valor de C");
		c = leia.nextInt();
		
		v = a+b;
		
		if (v > c){
			System.out.println("\nA soma de A + B é maior que C");
		}
		else if (v < c) {
			System.out.println("\nA soma de A + B é menor que C");
		}
		else {
			System.out.println("\nA soma de A + B é igual a C");
		}
		
		leia.close();
		
		
		
	}

}
