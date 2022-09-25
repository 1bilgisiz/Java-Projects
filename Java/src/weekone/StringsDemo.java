package weekone;

public class StringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Hava çok güzel.        ";
		System.out.println(mesaj);
		
		System.out.println(mesaj.length());
		System.out.println(mesaj.concat("Değil mi ? "));
		System.out.println(mesaj.startsWith("H"));
		System.out.println(mesaj.endsWith("l"));
		char[] karakterler= new char[5];
	mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("."));
		
		
		String yeniMesaj= mesaj.replace(" ", ".");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	


		


		

	}

}
