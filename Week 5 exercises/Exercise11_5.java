import java.util.*;

public class Exercise11_5 {
	
	/**Course name added for convenience, 
	 * User interface also available 
	 * @ line 90 & @ lines 94-96 */
	
	private ArrayList<String> students = new ArrayList<>();
	
	
	public ArrayList<String> getStudents() {
		return students;
	}
	
	
	private String courseName = "CST-105";
	public String getCourse() {
		return courseName;
	}
	public void setCourse(String c) {
		courseName = c;
	}
	
	
	public void addStudent() {
		Scanner name = new Scanner(System.in);
		
		System.out.print("Enter the student's name: ");
		String newName = name.nextLine();
		students.add(newName);
		printInfo();	
		
	}
	
	public void removeStudent() {
		Scanner name = new Scanner(System.in);
		
		System.out.print("Enter the student's name: ");
		String oldName = name.nextLine();
	
			students.remove(oldName);
			printInfo();
		
	}
	
	
	
	public void clearStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Clear all students? Enter \"y\" for yes, anything else for no: ");
		String answer = sc.next();
		
	
		if(answer.equalsIgnoreCase("y"))
		{
			students.clear();
			printInfo();
		}
		else
			printInfo();
		
	}
	
	public void printInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nThe course is: " + getCourse()
				+ "\nThe number of students in " + getCourse() + " is: " + students.size()
				+ "\nThe students' names are: " + students.toString()
				+ "\n"
				+ "\nWould you like to edit the list?\nEnter \"a\" to add a student, \n\"r\" to remove a student, \nor \"c\" to clear the list: ");
		
		String answer = sc.next(); 
		
		if (answer.equalsIgnoreCase("a"))
				addStudent();
		if (answer.equalsIgnoreCase("r"))
				removeStudent();
		if (answer.equalsIgnoreCase("c"))
				clearStudents();
		else
			printInfo();
		
		
	}
	
	public static void main(String[] args) {
		//Scanner added for user interface 
		//Scanner sc = new Scanner(System.in);
		Exercise11_5 test = new Exercise11_5();
		
		//User interface for determining course
		  /**System.out.print("Enter the name of the course: ");
		  String course = sc.nextLine();
		  test.setCourse(course);*/
		
		
		test.printInfo();
		
		
	}

}
