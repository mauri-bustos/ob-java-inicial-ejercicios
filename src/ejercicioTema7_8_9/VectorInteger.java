package ejercicioTema7_8_9;

import java.util.Vector;

public class VectorInteger {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		
		vector.remove(1);
		vector.remove(1);
		System.out.println("Se muestran los elementos 1, 4 y 5" + vector);
	}
	
	// El Vector por defecto se inicializa como un array de 10 elemento. Cada vez que se sobrepasa la capacidad del vector,
	// se crea una copia del vector actual y se pega en un nuevo Vector con el doble de capacidad . Durante el momento que
	// se crea esta copia tendremos dos arrays con igual cantidad de elementos. Si el array es muy grande tendremos un 
	// mayor de memoria. Si creamos un Vector de 1000 elementos con esta configuración, haremos que se creen muchas copias
	// innecesarias generando un mayor consumo de recursos.

}
