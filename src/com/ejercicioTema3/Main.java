package com.ejercicioTema3;

public class Main {
	
	public static void main(String[] args) {
	
		String[] palabras = {"estoy", "aprendiendo", "JAVA", "con", "openBootcamp"};
		
		// concatenando con forEach
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}
		
		System.out.println();
		
		
		// concatenando con for
		for(int i = 0; i < palabras.length; i++) {
			System.out.print(palabras[i] + " ");
		}
	}
	
	
	
}
