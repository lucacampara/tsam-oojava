import java.util.LinkedList;

public class Azienda {
	
	String ragioneSociale;
	LinkedList<Dipendente> listaDipendenti;
	
	public Azienda(String ragione, LinkedList<Dipendente> dipendenti){
		this.ragioneSociale = ragione;
		this.listaDipendenti = dipendenti;
	}
	
	public void addDipendente(Dipendente d){
		listaDipendenti.add(d);
	}
	
	public void printDipendenti(){
		System.out.println("\n***Lista dipendenti dell'azienda***");
		for(Dipendente d : listaDipendenti){
			System.out.println(d.toString());
		}
	}
	
	public double sommaStipendi(){
		double somma = 0;
		
		for(Dipendente d : listaDipendenti){
			somma += d.calcoloStipendio();
		}
		
		return somma;
	}
	
	
}
