package weekone;

import java.util.Iterator;

public class MultiArrayDemo {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ankara";
		sehirler[0][1] = "Kayseri";
		sehirler[0][2] = "Sivas";
		sehirler[1][0] = "İstanbul";
		sehirler[1][1] = "İzmir";
		sehirler[1][2] = "Kırıkkale";
		sehirler[2][0] = "Kırşehir";
		sehirler[2][1] = "Ordu";
		sehirler[2][2] = "Kastamonu";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
