package pistolerosYArmas;

public class Main {

	public static void main(String[] args) {
		Personaje rg = new Renegado(4,3);
		Personaje sh = new Sheriff(4,4);
		rg.agarrarArma(new Derringer());
		sh.agarrarArma(new Colt45());
		rg.disparar(sh);
		rg.disparar(sh);
		rg.recargar();
		rg.disparar(sh);
		rg.disparar(sh);
		rg.recargar();
		rg.disparar(sh);
		rg.disparar(sh);
		rg.recargar();
		rg.disparar(sh);
		rg.disparar(sh);
		rg.recargar();
		}
	

}
