package prova01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ex21_armazenarInformacoes {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma lista de números aleatórios para ordenar: ");
        
        while(true) {
            System.out.print("Digite um número (ou 'fim' para terminar): ");
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                // Converte a entrada para inteiro
                int numero = Integer.parseInt(input);
                // Adiciona o número à lista
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        
        // Ordenar a lista
        Collections.sort(numeros);

        System.out.println("Lista de números ordenada:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Fecha o scanner
        scanner.close();
    }


}


