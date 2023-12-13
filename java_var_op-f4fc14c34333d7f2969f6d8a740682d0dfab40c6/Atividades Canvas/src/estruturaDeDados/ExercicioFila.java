package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		Queue <String> filaBanco = new LinkedList<String> ();
		int num;
		String nome, fbooleano;
		Scanner leia = new Scanner(System.in);
		
		
		/*
		 * Como essa vez eu quis tentar usar o máximo possível de comandos, e tomei muitas
		 * liberdades criativas, o código ficou extenso.
		 * 
		 * Para vocês não ficarem perdidos e perderem muito tempo analisando, vou, pela primeira vez, 
		 * comentar meu código.
		 * 
		 * Observem já no MENU, que temos novas opções.
		 */
		
		System.out.println("\t    MENU");
		System.out.println("-------------------------------\n");
		System.out.println("1- Adicionar clientes na fila");
		System.out.println("2- Listar fila de clientes");
		System.out.println("3- Remover cliente atual da fila");
		System.out.println("4- Adiantar cliente");
		System.out.println("5- Limpar fila");
		System.out.println("0- Sair");
		System.out.println("\n-------------------------------");	
		
		
		/*
		 * Aqui abaixo começam os comandos de acordo com o MENU
		 */
		
		do {
			System.out.println("\n\nEscolha uma opção");
			num = leia.nextInt();
			
			switch (num) {
			
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente");
				nome = leia.nextLine();
				filaBanco.add(nome);
				System.out.println("\nCliente '" +nome+ "' adicionado a fila de atendimento.");
				break;
				
			case 2:
				if (filaBanco.isEmpty()) {
					System.out.println("\nFila vazia!");
				}
				else {
				System.out.println("\n\nTamanho da fila atual:");
				System.out.println(filaBanco.size());
				System.out.println("\nFila atual:");
				System.out.println(filaBanco);
				System.out.println("\nPróximo cliente:");
				System.out.println(filaBanco.peek());
				}
				break;
				
				/*
				 * Aqui adicionei não só a fila atual, como o tamanho dela e 
				 * uma indicação do topo da fila.
				 */
				
			case 3:
				if (filaBanco.isEmpty()) {
					System.out.println("\nFila vazia!");
				}
				else {
				leia.nextLine();
				System.out.println("\nCliente '" + filaBanco.poll() + "' foi chamado!");
				}
				break;
				
				/*
				 * Aqui adicionei o comando poll ao invés de remove, para conseguir mostrar o elemento que
				 * está sendo removido
				 */
				
			case 4:
				if (filaBanco.isEmpty()) {
					System.out.println("\nFila vazia!");
				}
				else {
				leia.nextLine();
				System.out.println("\n Digite o nome do cliente a ser adiantado");
				nome=leia.nextLine();
				filaBanco.remove(nome);
				System.out.println("\nCliente '" +nome+"' foi removido da fila.");
				}
				break;
				
				/*
				 * Aqui criei mais uma opção, onde é possíivel remover um cliente por nome.
				 */
				
			case 5:
				leia.nextLine();
				if (filaBanco.isEmpty()) {
					System.out.println("\nFila vazia!");
				}
				else {
				do {
					System.out.println("\nCerteza que quer limpar fila?");
					fbooleano = leia.nextLine();
					if (fbooleano.equalsIgnoreCase("sim") || fbooleano.equalsIgnoreCase ("s")|| fbooleano.equalsIgnoreCase("true")) {
						System.out.println("\nOk! Fila limpa.");
						filaBanco.clear();
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
				
				/*
				 * Aqui eu usei de base um pedaço que eu criei no meu código de pilha, para confirmar a ação
				 * do usuário.
				 * Também criei uma nova opção. Ela verifica se a fila esta vazia, e se o usuário 
				 * realmente quer limpar a fila, se sim, a fila é limpa com clear.
				 */
				
			case 0:
				System.out.println("\nPrograma finalizado.");
				break;
			
			default: 
				System.out.println("\nOpção inválida.");
			}
		}  while (num!=0);
			
		leia.close();
		
	}

}
