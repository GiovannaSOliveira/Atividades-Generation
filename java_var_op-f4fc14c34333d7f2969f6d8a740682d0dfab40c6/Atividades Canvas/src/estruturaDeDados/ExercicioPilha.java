package estruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {

		Stack <String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int num;
		String nome, fbooleano;
		
		/*
		 * Neste código eu tomei algumas liberdades criativas, e quis tentar inserir o máximo
		 * de comandos de Stack qe eu podia.
		 * 
		 * Vou comentar o código para economizar seu tempo!
		 */
		
		System.out.println("\t    MENU");
		System.out.println("-------------------------------\n");
		System.out.println("1- Adicionar livro a pilha");
		System.out.println("2- Listar livros da pilha");
		System.out.println("3- Remover livro da pilha");
		System.out.println("4- Limpar pilha");
		System.out.println("0- Sair");
		System.out.println("\n-------------------------------");	
		
		/*
		 * Aqui abaixo começa a seleção de opções do MENU.
		 */
		
		do {
			System.out.println("\n\nEscolha uma opção");
			num = leia.nextInt();
			
			switch (num){
			
			case 1:
				leia.nextLine();
				System.out.println("\nEscreva o nome do livro a ser adicionado");
				nome = leia.nextLine();
				
				/*
				 * Aqui inseri um laço de repetição do while e um condicional if, para caso o nome do 
				 * livro já esteja na lista.
				 * 
				 * Semelhante a quando você insere uma música repetida em uma playlist em aplicativos
				 * de música.
				 */
				

					if (livros.contains(nome)) {
						do {
						System.out.println("\nLivro já inserido. Deseja inseri-lo novamente?");
						fbooleano = leia.nextLine();
							if (fbooleano.equalsIgnoreCase("sim") || fbooleano.equalsIgnoreCase ("s")|| fbooleano.equalsIgnoreCase("true")) {
								System.out.println("\nOk! Livro " +nome+" inserido na pilha!");
								livros.push(nome);
							}
							
							else if (fbooleano.equalsIgnoreCase("nao")|| fbooleano.equalsIgnoreCase("não")|| fbooleano.equalsIgnoreCase("n")|| fbooleano.equalsIgnoreCase("false")) {
								System.out.println("\nOk! Operação ignorada.");
							}
							
							else {
								System.out.println("\nOpção inválida.");
								System.out.println("Pressione ENTER para continuar.");
								leia.nextLine();
							}  
						}  while(!fbooleano.equalsIgnoreCase("sim") && !fbooleano.equalsIgnoreCase ("s") && !fbooleano.equalsIgnoreCase("true") && !fbooleano.equalsIgnoreCase("nao") && !fbooleano.equalsIgnoreCase("não") && !fbooleano.equalsIgnoreCase("n") && !fbooleano.equalsIgnoreCase("false"));
					}
					
					else {
						System.out.println("Livro " + nome + " adicionado!");
						livros.push(nome);
					}
				break;
			
			case 2:
				
				/*
				 * Aqui adicionei informações como tamanho da pilha e livro no topo
				 * da pilha, com os comandos peek e size
				 */
				
				if (livros.isEmpty()) {
					System.out.println("\nPilha vazia!");
				}
				else {
				System.out.println("\nTamanho da pilha:");
				System.out.println(livros.size());
				System.out.println("\nPilha de livros atual:");
				System.out.println(livros);
				System.out.println("\nLivro no topo da pilha: ");
				System.out.println(livros.peek());
				}
				break;
			
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nPilha vazia!");
				}
				else {
					System.out.println("\nLivro '" + livros.pop() + "' removido do topo da pilha.");
				}
				
			case 4: 
				
				/*
				 * Aqui adicionei uma nova opção, para limpar a pilha com clear.
				 * Ele também verifica se a pilha esta vazia, e se o usuário ralmente deseja 
				 * limpar a pilha.
				 */
				
				leia.nextLine();
				if (livros.isEmpty()) {
					System.out.println("\nFila vazia!");
				}
				else {
				do {
					System.out.println("\nCerteza que quer limpar pilha?");
					fbooleano = leia.nextLine();
					if (fbooleano.equalsIgnoreCase("sim") || fbooleano.equalsIgnoreCase ("s")|| fbooleano.equalsIgnoreCase("true")) {
						System.out.println("\nOk! Pilha limpa.");
						livros.clear();
					}
					
					else if (fbooleano.equalsIgnoreCase("nao")|| fbooleano.equalsIgnoreCase("não")|| fbooleano.equalsIgnoreCase("n")|| fbooleano.equalsIgnoreCase("false")) {
						System.out.println("\nOk! Operação ignorada.");
					}
					
					else {
						System.out.println("\nOpção inválida.");
						System.out.println("Presione ENTER para continuar.");
						leia.nextLine();
					}
				}   while(!fbooleano.equalsIgnoreCase("sim") && !fbooleano.equalsIgnoreCase ("s") && !fbooleano.equalsIgnoreCase("true") && !fbooleano.equalsIgnoreCase("nao") && !fbooleano.equalsIgnoreCase("não") && !fbooleano.equalsIgnoreCase("n") && !fbooleano.equalsIgnoreCase("false"));
				}
				break;
				
			case 0 :
				System.out.println("\nOperação finalizada.");
				break;
			
			default: 
				System.out.println("\nOpção inválida.");
			}
			
		}   while (num != 0);
			
		leia.close();
	}

}
