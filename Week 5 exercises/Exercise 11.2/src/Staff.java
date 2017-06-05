public class Staff 
extends Employee {
	
	
	String name = "John Smith";
	String className = "Staff";
	
	//random values chosen
	int office = 320;
	double salary = 15000;
	int day = 4;
	int month = 7;
	int year = 1995;
	
	Employee test = new Employee(office, salary, day, month, year);
	
	@Override
	public String toString(){
		return name + ", " + className;
	}

}