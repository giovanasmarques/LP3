package br.edu.ifsp.cmp.tads.ex5;


public class Televisao implements DispositivoEletronico {
	
	public void Ligar() {
       System.out.println("Ligando dispositivo...");
   }
   
   public void Desligar() {
       System.out.println("Desligando dispositivo...");
   }
   
   public static void main(String[] args) {
       Televisao tele = new Televisao();
       tele.Ligar();
       tele.Desligar();
       
    
       Computador comp = new Computador();
       comp.Ligar();
       comp.Desligar();

   }
}