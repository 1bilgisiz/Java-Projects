package oppWithNLayeredApp.entities;

public class Product {
	private int id;
	private String name;
	private double unitPrica;

	public Product() {

	}

	public Product(int id, String name, double unitPrica) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrica = unitPrica;
	}

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

	public double getUnitPrica() {
		return unitPrica;
	}

	public void setUnitPrica(double unitPrica) {
		this.unitPrica = unitPrica;
	}

}
