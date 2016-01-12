
public class Salute {
	
	public static double calcoloMetabolismo(Persona p){
		double MB = 0.0;
		
		if(p.sesso == 1){ 			//maschio
			MB = 655 + (13.8 * p.peso) + (1.8 * p.altezza) * (4.7 * p.anni);
		}else if(p.sesso == 2){		//femmina
			MB = 655 + (9.6 * p.peso) + (1.8 * p.altezza) * (4.7 * p.anni);
		}
		
		switch (p.attivitaFisica) {
			case 1:
				return MB + ((MB / 100) * 20);
			case 2:
				return MB + ((MB / 100) * 30);
			case 3:
				return MB + ((MB / 100) * 40);
			case 4:
				return MB + ((MB / 100) * 50);
		}
		
		return MB;
		
	}
	
}
