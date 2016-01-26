package campara.luca.commercialista;

public class LiberoProfessionista extends Cliente{
	
	private String partitaIva;
	private int numeroFatture;

	public LiberoProfessionista(String nome, String cognome, String CF, String piva, int nFatture) {
		super(nome, cognome, CF);
		this.partitaIva = piva;
		this.numeroFatture = nFatture;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	@Override
	public double getParcella(){
		return 50.0 + (getNumeroFatture() * 0.5);
	}
	
	
}
