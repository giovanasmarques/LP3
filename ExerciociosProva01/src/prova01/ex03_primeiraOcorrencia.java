package prova01;

public class ex03_primeiraOcorrencia {

	public static void main(String[] args) {
		String frase = "amo meu namorado";
		
	    char caracter = 'o';
	    
	    for(int i = 0; i < frase.length(); i++){
	        
	        if(frase.charAt(i) == caracter)
	        {
	            System.out.println("Primeira ocurrencia do caracter na posição " + i);
	        }
	    }

	}

}
