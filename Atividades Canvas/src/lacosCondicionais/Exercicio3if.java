package lacosCondicionais;

import java.util.Scanner;

public class Exercicio3if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String nome;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Escreva por favor o nome completo do doador");
		nome = leia.nextLine();
		System.out.println("\nEscreva por favor a idade do doador");
		age = leia.nextInt();
			if (age >=18 && age<60) {
				System.out.println(nome + " está apto(a) a doar sangue!");
			}
			else if (age < 18) {
				System.out.println(nome + " não está apto(a) a doar sangue!");
			}
			
			else if (age >=60 && age<=69) {
				System.out.println("\nO doador já doou sangue anteriormente? (Responda com true ou false)");
				boolean siono = leia.nextBoolean();

	            if (siono) {
	                System.out.println(nome + " está apto(a) a doar sangue!");
	            } 
	            else {
	                System.out.println(nome + " não está apto(a) a doar sangue!");
	            }
			}

	            if (age > 69) {
	                System.out.println(nome + " não está apto(a) a doar sangue!");
	            }
				
			leia.close();
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
