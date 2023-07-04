package ejercicioTema7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListString {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Lobo");
		lista.add("Jack London");
		lista.add("Colmillo Blanco");
		
		System.out.println("Recorriendo ArrayList: ");
		for (String e : lista) {
			System.out.println("	·" + e);
		}
		
		System.out.println();
		
		// Convierte un ArrayList en una LinkedList
		
		LinkedList<String> listaEnlazada = new LinkedList<String>(lista);  
		System.out.println("Recorriendo LinkedList: ");
		for (String e : listaEnlazada) {
			System.out.println("	·" + e);
		}
		
	}
}
