package prova01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex17_ordenaLista {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        
        list.add(23);
        list.add(2);
        list.add(10);
        list.add(8);
        list.add(4);
        
        System.out.println("Lista não ordenada" + list);
        
        int tam = list.size();
        
        for(int i = 0; i < tam; i++){
            for(int j = i; j < tam; j++){
                if(list.get(i) > list.get(j)){
                    int aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, aux);
                }
            }
        }
        
        System.out.println("Lista ordenada" + list);
    }

}


