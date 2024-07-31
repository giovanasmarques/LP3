package prova01;

public class ex10_converteString {

	public static void main(String[] args) {
		
		String listaStr[] = {"18", "21", "23", "4", "5", "12"};
		
		int vetor[] = new int[listaStr.length]; 
		
		for (int i = 0; i < listaStr.length; i++){
		    vetor[i] = Integer.parseInt(listaStr[i]);
		}
		
		
		for (int i = 0; i < vetor.length; i++){
		    System.out.println(vetor[i]);
		}

	}

}
