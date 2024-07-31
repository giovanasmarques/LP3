package prova01;

public class ex07_calcularHipotenusa {

	public static void main(String[] args) {
		    
		double cat_opo = 3;
		double cat_adj = 4;
		double hipo = 0;
		    
		    hipo = Math.sqrt(Math.pow(cat_opo, 2) + Math.pow(cat_adj, 2));
		    System.out.print("Hipotenusa: " + hipo);
		}

}

