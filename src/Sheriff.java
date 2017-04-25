
public class Sheriff extends Personaje {
	
	public Sheriff(int x, int y) {
		super(10, x,y);
		
	}
	@Override
	public Arma devolverArma(){
		return arma;
	}
	@Override
	public boolean disparar(Peleable atacado){
		if(puedoDisparar(atacado)){
			atacado.setSalud(atacado.getSalud() - this.arma.getDaño(this));
			return true;
		}
		return false;
	}


}
