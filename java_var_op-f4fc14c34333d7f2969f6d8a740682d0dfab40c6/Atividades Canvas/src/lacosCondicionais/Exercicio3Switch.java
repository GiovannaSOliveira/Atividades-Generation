package lacosCondicionais;

import java.util.Scanner;

public class Exercicio3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0 ;
		float num1, num2, resul;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = leia.nextFloat();
		System.out.println("\nDigite o 2º número: ");
		num2 = leia.nextFloat();
		
		System.out.println("\n1. Soma\n2. Subtração.\n3. Multiplicação\n4. Divisão");
		System.out.println("\nDigite a operação desejada: ");
		op=leia.nextInt();
		
		switch (op){
		case 1:		resul = (num1 + num2);
		System.out.println("\n" + num1 +" + " + num2 + " = " + resul);
			break;
		case 2: resul = (num1 - num2);
		System.out.println("\n" + num1 +" - " + num2 + " = " + resul);
			break;
		case 3: resul = (num1 * num2);
		System.out.println("\n" + num1 +" * " + num2 + " = " + resul);
			break;
		case 4: resul = (num1 / num2);
		System.out.println("\n" + num1 +" / " + num2 + " = " + resul);
			break;
		
		default: System.out.println("Operação inválida!");
			
		}
		
		leia.close();
		}

}
