package WeekTwo.OOP;

public class Organization {
  
  // Josh Wilson
  
  public static void main(String[] args) {
	
	Employee john = new Employee();
	
	john.empName = "John Wilson";
  
    System.out.println(john.empName);
	
	Employee.empOfficeCode = "101";
	Employee.empLotId = "ZXC4589";
	
	System.out.println("This is employee Details: " + Employee.empDetails());
	
	
  }
  
  
}
