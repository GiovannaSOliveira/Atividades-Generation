package arrays;

import java.util.Scanner;

public class Exercicio1Vetores {

	public static void main(String[] args) {


		int [] vetor = {2,5,1,3,4,9,7,8,10,6};
		int x, loop;
		boolean encontrado = false;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número a ser encontrado: ");
		x = leia.nextInt();
		
		
		
		for (loop=0; loop<10; loop++) {
			
			if (vetor[loop] == x) {
				System.out.println("\nO número " + x + " está na posição: " + loop);		
				encontrado = true;
				break;
			}
			else if (loop == 9 && !encontrado) { 
				System.out.println("\nO número " + x + " não foi encontrado!");
				
			}
			
		}
		
		leia.close();
	}

}
