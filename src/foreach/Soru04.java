package foreach;

public class Soru04 {

	public static void main(String[] args) {
		/*
		 bir string olusturunuz bu stringdeki charakterleri yukar�dan asag�ya dorgru for each kullanarak yazd�r�n�z
		 
		 */
        
		String str="ayse k�l�c";
		
		String arr[] = str.split("");
		
		for( String w: arr) {
			System.out.println(w);
		}
		
	}

}
