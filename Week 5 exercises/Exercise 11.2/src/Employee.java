public class Employee 
	extends Person {
	public Employee() {
	}
	
	public Employee(int office, double salary, int hireDay, int hireMonth, int hireYear) {
		this.office = office;
		this.salary = salary;
		this.hireDay = hireDay;
		this.hireMonth = hireMonth;
		this.hireYear = hireYear;
	}

	int office;
	public int getOffice() {
		return office;
	}
	public void setOffice(int o) {
		office = o;
	}
	
	double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double s) {
		salary = s;
	}
	
	int hireDay;
	public int getDay() {
		return hireDay;
	}
	public void setDay(int d) {
		hireDay = d;
	}
	
	int hireMonth;
	public int getMonth() {
		return hireMonth;
	}
	public void setMonth(int m) {
		hireMonth = m;
	}
	
	int hireYear;
	public int getYear() {
		return hireYear;
	}
	public void setYear(int y) {
		hireYear = y;
	}
	

	
	
}
