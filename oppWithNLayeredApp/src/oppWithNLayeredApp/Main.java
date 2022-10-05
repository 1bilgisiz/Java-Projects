package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.loging.DatabaseLogger;
import oppWithNLayeredApp.core.loging.FileLogger;
import oppWithNLayeredApp.core.loging.Logger;
import oppWithNLayeredApp.core.loging.MailLogger;
import oppWithNLayeredApp.dateAcces.HibernateProductDao;
import oppWithNLayeredApp.dateAcces.JdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Iphone Xr", 10000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		ProductManager manager = new ProductManager(new JdbcProductDao(), loggers);
		manager.add(product1);

	}

}
