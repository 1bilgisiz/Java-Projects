package fielandattributes;

public class Main {

	public static void main(String[] args) {
		
	//	Product  product= new Product(1, "telefon", "samsung A7", 14000, 5, "kırmızı", "t1");

		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");	
		product.setDescription("Hp Laptop");
		product.setStock(25);
		product.setPrice(17.500);

		ProductManager manager = new ProductManager();
		manager.Ekle(product);
		System.out.println("Ürün ıd :" + product.getId());
		System.out.println("Ürün ismi :" + product.getName());
		System.out.println("Ürün tanımı :" + product.getDescription());
		System.out.println("Ürün stok :" + product.getStock());
		System.out.println("Ürün maliyeti :" + product.getPrice());
		System.out.println("Ürün kodu :" + product.getKod());
	}

}
