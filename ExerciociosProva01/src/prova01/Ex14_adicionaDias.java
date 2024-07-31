package prova01;

import java.util.Date;
import java.util.Calendar;

public class Ex14_adicionaDias {

	public static void main(String[] args) {
		
		 Calendar data1 = Calendar.getInstance();
		 
	        data1.set(2023, Calendar.NOVEMBER, 4);
	        
	        int diasAMais = 365;
	        
	        data1.add(Calendar.DAY_OF_MONTH, diasAMais);
	    
	        System.out.println("A nova data é: " + data1.getTime());
	    }

}


