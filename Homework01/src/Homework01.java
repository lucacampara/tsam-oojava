
public class Homework01 {

	
	static int sumPos(int[] array){
		int somma = 0;
		for(int i = 0; i < array.length; i++){
			if(array[i] >= 0){
				somma += array[i];
			}else{
				return somma;
			}
		}
		return somma;
	}
	
	static int sumOdd(int n){
		if(n == 0){
			return 0;
		}
		int somma = 0;
		int dispari = 1;
		for(int i = 0; i < n; i++){
			somma += dispari;
			dispari += 2;
		}
		return somma;
	}
	
	static double average(int[] array){
		double somma = 0.0;
		for(int i = 0; i < array.length; i++){
			somma += array[i];
		}
		return somma/array.length;
	}
	
	static int sumRange(int a, int b){
		int minimo = Math.min(a, b);
		int massimo = Math.max(a, b);
		int somma = 0;
		
		while(minimo != massimo){
			somma += minimo;
			minimo++;
		}
		
		return somma + massimo;
	}
	
	
	/*public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("somma: " + sumRange(3, 5));
	}*/
}
