package ejercicioTema4.clases;

import ejercicioTema4.herencia.SmartPhone;
import ejercicioTema4.herencia.SmartWatch;

public class Main {
	
	public static void main(String[] args) {
		
		SmartDevice galaxyS23 = new SmartPhone("Samsung", "Galaxy s23", "Platinuim", "Android", 12,256, 3.66, "Octa-core", 5000);
		System.out.println(galaxyS23.toString());
		
		System.out.println();
		
		SmartDevice galaxyWatch5 = new SmartWatch("Samsung", "Watch5", "Black", "Wear OS Powered by Samsung", 2, 16,1.18, "Dual-Core", 590);
		System.out.println(galaxyWatch5.toString());
		
		
	}

}
