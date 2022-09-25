package weekone;

public class recapDemo2 {

	public static void main(String[] args) {

		double[] myList = new double[3];
		myList[0] = 1.2;
		myList[1] = 3.1;
		myList[2] = 2.4;

		double total = 0;

		double max = myList[0];

		for (double number : myList) {
			if (max < number) {
				max = number;

			}

			System.out.println(number);

			total = total + number;
		}

		System.out.println("Toplam : " + total);
		System.out.println("En Büyük : " + max);

	}

}
