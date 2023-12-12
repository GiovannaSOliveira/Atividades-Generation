package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2Matrizes {

	public static void main(String[] args) {
		
		float [][] matriz = new float [10][4];
		float vetor[] = new float [10];
		float soma;
		int loop, linha, coluna;
		Scanner leia = new Scanner (System.in);
		
		for(linha=0; linha<10; linha++) {
			for (coluna=0; coluna<4; coluna++) {
				System.out.println("\nEntre com as notas do aluno "+ (linha+1));
				matriz[linha][coluna] = leia.nextFloat();
				
			}
		}
		
		for(linha=0; linha<10; linha++) {
			soma=0;
			for (coluna=0; coluna<4; coluna++) {
				soma+=matriz[linha][coluna];
			}
			vetor[linha]=soma/4;
		}
	System.out.println(vetor[0]+" "+vetor[1]+" "+vetor[2]+" "+vetor[3]+" "+vetor[4]+" "
			+vetor[5]+" "+vetor[6]+" "+vetor[7]+" "+vetor[8]+" "+vetor[9]);
		
		leia.close();
	}

}
