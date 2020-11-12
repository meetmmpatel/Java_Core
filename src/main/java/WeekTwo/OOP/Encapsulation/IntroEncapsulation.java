package WeekTwo.OOP.Encapsulation;

public class IntroEncapsulation {
  
  public static void main(String[] args) {
    Student student = new Student();
    student.setId(222);
	System.out.println(student.getId());
	student.setActive(true);
	System.out.println(student.isActive());
  
  }
  
}

class Student{
  
  private int id;
  private String fullName;
  private String department;
  private boolean isActive;
  
  public int getId() {
	return id;
  }
  
  public void setId(int id) {
	this.id = id;
  }
  
  public String getFullName() {
	return fullName;
  }
  
  public void setFullName(String fullName) {
	this.fullName = fullName;
  }
  
  public String getDepartment() {
	return department;
  }
  
  public void setDepartment(String department) {
	this.department = department;
  }
  
  public boolean isActive() {
	return isActive;
  }
  
  public void setActive(boolean active) {
	isActive = active;
  }
  
  @Override
  public String toString() {
	return "Student{" +
			"id=" + id +
			", fullName='" + fullName + '\'' +
			", department='" + department + '\'' +
			", isActive=" + isActive +
			'}';
  }
}
