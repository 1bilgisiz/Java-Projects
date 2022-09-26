package weektwo;

public class methods2 {

	public static void main(String[] args) {

		String mesaj = "Hava çok güzel";
		String yenimesaj = mesaj.substring(0, 12);
		güncelle(yenimesaj);
		//////////////////////////////////

		String yenisehir = sehir(mesaj);
		System.out.println(yenisehir + "  " + mesaj);

		//////////////////////////////////

		int sayı = topla(12, 12);
		System.out.println("İki sayı toplamı : " + sayı);

	}

	public static void ekle() {

		System.out.println("Eklendi");
	}

	public static void sil() {

		System.out.println("Silindi");
	}

	public static void güncelle(String mesaj) {

		System.out.println("Güncellendi..." + mesaj);
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static String sehir(String sehir) {
		return "Ankra'da";
	}

}
