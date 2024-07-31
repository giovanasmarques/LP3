package prova01;

public class ex04_stringBuilder {

	public static void main(String[] args) {
		 String vetorPalavras[] = {"Jesus", "vive"};
	        
	        StringBuilder sb = new StringBuilder("");
	        
	        for (int i = 0; i < vetorPalavras.length; i++){
	            sb.append(vetorPalavras[i]);
	        }
	        
	        System.out.println(sb.toString());
		}
}


