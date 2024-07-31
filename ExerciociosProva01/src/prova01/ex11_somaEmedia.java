package prova01;

public class ex11_somaEmedia {

	public static void main(String[] args) {
		
		int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int media = 0;
		int soma = 0;
		
		for(int i = 0; i < lista.length; i++){
		    soma += lista[i];
		}
		
		media = soma/lista.length;
		
		System.out.println("Soma = " + soma + " e Média = " + media);

	}

}
