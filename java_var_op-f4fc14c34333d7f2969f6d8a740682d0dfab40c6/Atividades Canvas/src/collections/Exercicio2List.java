package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> lista = new ArrayList <Integer>();
		Scanner leia = new Scanner (System.in);
		Integer num;
		
		lista.add(2); lista.add(5); lista.add(1); lista.add(3); lista.add(4);
		lista.add(9); lista.add(7); lista.add(8); lista.add(10); lista.add(6);
		
		for (int loop=0; loop<100; loop++) {
			System.out.println("Busque por um número: ");
			num = leia.nextInt();
			
			if (lista.contains(num)) {
				System.out.println("O número " + num + " está no índice " + lista.indexOf(num));
			}
			else {
				System.out.println("\nNúmero " + num + " não foi encontrado!");
			}
		}
		
		leia.close();
	}

}
