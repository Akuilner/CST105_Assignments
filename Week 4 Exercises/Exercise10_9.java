import java.util.Scanner;
public class Exercise10_9 {
	private String courseName;
	private int numberOfStudents = 0;
	private String[] students = new String[numberOfStudents];

	
	
	
	public Exercise10_9(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		numberOfStudents++;
		String[] students2 = new String[numberOfStudents];
		
		for (int i = 0; i < numberOfStudents - 1; i++) 
			students2[i] = students[i];
		
		students2[numberOfStudents - 1] = student;
		
		students = students2;	
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
	int delete = findStudent(student);
	String[] students2 = new String[numberOfStudents - 1];
	
	if (delete == -1)
		return;
	
	if (delete > 0)
	{	
		System.arraycopy(students, 0, students2, 0, delete);
	}
	
	System.arraycopy(students, delete + 1, students2, delete, ((numberOfStudents - 1) - delete));
			
	students = students2;
	numberOfStudents--;		
	}
	
	private int findStudent(String student) {
		int found = -1;
		
		for (int i = 0; i <= numberOfStudents - 1; i++) 
			if (students[i].equals(student))
				found = i;
				
				
		return found;
	}
	
	public void clear() {
		String[] students2 = new String[0];
		
		students = students2;
		
		numberOfStudents = 0;
	}
	
	public void printStudents() {
		
		System.out.println("\nThe number of students in " + courseName + ": " + getNumberOfStudents());
		
		for (int i = 0; i < getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		
		System.out.println("");
	}
	
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		printStudents();
		
		System.out.print("Enter 'a' to add a student, enter 'd' to drop a student, or enter 'c' to clear students: ");
		String answer = sc.next();
		char studentChar = answer.charAt(0);		
		
		if (studentChar == 'a')
		{
			Scanner add = new Scanner(System.in);
			System.out.print("Enter the students name: ");
			String name = add.nextLine();
			
			addStudent(name);
			
			mainMenu();
		}
			
		if (studentChar == 'd')
		{
			Scanner drop = new Scanner(System.in);
			System.out.print("Enter the student's name: ");
			String droppedStudent = drop.nextLine();
			dropStudent(droppedStudent);
			
			mainMenu();
		}
		
		if (studentChar == 'c')
		{
			clear();
			
			mainMenu();
		}
		
		if (studentChar != 'a' || studentChar != 'd' || studentChar != 'c')
			mainMenu();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exercise10_9 course1 = new Exercise10_9("CST-105");
		
		/** The following is added to function as a user interface 
		 * (However I have added a course name and student names for testing's sake) :
		 * System.out.print("Enter the name of the course: ");
		 * String course = sc.nextLine();
		*/
		
		course1.addStudent("Craig Hope II");
		course1.addStudent("Jason Andrakin");
		course1.addStudent("Lorenzo Quintana");
		course1.addStudent("Stephen Abrams");
		course1.addStudent("Tucker Campbell");
		course1.addStudent("Tristan Stutzman");
		course1.addStudent("William Ochoa");
		course1.addStudent("William Phillips");
		
		course1.mainMenu();
		
				
		
		
	}

}
