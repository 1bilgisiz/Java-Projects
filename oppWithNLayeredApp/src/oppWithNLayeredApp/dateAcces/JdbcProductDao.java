package oppWithNLayeredApp.dateAcces;

import oppWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		// sadece ve sadece db erişim kodları buraya yazılır...
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
