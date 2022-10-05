package oppWithNLayeredApp.business;

import java.util.List;

import oppWithNLayeredApp.core.loging.Logger;
import oppWithNLayeredApp.dateAcces.HibernateProductDao;
import oppWithNLayeredApp.dateAcces.JdbcProductDao;
import oppWithNLayeredApp.dateAcces.ProductDao;
import oppWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[]loggers )  {
		this.productDao = productDao;
		this.loggers=loggers;
		
	}

	
	
	public void add(Product product) throws Exception {
		// business rule
		if (product.getUnitPrica() < 10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz !!!");

		}

		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}

}
