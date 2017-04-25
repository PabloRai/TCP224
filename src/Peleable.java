
public interface Peleable {
	public boolean disparar(Peleable atacando,Peleable atacado);
	public int getPosX();
	public int getPosY();
	public int getSalud();
	public void setSalud(int i);
	public Arma devolverArma();

}
