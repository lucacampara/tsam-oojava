import java.util.LinkedList;

public class GestioneContabile {
	
	public static void main(String[] args){
		
		LinkedList<Dipendente> listaDipendenti = new LinkedList<>();
		
		//creo l'azienda
		Azienda azienda1 = new Azienda("SPA", listaDipendenti);
		
		//creo i contratti
		Contratto c1 = new Contratto(10000000, "contratto 1");
		Contratto c2 = new Contratto(2500000, "contratto 2");
		Contratto c3 = new Contratto(7500000, "contratto 3");
		
		//creo i dipendenti
		Dipendente d1 = new Dipendente("mario", "rossi", 1, c1);
		Dipendente d2 = new Dipendente("gianni", "bianchi", 15, c2);
		Dipendente d3 = new Dipendente("luigi", "verdi", 33, c3);
		Dipendente d4 = new Dipendente("carlo", "gialli", 7, c1);
		Dipendente d5 = new Dipendente("bepi", "blu", 29, c2);
		
		//aggiungo i dipendenti all'azienda
		azienda1.addDipendente(d1);
		azienda1.addDipendente(d2);
		azienda1.addDipendente(d3);
		azienda1.addDipendente(d4);
		azienda1.addDipendente(d5);
		
		azienda1.printDipendenti();
		
		System.out.println("Somma degli stipendi dei dipendenti: " + azienda1.sommaStipendi()/100 + "€");
	}
}
