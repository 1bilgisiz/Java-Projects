package weekone;

public class MiniProje5 {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5, 68, 0, 8, 6 };

		int aranacak = 72;

		boolean varmi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;

			}
		}

		if (varmi) {
			System.out.println("Sayı var.");

		} else {
			System.out.println("Sayı yok.");

		}

	}

}
