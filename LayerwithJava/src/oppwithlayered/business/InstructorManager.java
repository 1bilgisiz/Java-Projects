package oppwithlayered.business;

import java.util.List;

import oppwithlayered.core.logging.Logger;
import oppwithlayered.dateAcces.course.JdbcCourseDao;
import oppwithlayered.dateAcces.instructor.InstructorDao;
import oppwithlayered.dateAcces.instructor.JdbcInstructorDao;
import oppwithlayered.entities.Course;
import oppwithlayered.entities.Instructor;

public class InstructorManager {
	private InstructorDao dao;
	private Logger[] loggers2;

	public InstructorManager(InstructorDao dao, Logger[] loggers2) {

		this.loggers2 = loggers2;
		this.dao = dao;
	}

	public void add(Instructor instructor) throws Exception {

		dao.add(instructor);
		for (Logger logger : loggers2) {
			logger.log(instructor.getFirstName()+ instructor.getLastName());
		}

	}
}
