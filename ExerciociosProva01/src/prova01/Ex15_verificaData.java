package prova01;

import java.util.Date;
import java.util.Calendar;

public class Ex15_verificaData {

	public static void main(String[] args) {
		
		Calendar data1 = Calendar.getInstance();
        data1.set(2024, Calendar.NOVEMBER, 8);
        
        Calendar data2 = Calendar.getInstance();
        data2.set(2024, Calendar.NOVEMBER, 4);
        
        long data1Numero = data1.getTimeInMillis();
        long data2Numero = data2.getTimeInMillis();
        
        if (data1Numero < data2Numero) {
            System.out.println("A primeira data é antes da segunda data.");
        } else if (data1Numero > data2Numero) {
            System.out.println("A primeira data é depois da segunda data.");
        }
    }

}


