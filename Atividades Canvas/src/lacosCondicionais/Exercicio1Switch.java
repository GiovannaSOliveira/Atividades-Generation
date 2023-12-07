package lacosCondicionais;

import java.util.Scanner;

public class Exercicio1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod, quant, vtotal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t\tCardápio\n");
		System.out.println("Cód.\t\tProduto \t\tPreço unitátio\n");
		System.out.println("1 \t\tCachorro Quente\t\tRS$10,00");
		System.out.println("2 \t\tX-Salada\t\tRS$15,00");
		System.out.println("3 \t\tX-Bacon\t\t\tRS$18,00");
		System.out.println("4 \t\tBauru\t\t\tRS$12,00");
		System.out.println("5 \t\tRefrigerante\t\tRS$08,00");
		System.out.println("6 \t\tSuco de Laranja\t\tRS$13,00");
		
		System.out.println("Digite o código do pedido:");
		cod = leia.nextInt();
		System.out.println("Digite a quantidade desejada:");
		quant = leia.nextInt();
		
		
		
		switch (cod) {
		case 1:
			vtotal = quant * 10;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		case 2:
			vtotal = quant * 15;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		case 3:
			vtotal = quant * 18;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		case 4:
			vtotal = quant * 12;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		case 5:
			vtotal = quant * 8;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		case 6:
			vtotal = quant * 13;
			System.out.println("O valor total ficou: R$" + vtotal + ",00");
		break;
		default: System.out.println("Insira, por favor, um código válido.");
		
		}
		
		
		
		leia.close();
	}
}

