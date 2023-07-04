package ejercicioTemaFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		String palabra = "";
		String [] palabras = new String [0];
		try {
			InputStream fichero = new FileInputStream("/home/mauricio/dev/copia.txt");
			try {
				byte[] datos = fichero.readAllBytes();
				fichero.close();
				for (byte dato : datos) {
						palabra = palabra.concat(String.valueOf((char)dato));
				}
				palabras = palabra.split(" ");
				System.out.println(palabra);
				for (int i = 0; i < palabras.length; i++) {
					palabras[i] = palabras[i].replaceAll("[^\\w+]", "");
					//System.out.println(palabras[i]);
				}
			} catch (IOException e) {
				System.out.println("No se puede leer el archivo:" + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede encontrar el archivo: " + e.getMessage());
		}
		
		
		HashMap <Integer, String> mapa = new HashMap<>();
		
		int index = 0;
		for (int i = 0; i < palabras.length; i++) {
			mapa.put(index += 2, palabras[i]);
		}
		
		for (Map.Entry elemento : mapa.entrySet()) {
			//System.out.println(elemento.getValue());
			System.out.println(elemento.getValue());
		}
				
		try {
			PrintStream salida = new PrintStream("/home/mauricio/dev/archivoDeSalida.txt");	
			salida.print(mapa);
			salida.print("Fin");
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se reconoce archivo de salida: " + e.getMessage());
		}	
	}	
}
