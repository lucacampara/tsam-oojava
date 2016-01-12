
public class Giocatore {
	String nome;
	int livelloSalute = 100;
	
	public Giocatore(String nome){
		this.nome = nome;
	}
	
	public void attacco(int danno){
		livelloSalute -= danno;
	}
	
	public int getSalute(){
		return livelloSalute;
	}
	
}


