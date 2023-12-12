package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2Set {

	public static void main(String[] args) {
		
		Set <Integer> set = new HashSet <Integer>();
		Scanner leia = new Scanner(System.in);
		
		set.add(2); set.add(5); set.add(1); set.add(3); set.add(4);
		set.add(9); set.add(7); set.add(8); set.add(10); set.add(6);
		
		System.out.println("\nBusque um número");
		int num = leia.nextInt();
		 if (set.contains(num)) {
			 System.out.println("\nNúmero " + num + " encontrado!!!");
		 }
		 else {
			 System.out.println("Número " + num + " não encontrado...");
		 }
		
		leia.close();	
	}

}
