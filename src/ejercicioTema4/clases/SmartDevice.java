package ejercicioTema4.clases;

public abstract class SmartDevice {
	
	String fabricante;
	String modelo;
	String color;
	String sistemaOperaivo;
	int memoriaRam;
	int almacenamiento;
	double velocidadCPU;
	String tipoCPU;
	int bateria;
	
	// constructores
	
	public SmartDevice() {

	}
	
	public SmartDevice(String fabricante, String modelo, String color, String sistemaOperaivo, int memoriaRam,
			int almacenamiento, double velocidadCPU, String tipoCPU, int bateria) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.color = color;
		this.sistemaOperaivo = sistemaOperaivo;
		this.memoriaRam = memoriaRam;
		this.almacenamiento = almacenamiento;
		this.velocidadCPU = velocidadCPU;
		this.tipoCPU = tipoCPU;
		this.bateria = bateria;
	}
	
	// métodos

	public String toString() {
		return "SmartDevice [fabricante=" + fabricante + ", modelo=" + modelo + ", color=" + color
				+ ", sistemaOperaivo=" + sistemaOperaivo + ", memoriaRam=" + memoriaRam + ", almacenamiento="
				+ almacenamiento + ", velocidadCPU=" + velocidadCPU + ", tipoCPU=" + tipoCPU + ", bateria=" + bateria
				+ "]";
	}
}
