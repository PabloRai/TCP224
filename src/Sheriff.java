
public class Sheriff extends Personaje {
	
	public Sheriff(int x, int y) {
		super(10, x,y);
		
	}
	
//	public Arma devolverArma(){
//		return arma;
//	}
	@Override
	public boolean disparar(Peleable atacando,Peleable atacado){
		if(puedoDisparar(atacado)){
			atacado.setSalud(atacado.getSalud() - atacando.devolverArma().getDaño(this));
			return true;
		}
		return false;
	}


}
