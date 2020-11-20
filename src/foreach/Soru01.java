package foreach;

import java.util.Arrays;
import java.util.List;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Bir integer array  olusturunuz ve bu  arraydaki tum sayýlarýn carpýmýný forech kullanarak bulunuz.
		 sonucu tekrr yazdýrýnýz
		 */
		
		Integer arr[]= {1,2,3,5,8,13,21};
		
	    List<Integer> ls=Arrays.asList(arr);
	    
	    System.out.println(ls);
	    
	    int carpým=1;
		
	    for(Integer w:ls) {
	   
	    	carpým=carpým*w;
	    }System.out.println("arraydeki sayýlar carpýmý  :"+ carpým);
		
		
		System.out.println("gıthub denemesı");
		
	}

}
