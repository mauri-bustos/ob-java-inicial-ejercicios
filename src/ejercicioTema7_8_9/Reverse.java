package ejercicioTema7_8_9;

public class Reverse {
	
	public static void main(String[] args) {
		reverse("Hola Mundo");
	}
	
	public static String reverse(String texto) {
		
		String cadena = texto;
		System.out.println(cadena);
		for (int i = cadena.length() -1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		return cadena;
	}

}
