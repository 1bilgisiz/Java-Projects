package fielandattributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Hp Laptop");
		product.setStock(25);
		product.setPrice(17.500);

		ProductManager manager = new ProductManager();
		manager.Ekle(product);

		System.out.println("Ürün kodu :" + product.getKod());
	}

}
