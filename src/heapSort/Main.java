package heapSort;

public class Main {
	public static void main(String [] args) {
		int [] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
		}
		
		System.out.println("Desordenado");
		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i] + " ");
		}
		
	}

}
