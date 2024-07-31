package prova01;

import java.util.ArrayList;

public class Ex18_maiorMenor {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
        
        list.add(23);
        list.add(2);
        list.add(10);
        list.add(8);
        list.add(4);
    
        int maior = list.get(0);
        int menor = list.get(0);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > maior){
                maior = list.get(i);
            }
            if(list.get(i) <  menor){
                menor = list.get(i);
            }
        }
        
        System.out.println("Maior valor = " + maior + " e menor valor = " + menor);
    }

}



