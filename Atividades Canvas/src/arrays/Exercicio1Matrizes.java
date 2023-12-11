package arrays;

import java.util.Scanner;

public class Exercicio1Matrizes {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][3];
		int linha, coluna, somaPrin, somaSec;
		
		Scanner leia = new Scanner(System.in);
		
		for (linha=0 ; linha<3; linha++) {
			for(coluna=0; coluna<3; coluna++) {
				System.out.println("\nEscreva um número para a mariz: ");
				matriz [linha][coluna] = leia.nextInt();
			}	
		}
		
		somaPrin = matriz[0][0]+matriz[1][1]+matriz[2][2];
		somaSec = matriz[0][2]+matriz[1][1]+matriz[2][0];
		
		System.out.println("\nElementos da Diagonal principal: \n" + matriz[0][0] +" "
				+ matriz[1][1] +" "+ matriz[2][2]);
		System.out.println("\nElementos da Diagonal Secundária: \n" + matriz[0][2] +" "
				+ matriz[1][1] +" "+ matriz[2][0]);
		System.out.println("\nSoma dos elementos da Diagonal Principal: \n" + somaPrin);
		System.out.println("\nSoma dos elementos da Diagonal Secundária: \n" + somaSec);
		
		
		
		leia.close();
	}

}
