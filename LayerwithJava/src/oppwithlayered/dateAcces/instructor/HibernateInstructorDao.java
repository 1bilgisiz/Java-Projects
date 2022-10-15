package oppwithlayered.dateAcces.instructor;

import oppwithlayered.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
