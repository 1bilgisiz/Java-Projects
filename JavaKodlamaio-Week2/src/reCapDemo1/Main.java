package reCapDemo1;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int topla = dortIslem.Topla(3, 5);
		int cikar = dortIslem.Cikar(2, 3);
		int carp = dortIslem.Carp(1, 7);
		int bol = dortIslem.Bol(9, 3);

		System.out.println("Toplama sonucu : " + topla);
		System.out.println("Çıkarma sonucu : " + cikar);
		System.out.println("Çarpma sonucu : " + carp);
		System.out.println("Bölme sonucu : " + bol);

	}

}
