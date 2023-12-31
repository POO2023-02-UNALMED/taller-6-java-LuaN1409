package vehiculos;

public class Camioneta extends Vehiculo{
	
	protected boolean volco;
	protected static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	public boolean isvolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
}