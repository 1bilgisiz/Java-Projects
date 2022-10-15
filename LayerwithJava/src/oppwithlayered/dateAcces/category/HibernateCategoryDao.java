package oppwithlayered.dateAcces.category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add() {
		System.out.println("Hibernate ile veritabanına eklendi");
	}

	
}
