package oppwithlayered.business;

import java.util.List;

import oppwithlayered.core.logging.Logger;
import oppwithlayered.dateAcces.course.CourseDao;
import oppwithlayered.dateAcces.course.JdbcCourseDao;
import oppwithlayered.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers2;
	
	


	public CourseManager(CourseDao courseDao, Logger[] loggers2) {
	
		this.loggers2= loggers2;
		this.courseDao = courseDao;
	}



	public void add(Course course) throws Exception {
		courseDao.add(course);
		
		for (Logger logger : loggers2) {
			logger.log(course.getCourseName());
		}
		 Course[] courses = {new Course(1, "Javascript", 30,"Engin Demiroğ "), new Course(2, "Android", 12, "Atıl Samancıoğlı")};
	        for (Course c : courses) {
	            if (course.getCourseName() == c.getCourseName()) {
	                throw new Exception("Kurs ismi tekrar edemez.");
	            } else if (course.getCoursePrice() < 0) {
	                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz.");
	            }
	        }
	        courseDao.add(course);
	        for (Logger logger : loggers2) {
	            logger.log(course.getCourseName());
	        }

	}
	

	
}
