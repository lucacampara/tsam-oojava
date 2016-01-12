import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		LinkedList<Alieno> lista = new LinkedList<>();
		System.out.println("***Gioco Alieni***\n");
		
		System.out.println("Inserisci il nome del giocatore: ");
		String nome = tastiera.nextLine();
		Giocatore g = new Giocatore(nome);
		
		System.out.println("Inserisci quanti alieni vuoi: ");
		int numero = tastiera.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("***Alieno numero " + i + "***");
			System.out.println("\nInserisci il danno dell'alieno:");
			int danno = tastiera.nextInt();
			tastiera.nextLine();
			
			System.out.println("\nInserisci il nome dell'alieno:");
			String nomeA = tastiera.nextLine();	
			lista.add(new Alieno(nomeA, danno));
		}
		tastiera.close();
		
		System.out.println("\nCreazione gioco...\n");
		Gioco gioco = new Gioco(g, lista);
		System.out.println("***Gioco finito***\n");
		System.out.println("Il livello di salute è: " + g.livelloSalute);
		System.out.println("Alla fine del gioco il giocatore è " + gioco.statoSalute());
		

	}

}
