package pistolerosYArmas;

public class Derringer extends Arma {
	private int durabilidad =8;
	
	public int getDurabilidad() {
		return durabilidad;
	}


	public Derringer() {
		super(1, 2, 1.5);
	}
	

	@Override
	public boolean recargar() {
		if(this.getBalas() == this.getCartucho() ||   seRompio())
			return false;
		this.setBalas(this.getCartucho());
		return true;
	}


	@Override
	public boolean descontarBalas() {
		if(this.getBalas() != 0 && !seRompio()){
			this.setBalas(this.getBalas() -1);
			durabilidad--;
			return true;
		}
		return false;
	}
	
	public boolean seRompio(){
		if(durabilidad == 0)
			return true;
		return false;
		
	}
	


}
