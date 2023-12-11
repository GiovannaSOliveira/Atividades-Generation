package javaLoops;

import java.util.Scanner;

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, loop=0;
		float med=0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Este algoritmo mostra a média de todos os números "
				+ "múltiplos de 3 digitados.\nPara finalizar digite 0.\n");
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num%3==0 && num!=0) {
				med += num;
				loop++;
			}
		}
		while (num != 0);
		
		med /= loop;
		System.out.println("A média de todos os números múltiplos de 3 é: " + med);
		
		
		
		leia.close();
		
	}

}
