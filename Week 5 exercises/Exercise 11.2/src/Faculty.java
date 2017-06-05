public class Faculty 
	extends Employee {
	
	public Faculty() {
	}
	
	
	//random values chosen
	int office = 320;
	double salary = 15000;
	int day = 4;
	int month = 7;
	int year = 1995;
	
	Employee test = new Employee(office, salary, day, month, year);
	
	
	//generic name chosen
	String name = "John Smith";
	String className = "Faculty";
	
	@Override
	public String toString(){
		return name + ", " + className;
	}
	
	


	

	
}
	
	
