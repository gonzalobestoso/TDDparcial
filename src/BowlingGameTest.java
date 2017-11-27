
import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingGameTest {

	BowlingGame juego;
	

	public void inicializar(){
		juego = new BowlingGame();
	}
	@Test
	public void TirarNada() {
		 juego = new BowlingGame();
	TirarVarios(0,20);
		assertEquals(0,juego.getScore());
	}

	@Test
	public void TiraUnoSolo() {
		juego = new BowlingGame();
		TirarVarios(1,20);
		assertEquals(20,juego.getScore());
	}

	@Test
	public void HacerSpare(){
		juego.tiros(5);
		juego.tiros(5);
		juego.tiros(3);
		TirarVarios(0,17);
		assertEquals(16, juego.getScore());
	}
	
	
	public void TirarVarios(int pinos, int tiros){
		for (int i=0; i<tiros; i++){
			juego.tiros(pinos);
			
			
		}
	}
}

