import java.util.LinkedList;

public class Gioco {
	Giocatore giocatore;
	LinkedList<Alieno> listaAlieno;
	
	public Gioco(Giocatore g, LinkedList<Alieno> lista){
		this.giocatore = g;
		this.listaAlieno = lista;
		gioca();
	}
	
	private void gioca(){
		for(Alieno a : listaAlieno){
			giocatore.attacco(a.dannoProdotto);
		}
	}
	
	public String statoSalute(){
		if (giocatore.getSalute() > 0) {
			return "vivo";
		}
		return "morto";
	}
	
	
	/**
	 * @return true se è vivo, false se è morto
	 */
	public boolean statoSaluteB(){
		if (giocatore.getSalute() > 0) {
			return true;
		}
		return false;
	}

}
