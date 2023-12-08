package javaLoops;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, gen, dev, loop=0, soma=0, s1=0, s2=0, s3=0, s4=0;
		char sn = 's';
		float med=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Boa tarde colaborador!");
		
			while (sn != 'n') {
			System.out.println("\nInsira sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nIdentidade de gênero: \n1. Mulher Cis\n2. "
					+ "Homem Cis\n3. Não Binário\n4. Muher Trans\n5.Homem Trans"
					+ "\n6. Outros");
			System.out.println("\nInsira seu gênero: ");
			gen = leia.nextInt();
			
			System.out.println("\nPessoa Desenvolvedora:\n1. Backend\n2. Frontend"
					+ "\n3. Mobile\n4. Fullstack");
			System.out.println("\nInsira sua função: ");
			dev = leia.nextInt();
			
			System.out.println("\nDeseja continuar?\nResponda com s para sim,"
					+ " e n para não.");
			leia.nextLine();
			sn = leia.next().charAt(0);
			
			if (dev == 1) {
				s1++;
				}
			else if ((gen==1 || gen==4) && dev==2) {
				s2++;
			}
			else if ((gen==2 || gen==5) && dev==3 && idade>40) {
				s3++;
			}
			else if (gen==3 && dev==4 && idade<30) {
				s4++;
			}
			loop ++;	
			med += idade;
			
			}
			
			med /= loop;
			System.out.println("Total de pessoas Backend: " + s1);
			System.out.println("Total de mulheres cis e trans, "
					+ "que são desenvolvedoras forntend: " + s2);
			System.out.println("Total de homens cis e trans,"
					+ " desenvlvedores Mobile, maiores de 40: " + s3);
			System.out.println("Total de pessoas não binárias, desenvolvedoras "
					+ "fullstack, menores de 30 anos: " + s4);
			System.out.println("O número total de pessoas que "
					+ "responderam à pesquisa: " + loop);
			System.out.println("Média de idade das pessoas que responderam "
					+ "à pesquisa: " + med);
			
		leia.close();
		
	}

}
