package foreach;

import java.util.Arrays;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Bir integer array  olusturunuz ve bu  arraydaki tum say�lar�n carp�m�n� forech kullanarak bulunuz.
		 sonucu tekrr yazd�r�n�z
		 */
		
		Integer arr[]= {1,2,3,5,8,13,21};
		
	    List<Integer> ls=Arrays.asList(arr);
	    
	    System.out.println(ls);
	    
	    int carp�m=1;
		
	    for(Integer w:ls) {
	   
	    	carp�m=carp�m*w;
	    }System.out.println("arraydeki say�lar carp�m�  :"+ carp�m);
		
		
		
	}

}
