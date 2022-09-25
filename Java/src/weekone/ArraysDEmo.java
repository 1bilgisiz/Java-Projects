package weekone;

import java.util.Iterator;

public class ArraysDEmo {

	public static void main(String[] args) {

		String ogrenci1 = "Ayşe";
		String ogrenci2 = "Ali";
		String ogrenci3 = "Yusuf";
		String ogrenci4 = "Hazal";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-------------------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ayşe";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Yusuf";
		ogrenciler[3] = "Hazal";
		
		for (int i = 0; i < ogrenciler.length; i++) {
		
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------------------------------");

		
		for( String ogrenci:ogrenciler) {
			System.out.println(ogrenci);

		}
		
	}

}
