package prova01;

public class vogais {

	public static void main(String[] args) {
		String frase = "amo meu namorado";
		   int cont = 0; 
		    
		   for(int i = 0; i < frase.length(); i++){
		        
		       if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||frase.charAt(i) == 'i'|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u')
		       {
		           cont = cont + 1;    
		       }
		   }
		    
		    System.out.println("A frase contem "+cont+" vogais!");
	}
}

