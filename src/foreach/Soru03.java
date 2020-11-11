package foreach;


public class Soru03 {

	public static void main(String[] args) {
		/*
		 2 string array olusturunuz ve bu arraydeký tum ortak elemanlarý  for each kullanrak
		 bulunuz.Sonucu ekrana yazdýrýnýz.ortak eleman yoksa ortak elman yok yazddýrýnýz
		 */
		
		String[] arr1= {"A","B","T","K","X"};
		String[] arr2= {"J","B","N","K","X"};
		
		int count=0;
		for(String w:arr1) {
			 for(String x:arr2) {
				 if(w.equals(x)) {
					 System.out.print(" "+ x);
					 count++;
				 }
			 }
		}  if(count==0) {
			System.out.println("ortak eleman yoktur!!!!");
		}
		
		
		
	}

}
