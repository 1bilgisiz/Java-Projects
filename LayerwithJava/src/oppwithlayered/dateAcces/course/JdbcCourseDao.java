package oppwithlayered.dateAcces.course;

import oppwithlayered.entities.Course;

public class JdbcCourseDao  implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi.");		
	}
	
}
