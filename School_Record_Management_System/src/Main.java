import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("welcome to University Of The People");
		String command = """
				######################################################
				#         Student Management System Menu             #
				#                                                    #
				# DashBoard                                          #
				# - Add Student (enter 1)                            #
				# - Update Student (enter 2)                         #
				# - View Students (enter 3)                          #
				# - Get specific Student info (enter 4)              #
				# - Exit program (enter 5)                           #                       #
				######################################################
				""";

		int userCommand = 0;
		do {
			System.out.println(command);
			System.out.print(">>> ");
			try {
				Scanner scan = new Scanner(System.in);
				int getInput = scan.nextInt();
				System.out.println(getInput);
				userCommand = getInput;

				
				switch (getInput) {
				case 1:
					boolean response = validateInput("add");
					if (response) {
						System.out.println("student added");
					} else {
						System.out.println("an error occured");
					}
					continue;
				case 2:
					boolean updateResponse = validateInput("update");
					if (updateResponse) {
						System.out.println("student updated");
					} else {
						System.out.println("an error occured");
					}
					continue;
				case 3:
					Student.viewStudents();
					continue;
					
				case 4:
					System.out.print("enter student id >>> ");
					int id = scan.nextInt();
					try {
						Student.getStudent(id);
						
					} catch (IllegalArgumentException e) {
						System.out.println("id no valid");
					}
					continue;
				case 5: {
					System.out.println("Thanks, bye!");
					break;
				}
				}

			} catch (InputMismatchException e) {
				System.out.println("invalid type");
			}

		} while (userCommand != 5);
		
		
	}
	
	public static boolean validateInput(String type) {
		try {
			Scanner addStudscan = new Scanner(System.in);
			System.out.print("enter name >>> ");
			String name = addStudscan.nextLine();
			
			System.out.print("enter age >>> ");
			int age = addStudscan.nextInt();
			
			System.out.print("enter grade >>> ");
			int grade = addStudscan.nextInt();
			
			if (type.equals("update")) {
				System.out.print("enter student id >>> ");
				int updateId = addStudscan.nextInt();
				Student.updateStudent(updateId, name, age, grade);
				return true;
			} else if (type.equals("add")) {
				Student newStudent = new Student(name, age, grade);
				Student.addStudent(newStudent);
				return true;
			}
			
		} catch (InputMismatchException e) {
			return false;
			
		}
		return true;
	}

}