package ejercicioTema7_8_9;

import java.util.ArrayList;

public class ArrayListInt {
	
	public static void main(String[] args) {
		
		// Rellenado ArrayList con bucle while
		System.out.println("Rellenando ArrayList con bucle while: ");
		ArrayList<Integer> enteros1 = new ArrayList<Integer>();
		
		int contador = 1;
		while (contador <= 10) {
			enteros1.add(contador);
			contador++;
		}
		System.out.println(enteros1);
		
		for (int i = 0; i < enteros1.size(); i++) {
			if (enteros1.get(i) % 2 == 0) {
				enteros1.remove(i);
			}
		}
		System.out.println("Devolviendo ArrayList sin los numeros pares: ");
		System.out.println(enteros1);
		
		System.out.println();
		
		//Rellenando ArrayList con bucle for
		System.out.println("Rellenando ArrayList con bucle for: ");
		ArrayList<Integer> enteros2 = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			enteros2.add(i);
			if(i == 10) {
				break;
			}
		}
		
		System.out.println(enteros2);
		
		ArrayList<Integer> enterosSinPares = new ArrayList<Integer>();
		
		for (int i = 0; i < enteros2.size(); i++) {
			if (enteros2.get(i) % 2 == 0) {
				enterosSinPares.add(i);
			}
		}
		System.out.println("ArrayList final, sin números pares: ");
		System.out.println(enterosSinPares);
	}

}
