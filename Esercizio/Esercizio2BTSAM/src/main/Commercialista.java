package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Gestisce le parcelle dei propri Clienti.
 *
 */
public class Commercialista {
	
	Map<String, Integer> listaClienti = new HashMap<String, Integer>();	//l'intero rappresenta il numero di volte che Ë stato inserito
	ArrayList<Cliente> clienti = new ArrayList<>();		//lista di clienti con anche i duplicati
	

	/**
	 * Calcola il totale delle parcelle di tutti i clienti univoci (ovvero NON
	 * vengono considerati le parcelle di eventuali clienti duplicati). 
	 * @return il totale delle parcelle
	 */
	public int totaleParcelle() {
		int totaleParcelle = 0;
		
		Set<Cliente> set = new HashSet<>();	//metto tutti i clienti in un set (avr‡ solo clienti univoci)
		for (Cliente c : clienti){
			set.add(c);
		}	
		
		for (Cliente c : set){
			totaleParcelle += c.calcolaParcella();
		}
		
		return Math.round(totaleParcelle);
	}
	
	public int getClienti(){
		return listaClienti.size();
	}
	
	/**
	 * Inserisce un nuovo cliente, verificando che
	 * non sia gi√† stato inserito.
	 * @param d dipendente
	 */
	public void addCliente(Cliente d) {

		if (listaClienti.containsKey(d.getCF())) {	//il cliente Ë gi‡ contenuto
			int i = listaClienti.get(d.getCF());
			i += 1;
			listaClienti.replace(d.getCF(), i);				
		} else {
			listaClienti.put(d.getCF(), 1);
			clienti.add(d);
		}
		
	}
	
	
	/**
	 * Restituisce il numero di volte che all'atto dell'inserimento di
	 * un cliente, il cliente era gi√† stato inserito. 
	 * @return
	 */
	public int clientiDuplicati() {
		int numeroClienti = 0;
		Collection<Integer> list = listaClienti.values();
		for (Integer i : list) {
			if (i > 1)
				numeroClienti += (i-1);
		}
		return numeroClienti;
	}
	
	/**
	 * Dato un cliente, restituisce il numero di volte che lo stesso
	 * cliente √® stato inserito tramite le funzione addCliente.
	 * Nel caso che un dato cliente sia stato inserito una sola volta,
	 * restituisce il valore 1. 
	 * @param d cliente da verificare
	 * @return numero di ripetizioni.
	 */
	public int numeroRipetizioni(Cliente d) {
		return listaClienti.get(d.getCF());
	}

}
