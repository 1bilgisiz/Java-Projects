package StaticDemo;

public class ProductValidator {
	static {
		System.out.println("Yapıcı blok çalıştı");
	}
	static {
		System.out.println("Yapıcı blok 2 çalıştı");
	}
	static {
		System.out.println("Yapıcı blok 3 çalıştı");
	}
	/*
	 * public ProductValidator(){ System.out.println("Yapıcı blok çalıştı"); }
	 */

	public static boolean isValid(Product product) {
		if (product.price > 10 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;

		}
	}

}
