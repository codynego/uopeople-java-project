package courseManagementSystem;
import java.util.HashMap;
import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private HashMap<Course, Integer> enrolledCourses = new HashMap<>();
	private static int studentCount = 1;
	private static ArrayList<Student> allStudents = new ArrayList<>();
	
	
	public Student(String name) {
		this.id = studentCount;
		if (evaluateName(name)) {
			this.name = name;
		}
		
		studentCount++;
		allStudents.add(this);
	}
	
	private boolean evaluateName(String name) {
		if (name.length() == 0) {
			throw new IllegalArgumentException("name must be passed");
		}
		if (!(name instanceof String)) {
			throw new IllegalArgumentException("name must be of type string");
		}
		return true;
	}
	
	public static ArrayList<Student> allStudents() {
		return allStudents;
	}
	
	public static Student getStudent(int id) {
		for (Student student : allStudents) {
			if (student.id == id) {
				return student;
			}
		}
		return null;
	}
	
	public HashMap<Course, Integer>getEnrolledCourses() {
		return enrolledCourses;
	}
	
	public String getName() {
		// return the name attribute
		
		return this.name;
	}
	
	public void setName(String newName) {
		if (evaluateName(name)) {
			this.name = newName;
		}
	}
	
	public void enroll(Course course) {
		if (!(course instanceof Course)) {
			throw new IllegalArgumentException("invalid parameter passed type course");
		}
		enrolledCourses.put(course, null);
		course.updateStudentCount();
		
	}
	
	public void assignGrade(Course course, Integer grade) {
		if (!(course instanceof Course)) {
			throw new IllegalArgumentException("invalid parameter passed type course");
		}
		if (!(grade instanceof Integer)) {
			throw new IllegalArgumentException("grade must be of type Integer");
		}
		if (!(grade < 0)) {
			throw new IllegalArgumentException("grade must be > 0");
		}
		
		enrolledCourses.put(course, grade);
	}
}
