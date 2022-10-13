package StaticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Mouse";
		product.price = 12;

		manager.add(product);

		DatabaseHelper.Crud.Update();

	}

}
