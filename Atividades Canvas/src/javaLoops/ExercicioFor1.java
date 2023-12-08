package javaLoops;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Escreva o primeiro e último números do intervalo, sendo o primeiro menor que o segundo.");
		System.out.println("\nInsira o valor do início do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("\nInsira o valor do final do intervalo: ");
		num2 = leia.nextInt();
		
		if (num1 >= num2) {
			System.out.println("Intervalo inválido!");
		}
		else {
			for (int n = num1; n <= num2; n++) {
				if (n%3 == 0 && n%5 == 0) {
					System.out.println(n + " é múltiplo de 3 e 5");
				}
			}
		}	
		
		leia.close();
	}

}
