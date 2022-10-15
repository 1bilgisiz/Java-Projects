package oppwithlayered.dateAcces.course;

import oppwithlayered.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi");
	}

}
