
public class BowlingGame {
	private int[] tiros = new int[21];
	private int tiroactual = 0;
	
	
	
	public void tiros(int pinos){
	
		tiros[tiroactual++]=pinos;
	}
	
	public int getScore(){
		int puntos = 0;
		int tirosindice = 0;
		for (int frameindice = 0; frameindice <10; frameindice ++){
			if (esStrike(tirosindice)){
				puntos += obtenerPuntajeStrike(tirosindice);
				tirosindice ++;
			} else if (esSpare(tirosindice)){
				puntos += obtenerpuntosSpare(tirosindice);
				tirosindice +=2;
			} else {
			puntos += obtenerPuntajeStandard(tirosindice);
			tirosindice +=2;
			
		}
		return puntos;
	}

}

	private int obtenerPuntajeStrike(int tirosindice) {
		return tiros[tirosindice] + tiros[tirosindice + 1] + tiros[tirosindice +2];
	}

	private boolean esStrike(int tirosindice) {
		return tiros[tirosindice]==10;
	}

	private int obtenerPuntajeStandard(int tirosindice) {
		return tiros[tirosindice] + tiros[tirosindice + 1];
	}

	private int obtenerpuntosSpare(int tirosindice) {
		return tiros[tirosindice] + tiros[tirosindice + 1] + tiros[tirosindice +2];
	}

	private boolean esSpare(int tirosindice) {
		return tiros[tirosindice] + tiros[tirosindice + 1] == 10;
	}
