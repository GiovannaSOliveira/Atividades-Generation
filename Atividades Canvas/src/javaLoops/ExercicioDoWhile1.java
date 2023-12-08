package javaLoops;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, sum = 0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Este algoritmo soma todos os números positivos.\nPara finalizar a soma digite 0.\n");
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num>0) {
				sum = sum + num;
			}
		}
		while (num != 0);
		
		System.out.println("A soma dos números positivos é: " + sum);
		
		
		
		leia.close();
		
	}

}
