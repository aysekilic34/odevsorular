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
	    
	    int carpim=1;
		
	    for(Integer w:ls) {
	   
	    	carpim=carpim*w;
	    }System.out.println("arraydeki sayilar carpimi  :"+ carpim);
		
		
		System.out.println("github denemesi");
		
	}

}
