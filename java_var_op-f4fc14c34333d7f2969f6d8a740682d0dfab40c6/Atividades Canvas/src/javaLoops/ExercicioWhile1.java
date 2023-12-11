package javaLoops;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=0, maior=0, menor=0;
		Scanner leia = new Scanner (System.in);
		
		
		
		while (age>(-1)) {
			System.out.println("Digite uma idade: ");
			age = leia.nextInt();
			if (age < 21){
				menor++;
			}
			else if (age > 50) {
				maior++;
			}	
			System.out.println("Para finalizar digite um valor negativo.\n");
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);
		
		
		
		
		
		leia.close();
		
	}

}
