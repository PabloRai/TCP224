package pistolerosYArmas;

public class Winchester extends Arma {
	private boolean puedoDisparar=true;
	public Winchester() {
		super(3, 2, 4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean recargar() {
		if(this.getBalas() == this.getCartucho())
			return false;
		this.setBalas(this.getCartucho());
		puedoDisparar=false;
		return true;
	}


	@Override
	public boolean descontarBalas() {
		if(!puedoDisparar){
			puedoDisparar = true;
			return false;
		}
		if (this.getBalas() > 0)
			this.setBalas(this.getBalas() -1);
		return true;
	}

	@Override
	public boolean seRompio() {
		// TODO Auto-generated method stub
		return false;
	}

}
