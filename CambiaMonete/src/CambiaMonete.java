public class CambiaMonete {

int[] banconote;    //alla posizione 0 ci sono le banconote da 500, ...
	
	public CambiaMonete(){
		banconote = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}
	
	public int[] cifraInBanconote(int valore){
		if( valore != 0 ){
			if(valore >= 500){
				banconote[0]++;
				return cifraInBanconote(valore - 500);
			}
			if(valore >= 200){
				banconote[1]++;
				return cifraInBanconote(valore - 200);
			}
			if(valore >= 100){
				banconote[2]++;
				return cifraInBanconote(valore - 100);
			}
			if(valore >= 50){
				banconote[3]++;
				return cifraInBanconote(valore - 50);
			}
			if(valore >= 20){
				banconote[4]++;
				return cifraInBanconote(valore - 20);
			}
			if(valore >= 10){
				banconote[5]++;
				return cifraInBanconote(valore - 10);
			}
			if(valore >= 5){
				banconote[6]++;
				return cifraInBanconote(valore - 5);
			}
			if(valore >= 2){
				banconote[7]++;
				return cifraInBanconote(valore - 2);
			}
			if(valore >= 1){
				banconote[8]++;
				return cifraInBanconote(valore - 1);
			}
			
		}//end if
		
		return banconote;
	}
	
	public void stampaNumeroBanconote(){
		System.out.println("Banconote da 500€: " + banconote[0]);
		System.out.println("Banconote da 200€: " + banconote[1]);
		System.out.println("Banconote da 100€: " + banconote[2]);
		System.out.println("Banconote da 50€: " + banconote[3]);
		System.out.println("Banconote da 20€: " + banconote[4]);
		System.out.println("Banconote da 10€: " + banconote[5]);
		System.out.println("Banconote da 5€: " + banconote[6]);
		System.out.println("Banconote da 2€: " + banconote[7]);
		System.out.println("Banconote da 1€: " + banconote[8]);
	}
	
	public static void main(String[] args){
		System.out.println("***Prova Cambia Monete***\n");
		
		CambiaMonete cambia1 = new CambiaMonete();
		cambia1.cifraInBanconote(753);
		
		cambia1.stampaNumeroBanconote();
		
	}

}
