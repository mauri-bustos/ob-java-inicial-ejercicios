package ejercicioTema4.herencia;

import ejercicioTema4.clases.SmartDevice;

public class SmartPhone extends SmartDevice{

	public SmartPhone() {

	}

	public SmartPhone(String fabricante, String modelo, String color, String sistemaOperaivo, int memoriaRam,
			int almacenamiento, double velocidadCPU, String tipoCPU, int bateria) {
		super(fabricante, modelo, color, sistemaOperaivo, memoriaRam, almacenamiento, velocidadCPU, tipoCPU, bateria);
	}

	
	

}
