
public class Sheriff extends Personaje {
	
	public Sheriff(int x, int y) {
		super(10, x,y);
		
	}
	public int getDaño(){
		return arma.getDaño(this);
	}





}
