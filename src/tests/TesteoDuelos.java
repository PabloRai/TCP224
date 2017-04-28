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
	
	@Test
	public void dueloSheriffAlguacil(){
		Personaje sh = new Sheriff(4,4);
		Personaje al = new Alguacil(4, 5);
		sh.agarrarArma(new Colt45());
		al.agarrarArma(new Colt45());
		Assert.assertTrue(sh.disparar(al));
		Assert.assertTrue(al.disparar(sh));
		Assert.assertTrue(sh.disparar(al));
		Assert.assertEquals(0, al.getSalud());
		// Alguacil murio 
		Assert.assertFalse(al.disparar(sh));
	}
	
	@Test
	public void dueloSheriffAlguacilSinColt(){
		Personaje sh = new Sheriff(4,4);
		Personaje al = new Alguacil(4, 5);
		sh.agarrarArma(new Derringer());
		al.agarrarArma(new Colt45());
		Assert.assertTrue(sh.disparar(al));
		Assert.assertTrue(al.disparar(sh));
		Assert.assertTrue(sh.disparar(al));
		// Out of bullets 
		Assert.assertFalse(sh.disparar(al));
		Assert.assertTrue(sh.recargar());
		Assert.assertTrue(sh.disparar(al));
		Assert.assertEquals(3, al.getSalud());
		

	}

}
