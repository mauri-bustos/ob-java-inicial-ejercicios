package ejercicioTema7_8_9;

import java.util.Arrays;

public class ArrayBidimiensional {

	public static void main(String[] args) {
		
		// Mostrar indice de un array uniDimensional
		
//		Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		
//			for (int j = 0; j < array1.length; j++) {
//				int indice = array1[j];
//				System.out.println(Arrays.asList(array1).indexOf(indice));
//			}
		
		// Mostrar indice de un array biDimensional
		
		Integer [][] enteros = new Integer[3][3];
		
		enteros[0][0] = 1;
		enteros[0][1] = 2;
		enteros[0][2] = 3;
		enteros[1][0] = 4;
		enteros[1][1] = 5;
		enteros[1][2] = 6;
		enteros[2][0] = 7;
		enteros[2][1] = 8;
		enteros[2][2] = 9;
		
		

		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Estas en la fila " + i);
			for (int j = 0; j < enteros[i].length; j++) {
				int elemento = enteros[i][j];
				System.out.println("Elemento: " + elemento + " " + " Posición: " + 
				Arrays.asList(enteros).indexOf(enteros[i]) + " " +
				Arrays.asList(enteros[i]).indexOf(elemento));
				
			}
		}
				
	}
	
}
