package campara.luca.commercialista;

public class Cliente {
	
	private String nome,
					cognome,
					codiceFiscale;
	
	
	public Cliente(String nome, String cognome, String CF){
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = CF;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public double getParcella(){
		return 0;
	}
	
	
}
