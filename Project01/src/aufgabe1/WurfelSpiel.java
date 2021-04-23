package aufgabe1;

import java.util.Random;

// 	FEHLER BEIM VERSUCH X ZU DRUECKEN GEHT DAS SPIEL WEITER

import javax.swing.JOptionPane;

public class WurfelSpiel {				//FFEHLEweq

	public static void main(String[] args) {
		
		int anZspieler = Integer.valueOf(JOptionPane.showInputDialog("Wie viele Spieler nehmen teil"));
		Spieler[] spieler = new Spieler[anZspieler];

		for (int i = 0; i < anZspieler; i++) {
			char c = (char) ('A' + i);
			spieler[i] = new Spieler("" + c);
		}

		
		for (int i = 0; i < anZspieler; i++) {// 0 1 2 3 0 1 2 0 3 1 2 3
			Spieler s = spieler[i]; // Referenzvariable s
			System.out.println(s.getName() + " ist dran ");

			
			Random r = new Random();
			int versuch = r.nextInt(6) + 1; // welche zahl ich gewürfelt habe

			System.out.println("Gewürfelt: " + versuch);

			if (versuch == 6) {
				s.punktZuruck();
			} else {
				int auswahl = JOptionPane.showConfirmDialog(null, s.getName() + " wollen sie weiter wuerfeln?",
						"cube game", JOptionPane.YES_NO_OPTION);
						
				if (auswahl == 0) {
					// Spieler macht weiter
					i--;
				}
				
			else{
					// Spieler will nicht weiter machen
					if (i == anZspieler - 1) 
					{
						// letzter Spieler ist dran
						i = -1;
					}
				}
					s.erhohenPunkte(versuch);
					// Pruefe ob Spiel gewonnen wurde
					
						if (s.hatGewonnen()) {
							System.out.println(s.getName() + " hat gewonnen!");
							break;
				}
			}

		}
	}

}
