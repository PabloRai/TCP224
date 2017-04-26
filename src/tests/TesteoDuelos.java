package tests;

import pistolerosYArmas.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteoDuelos {

	@Test
	public void disparoBasico() {
		Personaje sh = new Sheriff(4,4);
		Personaje al = new Alguacil(4, 5);
		sh.agarrarArma(new Colt45());
		Assert.assertTrue(sh.disparar(al));
		Assert.assertEquals(1, al.getSalud());
	}

}
