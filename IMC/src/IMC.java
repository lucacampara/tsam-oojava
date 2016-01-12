import java.util.*;

public class IMC {
	
	public static void main(String[] args){
		Scanner tastiera = new Scanner(System.in);
		System.out.println("***Calcolo Indice di Massa Corporea***\n");
		System.out.println("1. Inserisci la tua altezza [cm]:");
		int altezza = tastiera.nextInt();
		
		System.out.println("\n2. Inserisci il tuo peso [kg]:");
		int peso = tastiera.nextInt();
		
		tastiera.close();
		
		Persona p = new Persona(altezza, peso);
		
		System.out.println("\n\nIl tuo indice di massa corporea dice che sei: " + Salute.calcoloIMC(p));
	}
}
