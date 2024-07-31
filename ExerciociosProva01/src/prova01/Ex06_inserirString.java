package prova01;

public class Ex06_inserirString {

	public static void main(String[] args) {
		
		String palavra1 = "Pq Deus amou o mundo de não pereça, mas tenha a vida eterna";
		
	    String palavra2 = "tal maneira que deu seu filho para que todo Aquele que NEle crer ";
	    
        StringBuilder sb = new StringBuilder("");
        
        sb.append(palavra1);
        
        palavra1 = sb.insert(24, palavra2).toString();
        
        System.out.println(palavra1);
	}

}


