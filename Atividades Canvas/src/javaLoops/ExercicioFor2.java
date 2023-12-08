package javaLoops;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, loop, par=0, impar=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros, para sortea-los em par ou ímpar.\n");
		
		for (loop=1; loop<=10; loop++) {	
			System.out.println("Digite o " + loop + "º número: ");
			num = leia.nextInt();
			if (num % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
		
		leia.close();
	}

}
