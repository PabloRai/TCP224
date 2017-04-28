package tests;

import org.junit.Assert;
import org.junit.Test;

import pistolerosYArmas.*;


public class TesteoDaños {

	@Test
	public void armaNull() {
		Personaje sh = new Sheriff(4,4);
		Assert.assertNull(sh.devolverArma());
	}
	
	@Test
	public void dañoSheriffColt(){
		Personaje sh = new Sheriff(4,4);
		sh.agarrarArma(new Colt45());
		Assert.assertEquals(5, sh.getDaño());
	}
	
	@Test
	public void dañoSheriffDerringer() {
		Personaje sh = new Sheriff(4,4);
		sh.agarrarArma(new Derringer());
		Assert.assertEquals(1, sh.getDaño());
	}
	
	@Test
	public void dañoSherifffWinchester() {
		Personaje sh = new Sheriff(4,4);
		sh.agarrarArma(new Winchester());
		Assert.assertEquals(3, sh.getDaño());
	}
	/////////////////////
	
	@Test
	public void dañoAlguacilColt(){
		Personaje sh = new Alguacil(4,4);
		sh.agarrarArma(new Colt45());
		Assert.assertEquals(2, sh.getDaño());
	}
	
	@Test
	public void dañoAlguacilDerringer() {
		Personaje sh = new Alguacil(4,4);
		sh.agarrarArma(new Derringer());
		Assert.assertEquals(1, sh.getDaño());
	}
	
	@Test
	public void dañoAlguacilWinchester() {
		Personaje sh = new Alguacil(4,4);
		sh.agarrarArma(new Winchester());
		Assert.assertEquals(3, sh.getDaño());
	}
	///////////////////
	
	@Test
	public void dañoRenegadoColt(){
		Personaje sh = new Renegado(4,4);
		sh.agarrarArma(new Colt45());
		Assert.assertEquals(2, sh.getDaño());
	}
	
	@Test
	public void dañoRenegadoDerringer() {
		Personaje sh = new Renegado(4,4);
		sh.agarrarArma(new Derringer());
		Assert.assertEquals(1, sh.getDaño());
	}
	
	@Test
	public void dañoRenegadoWinchester() {
		Personaje sh = new Renegado(4,4);
		sh.agarrarArma(new Winchester());
		Assert.assertEquals(3, sh.getDaño());
	}
	////////////////////////////////
	
	@Test
	public void romperDerringer(){
		Personaje rg = new Renegado(2,3);
		Personaje sh = new Sheriff(2,2);
		rg.agarrarArma(new Derringer());

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				Assert.assertTrue(rg.disparar(sh));
			}
			if(i!=3){
				Assert.assertTrue(rg.recargar());
			}
			else{
				//Se rompe la Derringer
				Assert.assertFalse(rg.recargar());
			}
		}
	}
	
	@Test
	public void perderTurnoWinchester(){
		Personaje al = new Alguacil(2,2);
		Personaje sh = new Sheriff(2,3);
		al.agarrarArma(new Winchester());
		Assert.assertTrue(al.disparar(sh));
		Assert.assertTrue(al.recargar());
		// No puedo disparar en el siguiente turno
		Assert.assertFalse(al.disparar(sh));
		Assert.assertTrue(al.disparar(sh));
		
	}
}
