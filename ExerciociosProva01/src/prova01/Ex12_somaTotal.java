package prova01;

import java.util.Scanner;

public class Ex12_somaTotal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a sequência de numeros, com a diferença de um espaço de um para o outro:\n");
        String leitura = ler.nextLine();
        
		String numeros[] = leitura.split(" ");
		double soma = 0;
		
		for(int i = 0; i < numeros.length; i++){
		    soma += Double.parseDouble(numeros[i]);
		}
		
		System.out.println("A soma dos números é " + soma);
	}

}


