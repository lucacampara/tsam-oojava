import java.util.*;

public class BaseMetabolicRate {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("***Calcolo Metabollismo di Base***\n");
		System.out.println("1. Inserisci la tua altezza [cm]:");
		int altezza = tastiera.nextInt();
		
		System.out.println("\n2. Inserisci il tuo peso [kg]:");
		int peso = tastiera.nextInt();
		
		System.out.println("\n3. Inserisci la tua età:");
		int anni = tastiera.nextInt();
		
		System.out.println("\n4. Inserisci il tuo tipo di attività fisica:\n     1 = sedentario \n     2 = moderatamente attivo \n     3 = attivo \n     4 = molto attivo");
		int attivita = tastiera.nextInt();
		
		System.out.println("\n5. Inserisci il tuo sesso:\n     1 = maschio\n     2 = femmina");
		int sesso = tastiera.nextInt();
		
		tastiera.close();
		
		Persona p = new Persona(altezza, peso, anni, attivita, sesso);
		
		System.out.println("\nIl tuo metabolismo di base è: " + Salute.calcoloMetabolismo(p));

	}

}
