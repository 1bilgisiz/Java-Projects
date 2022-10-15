package oppwithlayered.dateAcces.category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add() {
		System.out.println("JDBC ile veritabanına eklendi.");
		
	}



}
