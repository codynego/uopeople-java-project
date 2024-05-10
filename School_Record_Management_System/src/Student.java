import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private Integer age;
	private Integer grade;
	
	private static int constantid = 1;
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	
	
	public Student(String name, Integer age, Integer grade) {
		
		if (!(name instanceof String)) {
			throw new IllegalArgumentException("name isnt of type string");
		}
		if (!(age instanceof Integer)) {
			throw new IllegalArgumentException("age isnt of type Integer");
		}
		if (!(grade instanceof Integer)) {
			throw new IllegalArgumentException("grade isnt of type Integer");
		}
		if (age <= 0) {
			throw new IllegalArgumentException("age must be greater than 0");
		}
		this.name = name;
		this.age = age;
		this.grade = grade;
		
		
	}
	
	public static int addStudent(Student newStudentObj) {
		newStudentObj.id = constantid;
		allStudents.add(newStudentObj);
		constantid++;
		return(newStudentObj.id);
	}
	
	public static boolean validateStudent(int id) {
		for (Student element : allStudents) {
			Object studentIdObj = element.id;
			int studentId = (int) studentIdObj;
			if (studentId == id) {
				return true;
			}
		}
		return false;
	}
	
	public static void updateStudent(int id, String name, int age, int grade) {
		
		for (Student element : allStudents) {
			boolean isValidId = validateStudent(id);
			if (isValidId) {
				element.name = name;
				element.age = age;
				element.grade = grade;
				break;
			} else {
				throw new IllegalArgumentException("provided id not found");
			}
		}
		}
	
	public static void viewStudents() {
		for (Student element : allStudents) {
			System.out.println("id: " + element.id);
			System.out.println("name: " + element.name);
			System.out.println("age: " + element.age);
			System.out.println("grade: " + element.grade);
			System.out.println("====================");
		}
	}
	public static void getStudent(int studentId) {
		for (Student element : allStudents) {
			boolean isValidId = validateStudent(studentId);
			if (isValidId && (int) element.id == studentId) {
				System.out.println("id: " + element.id);
				System.out.println("name: " + element.name);
				System.out.println("age: " + element.age);
				System.out.println("grade: " + element.grade);
				System.out.println("===============================");
				break;
			} else {
				throw new IllegalArgumentException("provided id not found");
				
			}
			
		}
	}
	
	
	}
 