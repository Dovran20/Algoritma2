package hafta_5;

import java.util.ArrayList;

public class KisiMain {

	public static void main(String[] args) {

		ArrayList<Kisi> kisiler=new ArrayList<Kisi>();
		
		kisiler.add(new Kisi("Dovran",22));
		kisiler.add(new Kisi("Meret",22));
		kisiler.add(new Kisi("Allanur",22));
		kisiler.add(new Kisi("Karim",23));
		
		
		
	 for(Kisi kisi: kisiler) {
		 System.out.println("isim: "+kisi.getIsim()+" Yaþ:"+kisi.getYas());
	 }
	}

}
