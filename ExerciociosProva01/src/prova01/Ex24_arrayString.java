package prova01;

import java.io.*;

public class Ex24_arrayString {

	public static void main(String[] args) {
		// Escrever um programa que grava um array de strings em um arquivo, com cada string em uma nova linha.
		
		 try {
	            // Escrever em um arquivo
	            BufferedWriter writer = new BufferedWriter(new FileWriter("teste4.txt"));
	            
	            
	            String line[] = {"Ola mundo word", "Jesus te ama", "Brasil medalha de ouro"};
	            
	            for(int i=0; i < line.length; i++){
	            	writer.write(line[i]);
	            	writer.newLine();
	            }
	            writer.close();
	            
	            System.out.println("Array de strings adicionada ao arquivo com sucesso !!!");
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}

