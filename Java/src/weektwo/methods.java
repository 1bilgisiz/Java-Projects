package weektwo;

import java.util.Iterator;

public class methods {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int aranacak = 6;
		int[] sayilar = new int[] { 1, 2, 3, 45, 6, 79, 0, 8, 6 };
		boolean varMi = false;

		for (int sayı : sayilar) {
			if (sayı == aranacak) {
				varMi = true;
			}

		}

		if (varMi) {
			mesajVer("Aranan sayı");
		} else {
			System.out.println("Aranan sayı değildir. " + aranacak);

		}

	}

	public static void mesajVer(String mesaj) {

		System.out.println(mesaj);

	}

}
