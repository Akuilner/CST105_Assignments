public class Person {
	
	public Person() {		
	}
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}

	String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String a) {
		address = a;
	}
	
	String phoneNumber;
	public String getPN() {
		return phoneNumber;
	}
	public void setPN(String pn) {
		phoneNumber = pn;
	}
	
	String emailAddress;
	public String getEA() {
		return emailAddress;
	}
	public void setEA(String ea) {
		emailAddress = ea;
	}
	
	
	public void printInfo() {
		System.out.print("\nName is:  " + getName() + "\n"
					  + "Address is: " + getAddress() +  "\n"
					  + "Phone number is: " + getPN() + "\n"
					  + "E-mail address is: " + getEA() + "\n");
	}
	
	
	
	
	
	
	
	
	
	
}
