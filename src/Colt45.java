
public class Colt45 extends Arma {

	public Colt45() {
		super(2, 6, 10);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean recargar() {
		if(this.getBalas() == this.getCartucho())
			return false;
		this.setBalas(this.getCartucho());
		return true;
	}


	@Override
	public boolean descontarBalas() {
		if(this.getBalas() != 0){
			this.setBalas(this.getBalas() -1);
			
			return true;
		}
		return false;
	}
	
	
	public int getDaño(Sheriff sh){
		return 5;
	}

	@Override
	public boolean seRompio() {
		// TODO Auto-generated method stub
		return false;
	}



}
