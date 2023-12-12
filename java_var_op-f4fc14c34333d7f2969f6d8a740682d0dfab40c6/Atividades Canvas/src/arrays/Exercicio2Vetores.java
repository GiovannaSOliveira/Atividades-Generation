package arrays;

import java.util.Scanner;

public class Exercicio2Vetores {

	public static void main(String[] args) {
		
		int [] vetor = new int [10];
		int [] indice = new int[5];
		int [] elemento = new int[5];
		int loop, loop2 = 0, loop3 = 0, indiceImpar, elementoPar, soma=0;
		float media;
	
		
		Scanner leia = new Scanner (System.in);
		
		
		for (loop=0; loop<10;loop++) {
			System.out.println("\nEscreva a entrada para a posição " + loop + " no vetor.");
			vetor[loop] = leia.nextInt();
			if (vetor[loop] % 2 == 0) {
				elemento[loop2] = vetor[loop];
				loop2++;
			}
			if (loop % 2==1){
				indice[loop3] = vetor[loop];
				loop3++;
			}
			soma += vetor[loop];
		}
		
		media = soma/loop;
		System.out.println("\nElementos nos índices ímpares: \n" +indice [0]+ indice [1] +
				indice [2] + indice [3]+ indice [4]);
		System.out.println("\nElementos pares: \n" + elemento[0] + elemento[1] + elemento[2]
				+ elemento[3] + elemento[4]);
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: "+ media);
		
		
		leia.close();
		
	}

}
