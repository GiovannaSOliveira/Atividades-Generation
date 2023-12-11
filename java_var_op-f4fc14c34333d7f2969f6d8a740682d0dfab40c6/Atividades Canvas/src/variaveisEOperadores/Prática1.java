package variaveisEOperadores;

import java.util.Scanner;

public class Prática1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario, abono, novoSalario;
		String nome;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Boa tarde, colaborador(a). \nPor favor insira seu nome completo: ");
		nome = leia.nextLine();
		System.out.println("Digite o valor do salário: ") ;
		salario = leia.nextFloat() ;
		System.out.println("\nHá um abono disponível. \n Digite o valor do abono: ");
		abono = leia.nextFloat();

		novoSalario = salario + abono;
		
		System.out.println("\nObrigada pela colaboração! \n" + nome + " seu novo salário é: " + novoSalario);
		
		
	}

}
