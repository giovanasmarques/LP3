package prova01;

import java.util.Date;
import java.util.Calendar;

public class Ex13_DiferencaDatas {

	public static void main(String[] args) {
		
		Calendar data1 = Calendar.getInstance();
		
        data1.set(2023, Calendar.NOVEMBER, 4);
        
        Date data2 = new Date();
        
        long time1 = data1.getTimeInMillis();
        long time2 = data2.getTime();
        long diffMili = time2 - time1;
        double diffDias = (double) diffMili / (1000 * 60 * 60 * 24);
        
        System.out.println("A diferença em dias das duas datas é de " + diffDias);
    }

}


