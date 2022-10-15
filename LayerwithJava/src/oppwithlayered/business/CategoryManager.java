package oppwithlayered.business;

import java.util.List;

import oppwithlayered.core.logging.Logger;
import oppwithlayered.dateAcces.category.CategoryDao;
import oppwithlayered.entities.Category;
import oppwithlayered.entities.Instructor;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers3;

	public CategoryManager(CategoryDao categoryDao,  Logger[] loggers3) {

		this.categoryDao = categoryDao;
		this.loggers3 = loggers3;

	}

	public void add(Category category) throws Exception {

		categoryDao.add();
		for (Logger logger : loggers3) {
			logger.log(category.getCategoryName());
		}
		
		 Category[] categories = {new Category(1, "Backend"), new Category(2, "Frontend"), new Category(3, "Mobile")};
	        for (Category c : categories) {
	            if (category.getCategoryName() == c.getCategoryName()) {
	                throw new Exception("Kategori ismi tekrar edemez.");
	            }
	        }
	        categoryDao.add();
	        for (Logger logger : loggers3) {
	            logger.log(category.getCategoryName());


	}

	}
}
