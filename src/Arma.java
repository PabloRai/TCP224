
public abstract class Arma {
	private int daño;
	private int cartucho;
	private double rango;
	private int balas;
	public abstract boolean recargar();
	public abstract boolean descontarBalas();
	public abstract boolean seRompio();
	
	public Arma(int daño, int cartucho, double rango) {
		
		this.daño = daño;
		this.cartucho = cartucho;
		this.rango = rango;
		this.balas=cartucho;
		
	}

	public  int getDaño(Peleable asd){
		return daño;
	}
	
	public void setDaño(int daño) {
		this.daño = daño;
	}
	public int getCartucho() {
		return cartucho;
	}
	public void setCartucho(int cartucho) {
		this.cartucho = cartucho;
	}
	public double getRango() {
		return rango;
	}
	public void setRango(double rango) {
		this.rango = rango;
	}
	public int getBalas() {
		return balas;
	}
	public void setBalas(int balas) {
		this.balas = balas;
	}

	
	
}
