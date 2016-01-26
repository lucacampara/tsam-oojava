package campara.luca.commercialista;

public class Imprenditore extends Cliente{
	private String partitaIva,
					ragioneSociale;
	private int numeroFatture;

	public Imprenditore(String nome, String cognome, String CF, String piva, String ragSociale, int nFatture) {
		super(nome, cognome, CF);
		this.partitaIva = piva;
		this.ragioneSociale = ragSociale;
		this.numeroFatture = nFatture;
		
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	@Override
	public double getParcella(){
		if (getNumeroFatture() <= 100) { 
			return 500.0;
		} 
		return 500.0 + (getNumeroFatture() - 100.0); 
	}
	
	
	
}
