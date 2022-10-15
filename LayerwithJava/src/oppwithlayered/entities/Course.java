package oppwithlayered.entities;

public class Course {
	private int id;
	private String courseName;
	private int coursePrice;
	private String instructorName;

	public Course() {

	}

	public Course(int id, String courseName, int coursePrice, String instructorName) {

		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
