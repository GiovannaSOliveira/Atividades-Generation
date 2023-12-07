package lacosCondicionais;

import java.util.Scanner;

public class Exercicio2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int carg;
		float sal, salf; 
		
		Scanner leia  = new Scanner (System.in);
		
		System.out.println("Boa tarde colaborador.\nPor favor, insira seu nome completo.");
		nome = leia.nextLine();
		
		System.out.println("1 \tGerente");
		System.out.println("2 \tVendedor");
		System.out.println("3 \tSurpervisor");
		System.out.println("4 \tMotorista");
		System.out.println("5 \tEstoquista");
		System.out.println("6 \tTécnico de TI\n");
		System.out.println("Por favo, insira seu código de cargo");
		carg = leia.nextInt();
		
		System.out.println("Por favor, insira o valor bruto do seu salário.");
		sal = leia.nextInt();
		
		switch (carg){
		case 1:  
			salf = sal + (10*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: R$"+ salf);
			break;
		case 2:  
			salf = sal + (7*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: R$"+ salf);
			break;
		case 3:  
			salf = sal + (9*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: R$"+ salf);
			break;
		case 4:  
			salf = sal + (6*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: R$"+ salf);
			break;
		case 5:  
			salf = sal + (5*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Esoquista");
			System.out.println("Salário: R$"+ salf);
			break;
		case 6:  
			salf = sal + (8*sal); 
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: R$"+ salf);
			break;
		default:
			System.out.println("Insira um código válido.");
			
		}
				
		
		leia.close();
	}

}
