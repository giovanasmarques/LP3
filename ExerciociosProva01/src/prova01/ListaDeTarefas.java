package prova01;

import java.util.Scanner;


public class ListaDeTarefas {
	static GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		
		while(true) {
			System.out.println("1. Adicionar Tarefa");
			System.out.println("\n2. Remover Tarefa");
			System.out.println("\n3. Listar Tarefas");
			System.out.println("\n4. Sair");
			System.out.println("\nEscolha uma opção: ");
			
			int escolha = scanner.nextInt();
			scanner.nextLine();
			
			switch(escolha) {
			case 1:
				adicionarTarefa();
				break;
			case 2:
				removerTarefa();
				break;
			case 3:
				listarTarefas();
				break;
			case 4:
				System.out.println("Até mais!");
				return;
			default:
				System.out.println("Digite uma opção válida!");		
				
			}
		}
			

	}
	 private static void adicionarTarefa() {
	        System.out.print("Digite a tarefa para adicionar: \n");
	        String tarefa = scanner.nextLine();
	        gerenciador.adicionarTarefa(tarefa);
	    }

	    private static void removerTarefa() {
	        System.out.print("Digite o índice da tarefa para remover: \n ");
	        int indice = scanner.nextInt();
	        scanner.nextLine();  // Consumir a nova linha
	        
	        gerenciador.removerTarefa(indice);
	    }

	    private static void listarTarefas() {
	        gerenciador.listarTarefa();
	    }


}
