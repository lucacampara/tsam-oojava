package campara.luca.commercialista;

public class Main {
	
	public static void main(String[] args){
		Commercialista c = new Commercialista();
		Dipendente d1 = new Dipendente("gino", "gini", "ggniggnng25");
		Dipendente d2 = new Dipendente("guido", "bianchi", "gbnci522527h");
		Imprenditore i1 = new Imprenditore("franco", "franchi", "frch25629", "01561006540", "snc", 110);
		LiberoProfessionista l1 = new LiberoProfessionista("gianni", "rossi", "ggirss65424492", "01265456246", 50);
		
		Cliente[] lista = { i1};
		c.setListaClienti(lista);
		
		System.out.println("totale parcelle: " + c.incassoTotale());
	}
}
