package prova01;

public class Ex09_maiorNumero {

	public static void main(String[] args) {
		
		int valores[] = {4, 411, 11, 7, 12, 28, 3, 23, 9, 21};
		
	    int maior = 0;
	    
	    for(int i = 0; i < valores.length; i++){
	        if(valores[i] > maior){
	            maior = valores[i];
	        }
	    }
	    
	    System.out.print("O maior número é: " + maior);
	}

}


