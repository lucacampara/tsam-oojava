
public class Salute {
	
	public static String calcoloIMC(Persona p){
		double IMC = p.peso / Math.pow((p.altezza/100.0), 2);
		
		if(IMC < 18.5){
			return "SOTTOPESO";
		}
		if (IMC >= 18.5 && IMC < 25) {
			return "NORMALE";
		}
		if (IMC >= 25 && IMC < 30) {
			return "SOVRAPPESO";
		}
		if (IMC > 30) {
			return "OBESO";
		}
		
		return "ERRORE";
	}
}
