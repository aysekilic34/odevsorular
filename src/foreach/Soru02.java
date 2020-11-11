package foreach;

import java.util.ArrayList;
import java.util.List;

public class Soru02 {

	public static void main(String[] args) {
		/*
		 Bir integer list olusturunuz ve bu listteki tum elemanların karesinin toplamını  forech
		 kullanrak bulunuz sonucu ekrana yazdırınız
		 */
		
		List<Integer> ls= new ArrayList<>();
		
		ls.add(9);
		ls.add(8);
		ls.add(7);
		ls.add(6);
		
		int toplam=0;
		
		for(Integer w:ls) {
			
			toplam+=(toplam + w*w);
		}
		System.out.println(toplam);
		
		
	}

}
