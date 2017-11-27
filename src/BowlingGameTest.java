
import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingGameTest {

	@Test
	public void TirarNada() {
		BowlingGame juego = new BowlingGame();
		for (int i =0; i<20; i++){
			juego.tirar(0);
		}
		assertEquals(0,juego.getScore());
	}

}
