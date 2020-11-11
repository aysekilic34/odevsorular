package foreach;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 bir string olusturunuz bu stringdeki charakterleri yukarýdan asagýya dorgru for each kullanarak yazdýrýnýz
		 
		 */
        
		String str="ayse kýlýc";
		
		String arr[] = str.split("");
		
		for( String w: arr) {
			System.out.println(w);
		}
		
	}

}
