package prova01;

import java.io.*;

public class Ex23_copiaArquivo {

	public static void main(String[] args) {
		// Desenvolver um programa que copia o conteúdo de um arquivo para outro.
		
		try {
            // Escrever em um arquivo
            BufferedWriter arq1 = new BufferedWriter(new FileWriter("teste2.txt"));
            arq1.write("I love Jesus");
            arq1.newLine();
            arq1.write("e meu namorado!!!.");
            arq1.close();

            // Ler de um arquivo
            BufferedReader reader = new BufferedReader(new FileReader("teste2.txt"));
            BufferedWriter arq2 = new BufferedWriter(new FileWriter("teste3.txt"));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
            	arq2.write(line);
            	arq2.newLine();
            }
            reader.close();
            arq2.close();
            System.out.println("Cópia de arquivos realizada com sucesso !!!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
