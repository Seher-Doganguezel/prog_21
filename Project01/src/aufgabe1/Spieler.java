package aufgabe1;

public class Spieler {
	
//Kommenatr
		private String name;
		private int punkte;
		
		
		public Spieler(String name)
		{
			this.name = name;
		
		}


		public String getName() 
		{
			return this.name;
		}


		public int getPunkte() 
		{
			return this.punkte;
		}

		public void erhohenPunkte(int punkte)
		{
			this.punkte += punkte;
		}

		public void punktZuruck()
		{
			this.punkte =0;
		}
		
		public boolean hatGewonnen() {
			if (this.punkte >= 20) {
				return true;
			}
			return false;
		}
		
}

