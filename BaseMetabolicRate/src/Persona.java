
public class Persona {
	int altezza;
	int peso;
	int anni;
	int attivitaFisica;		//1 -> sedentario, .....  4 -> molto attivo
	int sesso;				//1 -> maschio, 2 -> femmina
	
	public Persona(int altezza, int peso, int anni, int attivita, int sesso){
		this.altezza = altezza;
		this.peso = peso;
		this.anni = anni;
		this.attivitaFisica = attivita;
		this.sesso = sesso;
	}
	
}
