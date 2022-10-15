package oppwithlayered;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import oppwithlayered.business.CategoryManager;
import oppwithlayered.business.CourseManager;
import oppwithlayered.business.InstructorManager;
import oppwithlayered.core.logging.DatabaseLogger;
import oppwithlayered.core.logging.FileLogger;
import oppwithlayered.core.logging.Logger;
import oppwithlayered.core.logging.MailLogger;
import oppwithlayered.dateAcces.category.HibernateCategoryDao;
import oppwithlayered.dateAcces.category.JdbcCategoryDao;
import oppwithlayered.dateAcces.course.HibernateCourseDao;
import oppwithlayered.dateAcces.instructor.HibernateInstructorDao;
import oppwithlayered.entities.Category;
import oppwithlayered.entities.Course;
import oppwithlayered.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Java", 99, "Engin DEmiroğ");
		Category category2 = new Category(1, "programlama");
		Instructor instructor3 = new Instructor(01, "Engin", "Demiroğ", "ed123456@gmail.com");

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category2);

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor3);

	}

}
