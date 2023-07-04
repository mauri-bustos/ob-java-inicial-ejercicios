package ejercicioTema7_8_9;
import java.util.Scanner;

public class DividePorCero {
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		DividePorCero div1 = new DividePorCero();
		DividePorCero div2 = new DividePorCero();
		try {
			System.out.println(dividePorCero(div1, div2)) ;
		} catch (ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		} finally {
			System.out.println("Demo de código");
		}	
	}
	
	public static int dividePorCero(DividePorCero div1, DividePorCero div2) throws ArithmeticException { 
		
		System.out.print("Ingrese dos números enteros: ");
		 
			int a = div1.sc.nextInt();
			int b = div2.sc.nextInt();

		int resultado = 0;
		try {
			resultado = a / b;
		} catch (ArithmeticException e){
			throw new ArithmeticException();
		}
		return resultado;
	}	
}
