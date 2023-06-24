package ejercicioTema2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el precio");
		double precio = scanner.nextDouble();
		double precioFinal = calcularIva(precio);
		System.out.println(precioFinal);
		
	}
	
	static double calcularIva(double precio) {
		return precio + (precio * 0.21); // IVA de Argentina
	}

}
