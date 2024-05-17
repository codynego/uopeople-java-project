package courseManagementSystem;

public class Course {
	private String courseCode;
	private String name;
	private int maxCapacity;
	private int studentCount;
	
	private static int allenrolledStudentsCount;

	public Course(String courseCode, String name, int maxCapacity) {
		// TODO Auto-generated constructor stub
		this.courseCode = courseCode;
		this.name = name;
		this.maxCapacity = maxCapacity;
	}
	
	public String getCourseCode() {
		return this.courseCode;
	}
	public void setCourseCode(String newCourseCode) {
		this.courseCode = newCourseCode;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void updateStudentCount() {
		this.studentCount = this.studentCount + 1;
	}
	public static int enrolledStudentCount() {
		return allenrolledStudentsCount;
	}

}
