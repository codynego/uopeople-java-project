package courseManagementSystem;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student newStud = new Student("nego");
		int userInput;
		
		do {
			System.out.println("welcome to course and grade management system");
			String command = """
					choose from he option below to continue
					
					1. Add new course
					2. Enroll students
					3. Assign Grade
					4. Calculate course grade
					
					""";
			System.out.println(command);
			userInput = scan.nextInt();
			
			Scanner scanInput = new Scanner(System.in);
			
			switch (userInput) {
			case 1:
				
				
				System.out.print("enter course code: ");
				String courseCode = scanInput.nextLine();
				
				System.out.print("enter course name: ");
				String courseName = scanInput.nextLine();
				
				System.out.print("enter maximum capacity: ");
				int maxCapacity = scanInput.nextInt();
				
				CourseManagement.addCourse(courseCode, courseName, maxCapacity);
				System.out.println("course added");
			case 2:
				System.out.print("enter student ID: ");
				int studentID = scanInput.nextInt();
				Student newstud = (Student) Student.getStudent(studentID);
				
				System.out.print("enter course name: ");
				String course = scanInput.nextLine();
				Course courseObj = (Course) CourseManagement.getCourse(course);
				
				CourseManagement.enrollStudent(newstud, courseObj);
				System.out.println("student enrolled successfully");
				
			case 3:
				System.out.print("enter student ID: ");
				int studentID2 = scanInput.nextInt();
				Student newstud2 = (Student) Student.getStudent(studentID2);
				
				
				System.out.println("enter grade: ");
				int grade = scanInput.nextInt();
				
				System.out.println("enter course name: ");
				String course2 = scanInput.nextLine();
				Course courseObj2 = (Course) CourseManagement.getCourse(course2);
				
				CourseManagement.assignGrade(newstud2, courseObj2, grade);
				System.out.println("grade successfully assigned");
				
			case 4:
				System.out.print("enter student ID: ");
				int studentID3 = scanInput.nextInt();
				Student newstud3 = (Student) Student.getStudent(studentID3);
				
				int cummulativeGrade = CourseManagement.cummulativeGrade(newstud3);
				System.out.println(cummulativeGrade);
				
				
			}
			
	} while (userInput != 0);

}
}
