package pistolerosYArmas;
public abstract class Personaje {
	private int salud;
	private int posX;
	private int posY;
	protected Arma arma;
	public Personaje(int salud,int x,int y) {
		this.salud = salud;
		this.posX = x;
		this.posY = y;
		this.arma = null;
		
	}
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public boolean puedoDisparar(Personaje atacado){
		return (salud > 0 && distancia(atacado) && arma!=null && arma.descontarBalas() && !arma.seRompio());
	}
	
	public boolean disparar(Personaje atacado){
		if(puedoDisparar(atacado)){
			atacado.recibirDaño(this.getDaño());
			return true;
		}
		return false;
	}
	public Arma devolverArma() {
		return arma;
	}
	public void agarrarArma(Arma arma) {
		this.arma = arma;
	}
	public int getDaño(){
		return 1;
	}
	private boolean distancia(Personaje atacado){
		return (Math.sqrt(Math.pow(posX-atacado.getPosX(), 2)+Math.pow(posY-atacado.getPosY(), 2)) <= this.arma.getRango()) ? true : false;
		
	}
	private void recibirDaño(int daño){
		this.salud-=daño;
	}
	
}
