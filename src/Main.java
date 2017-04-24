
public class Main {

	public static void main(String[] args) {
		Aguacil ag = new Aguacil(4,3);
		Sheriff sh = new Sheriff(4,3);
		ag.agarrarArma(new Colt45());
		sh.agarrarArma(new Colt45());
		System.out.println(ag.devolverArma().getDaño(ag));
		System.out.println(sh.devolverArma().getDaño(sh));
	}

}
