
public class Main {

	public static void main(String[] args) {
		Alguacil ag = new Alguacil(4,3);
		Personaje sh = new Sheriff(4,4);
		ag.agarrarArma(new Winchester());
		sh.agarrarArma(new Colt45());
		//System.out.println(ag.devolverArma().getDaño(ag));
		System.out.println(sh.getDaño());
//		for (int i = 0; i < 4; i++) {
//			System.out.println(sh.disparar(ag));
//			sh.devolverArma().recargar();
//		}
		System.out.println(sh.disparar(ag));
		System.out.println(ag.getSalud());
	}

}
