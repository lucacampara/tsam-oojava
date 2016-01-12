
public class Dipendente {
	String nome,
		cognome;
	int anzianita;
	Contratto contratto;
	
	public Dipendente(String nome, String cognome, int anzianita, Contratto c){
		this.nome = nome;
		this.cognome = cognome;
		this.anzianita = anzianita;
		this.contratto = c;
	}
	
	public double calcoloStipendio(){
		int stipendioBase = contratto.stipendioBaseAnnuo;
		return stipendioBase + (((stipendioBase / 100) * 0.5) * anzianita);
	}
	
	public String toString(){
		return "\n***Scheda dipendente***\nNome: " + this.nome + "\nCognome: " + this.cognome + "\nAnni di anzianità: " + this.anzianita + "\nStipendio: " + calcoloStipendio()/100 + "€";
	}
}
