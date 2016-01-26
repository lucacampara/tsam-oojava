package campara.luca.commercialista;

public class Dipendente extends Cliente{

	public Dipendente(String nome, String cognome, String CF) {
		super(nome, cognome, CF);
	}

	@Override
	public double getParcella(){
		return 50.0;
	}
	
	
}
