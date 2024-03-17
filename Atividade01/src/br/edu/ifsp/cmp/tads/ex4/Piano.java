package br.edu.ifsp.cmp.tads.ex4;

public class Piano extends InstrumentoMusical{
	
	   public void Tocar() {
	       System.out.println("Tocando piano...");
	   }
	   
	   public void Afinar() {
	       System.out.println("Afinando piano...");
	   }
	   
	   public static void main(String[] args) {
	        Violao violao = new Violao();
	        violao.Tocar();
	        violao.Afinar();
	        
	     
	        Piano piano = new Piano();
	        piano.Tocar();
	        piano.Afinar();
	    }

}