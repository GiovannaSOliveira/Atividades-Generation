package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lista = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		String cor;
		int loop;
		
		for (loop=0; loop<5; loop++) {
			System.out.println("\nInsira uma cor");
			cor = leia.nextLine();
			lista.add(cor);
		}
		
		System.out.println("\nCores: ");
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Collections.sort(lista);
		
		System.out.println("\nCores ordenadas:");

		for (String organizada:lista) {
			System.out.println(organizada);
		}
		
		leia.close();
	}

}
