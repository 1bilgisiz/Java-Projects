package weekone;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Orta: Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız ");
			break;

		default:
			System.out.println("Geçersiz not girdiniz '");
		}

	}

}
