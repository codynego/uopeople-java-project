package courseManagementSystem;
import java.util.ArrayList;
import java.util.HashMap;

public class CourseManagement {
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<HashMap<Course, ArrayList<Student>>> overallCourseGrade;
	
	public static void addCourse(String courseCode, String name, int maxCapacity) {
		Course newCourse = new Course(courseCode, name, maxCapacity);
		allCourses.add(newCourse);
	}
	
	public static Course getCourse(String name) {
		for (Course course : allCourses) {
			if (course.getName().equals(name)) {
				return course;
			}
		}
		return null;
	}
	public static void enrollStudent(Student newStudent, Course course) {
		try {
			newStudent.enroll(course);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void assignGrade(Student student, Course course, int grade) {
		try {
			student.assignGrade(course, grade);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int cummulativeGrade(Student studentObj) {
		int totalGrade = 0;
		for (Integer grade : studentObj.getEnrolledCourses().values()) {
			totalGrade += grade;
		}
		return totalGrade;
		
	}
}
