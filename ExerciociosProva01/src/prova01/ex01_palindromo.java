package prova01;

public class ex01_palindromo {

	public static void main(String[] args) {
		String palindromo = "ana";
	    int cont = 0; 
	    
	    for(int i = 0; i < palindromo.length(); i++){
	        
	        if(palindromo.charAt(i) == palindromo.charAt(palindromo.length()-i-1))
	        {
	            cont = cont + 1;    
	        }
	    }
	    
	     if(cont == palindromo.length()){
	         System.out.print("Essa palavra é um palindro!");
	     }else{
	         System.out.print("Não é palindromo.");
	     }
	}
}
