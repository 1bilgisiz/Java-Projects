package weekone;

public class MiniProje3 {

	public static void main(String[] args) {

		// Mükemmel Sayı Bulma

		int sayi = 28;
		int toplam = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}

		if (toplam == sayi) {
			System.out.println("Mükemmel Sayı");
		} else {
			System.out.println("Mükemmel Sayı Degildir.");

		}
	}

}
