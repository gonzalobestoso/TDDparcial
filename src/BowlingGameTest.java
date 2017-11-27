
import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingGameTest {

	BowlingGame juego;
	

	public void inicializar(){
		juego = new BowlingGame();
	}
	@Test
	public void TirarNada() {
		 
	TirarVarios(0,20);
		assertEquals(0,juego.getScore());
	}

	@Test
	public void TiraUnoSolo() {
		
		TirarVarios(1,20);
		assertEquals(20,juego.getScore());
	}

	public void TirarVarios(int pinos, int tiros){
		for (int i=0; i<tiros; i++){
			juego.tiros(pinos);
			
			
		}
	}
	
	@Test
	public void HacerSpare(){
		juego.tiros(5);
		juego.tiros(5);
		juego.tiros(3);
		TirarVarios(0,17);
		assertEquals(16, juego.getScore());
	}
	
	@Test
	public void HacerStrike(){
		juego.tiros(10);
		juego.tiros(4);
		juego.tiros(3);
		TirarVarios(0,16);
		assertEquals(24, juego.getScore());
	}
	@Test
	
		public void JuegoPerfecto(){
			TirarVarios(10,12);
			assertEquals(300,juego.getScore());
		}
		
		
	
	
	
}

