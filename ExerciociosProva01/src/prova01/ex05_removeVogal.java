package prova01;

public class ex05_removeVogal {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Jesus vive e reina para sempre :D");
        String palavra = sb.toString();
        int qtdDel = 0;
        
        
        for(int i = 0; i < palavra.length(); i++){
	        
	        if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' ||palavra.charAt(i) == 'i'|| palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u')
	        {  
	            sb.delete(i-qtdDel, i+1-qtdDel);
	            qtdDel += 1;
	        }
	    }

        
        System.out.println(sb.toString());
	}
}


