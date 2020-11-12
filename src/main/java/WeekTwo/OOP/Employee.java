package WeekTwo.OOP;

public class Employee {
  
  /*
    1. Global and Local variables
    2. Static and not static variables
    3. Non-arg and args constructors
    4. Static and not static method(with void and return type)
   */
  
  // When to create Static variables
  static int empID;
  static String empOfficeCode;
  static String empLotId;
  
  // When to create non static variables
  String empName;
  String empDept;
  boolean isActive;
  int empZipCode;
  
  //1. we can not use static variable in constructors
  public Employee() {
	System.out.println("This is no-args constructor..");
  }
  
  public Employee(String name, String dept, int zipCode) {
	empName = name;
	empDept = dept;
	empZipCode = zipCode;
  }
  
  //Non-static method...
  public double empIncome(double income) {
	System.out.println(empName);
	System.out.println(empDept);
	return income / 2;
  }
  
  public static String empDetails() {
	return empOfficeCode + " " + empLotId;
  }
  
  @Override
  public String toString() {
	return "Employee{" +
			"empName='" + empName + '\'' +
			", empDept='" + empDept + '\'' +
			", isActive=" + isActive +
			", empZipCode=" + empZipCode +
			'}';
  }
}
