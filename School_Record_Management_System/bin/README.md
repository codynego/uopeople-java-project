# SCHOOL MANAGEMENT SYSTEM
## A COMMAND-LINE TOOL TO MANAGE STUDENTS

A robust student record management system in java to empower administrator with efficient tools for handling student records.

### Technology Used:
 - Java
 
### Features
Administrators will be able to perform task such as:
 1. add new students
 2. Update students
 3. view all students
 4. view specific student
 5. exit the program
 
### Learning Objective
The objective of this program is to learn from previous and current course lessions to build a fully robust system that not only process inputs but also handle errors effectively.
 
### code Explanation:
The `Student.java` class contains a Student class which has attributes such as 
	- `student id` <int>
	- `student name` <String>
	- `student age` <int>
	- `student grade` <int>
Each of which are all public attributes. The class also has 2 static field `constantid` which holds an initial id of 1 and increment when new Student objects is added.

It also has a static field of `allStudents` which is an ArrayList holding all the added students record.

In the constructor, the parameter name, age and grade were added and the types were checked to avoid getting a wrong input type from our users which might crash out program. After which the value is set.

There are 4 other static method which were created

1. addStudent
2. updateStudent
3. ViewStudents
4. getStudent

The add students takes a new student object then adds it to the `allStudents` ArrayList. while the `updateStudent` takes a `studentid` as input along with other student information, such as name, age and grade. if the id is found, it update it with the new information else, it return an error.

The viewStudent just prints the students in the ArrayList while the getStudent takes a studentId as input then print the information of that student.

The entire program takes error handling into consideration and make sure to check for potential errors that might occur. This errors range from invalid inputs, wrong data types etc.

The main.java file does only one job which is to prints the menu in a well formatted form, takes user input using the Scanner object then process each command based on what the user typed using the switch statement.


### Concept
This entire program build up from different concept learnt in java.
 - static and non static
 - loops and switch statement
 - ArrayList and HashMaps
 - Scanners
 - Error Handling

