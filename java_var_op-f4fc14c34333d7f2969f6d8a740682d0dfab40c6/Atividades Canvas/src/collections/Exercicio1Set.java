package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> set = new HashSet <Integer>();
		Integer num;
		Scanner leia = new Scanner(System.in);
		
		
		for (int loop=0; loop<10; loop++) {
			System.out.println("Insira um número");
			num = leia.nextInt();
			set.add(num);
		}
		
		Iterator <Integer> organiza = set.iterator();
		
		System.out.println("\nDados do set:");
		
		while(organiza.hasNext()) {
			System.out.println(organiza.next());
		}
		
		leia.close();
	}

}
