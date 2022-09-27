package fielandattributes;

public class ProductManager {

	public void Ekle(Product product) {

		System.out.println("ürün ıd:  " + product.id + "  ürün türü : " + product.name + "  ürünün markası : "
				+ product.description + "  ürün maliyeti : " + product.price + "  ürün kotası: " + product.stock);

	}

}
