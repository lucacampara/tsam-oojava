package campara.luca.commercialista;

public class Commercialista {
	
	private Cliente[] listaClienti;
	
	public double incassoTotale(){
		double tot = 0;
		for( Cliente c : listaClienti){
			tot += c.getParcella();
		}
		return tot;
	}

	public Cliente[] getListaClienti() {
		return listaClienti;
	}

	public void setListaClienti(Cliente[] listaClienti) {
		this.listaClienti = listaClienti;
	}

}
