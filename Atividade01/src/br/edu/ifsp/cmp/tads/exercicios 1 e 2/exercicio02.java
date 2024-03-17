package br.edu.ifsp.cmp.tads.aula5;

//Crie uma lista de strings que represente uma lista de compras. Adicione alguns itens a lista e,

//em seguida, use um loop para imprimir todos os items. Finalmente remova um item da lista e imprima 

//a lista novamente para verificar se o item foi removido.



import java.util.ArrayList;

import java.util.List;



public class exercicio02 {


	public static void main(String[] args) {

		List<String> compras = new ArrayList<>();


		compras.add("Banana");

		compras.add("Maça");

		compras.add("Abacate");

		compras.add("Limão");

		compras.add("Cenoura");

		

		for(String itens : compras) {

			System.out.println(itens);

		}

		

		System.out.println("Removendo item: Maca");

		

		compras.remove(1);

		

		for(String itens : compras) {

			System.out.println(itens);

		}

	}

}

