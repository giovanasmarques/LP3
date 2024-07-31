package prova01;

import java.io.*;

public class Ex22_leituraArquivo {

	public static void main(String[] args) {
		
		
		try {
          
			File file = new File("C:/Users/Giovana Marques/eclipse-workspace/ExerciociosProva01/src/prova01/teste1.txt");
			
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Giovana Marques/eclipse-workspace/ExerciociosProva01/src/prova01/teste1.txt"));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
