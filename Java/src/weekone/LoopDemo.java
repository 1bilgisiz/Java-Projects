package weekone;

import java.util.Iterator;

public class LoopDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("sayı " + i);

		}

		System.out.println("For Döngü bitti...");

  //////////////////////////////////////////////////////////
		int i = 0;
		while (i < 10) {
			System.out.println("sayı " + i);
			i++;

		}

		System.out.println("While Döngü bitti...");
		
	/////////////////////////////////////////////////////////
		int j=0;
		do {
			System.out.println(j);
			j++;
		} while(j<10);

		
		System.out.println("Do-While Döngü bitti...");
	}

	

}
