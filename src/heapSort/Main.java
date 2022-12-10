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

	private static void heap(int[] vetor, int n, int i){
		int raiz = i;
		int esquerda = 2*i + 1;
		int direita = 2*i + 2;
		
		if(esquerda < n && vetor[esquerda] > vetor[raiz]){
			raiz = esquerda;
		}
		
		if(direita < n && vetor[direita] > vetor[raiz]){
			raiz = direita;
		}
		
		if(raiz != i){
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			
			heap(vetor, n, raiz);
		}
	}

}
