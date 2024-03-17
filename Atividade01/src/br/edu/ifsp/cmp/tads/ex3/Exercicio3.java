package br.edu.ifsp.cmp.tads.ex3;

//3- Crie uma classe Planta com um método fotossintese(). Em seguida, crie
//duas classes, Flor e Arvore que herdam de Planta e sobrescrevem o
//metodo fotossintese().

public class Exercicio3 {
	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		Planta planta = new Planta();
		Flor flor = new Flor();
		
		flor.fotossintese();
		arvore.fotossintese();
		planta.fotossintese();
	}

}
