package ejercicioTema7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class FileInFileOut {
	
	public static void main(String[] args) {
		
		fileInFileOut ("/home/mauricio/dev/openBootcamp/ob-java-inicial-ejercicios/src/ejercicioTema7_8_9/archivo.txt", "/home/mauricio/dev/copia.txt"); 

	}
	
	public static void fileInFileOut(String fileIn, String fileOut) {
			
			try {
				InputStream fichero = new FileInputStream(fileIn);
				byte [] datos = fichero.readAllBytes();
				fichero.close();
				
				PrintStream out = new PrintStream(fileOut);
				out.write(datos);
				out.close();
			
			} catch (Exception e) {
				System.out.println("Fichero no existe " + e.getMessage());
			}
		}
}	
