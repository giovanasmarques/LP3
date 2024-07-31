package prova01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex16_listaTarefas {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
        Scanner ler = new Scanner(System.in);
        String leitura = "0";
        String valor = "";
        
        while (leitura.charAt(0) != '4'){
		    System.out.println("1 - Adicione na lista");
		    System.out.println("2 - Remova da lista");
		    System.out.println("3 - Veja a lista");
		    System.out.println("4 - Sair");
		    System.out.printf("Escolhe a opcao: \n");
	            leitura = ler.nextLine();
	        	
	        	if(leitura.charAt(0) == '1'){
	        		System.out.printf("Informe o nome que deseja adicionar: \n");
	            		valor = ler.nextLine();
	                	list.add(valor);
	        	}else if(leitura.charAt(0) == '2'){
	        		System.out.printf("Informe a posição que deseja remover: \n");
	            		valor = ler.nextLine();
	            		int val = Integer.parseInt(valor);
	            		if(val >= list.size()){
	            	  	  System.out.println("Valor inválido");
	            		}else{
	                    	list.remove(val);
	            		}
	        	}else if(leitura.charAt(0) == '3'){
	  	              System.out.println(list);
	        	}
		}

	}

}
