package fielandattributes;

public class Product {

	public Product(int id, String name, String description, double price, int stock, String renk, String kod) {
		System.out.println("Yapıcı blok çalıştı...");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.renk = renk;
		this.kod = kod;
	}

	public Product() {

	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}
