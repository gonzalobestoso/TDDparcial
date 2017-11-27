
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
			puntos += tiros[tirosindice] + tiros[tirosindice + 1];
			tirosindice +=2;
			
		}
		return puntos;
	}

}
