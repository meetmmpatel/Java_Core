package WeekTwo.OOP.Inheritance;

public class Hierarchical_Inheritance extends Teacher {
  public static void main(String[] args) {
	Hierarchical_Inheritance mathTeacher = new Hierarchical_Inheritance();
	Hierarchical_Inheritance physicsTeacher = new Hierarchical_Inheritance();
	physicsTeacher.name = "RJ";
	physicsTeacher.department = "Physics";
	
	physicsTeacher.id = 102;
	mathTeacher.name = "JJ";
	mathTeacher.department = "Math";
	mathTeacher.id = 101;
	Physics physics = new Physics();
	Math math = new Math();
	math.MathTeacherID(102);
	physics.PhysicsTeacherName("Mark Miller");
	physics.printFullDetails();
  }
}

class Teacher {
  String name;
  String department;
  int id;
  
  
  public void display(String name, String department, int id) {
	this.name = name;
	this.department = department;
	this.id = id;
  }
  
  @Override
  public String toString() {
	return "Teacher{" +
			"name='" + name + '\'' +
			", department='" + department + '\'' +
			", id=" + id +
			'}';
  }
}

class Physics extends Teacher {
  public void PhysicsTeacherName(String teacherName) {
	this.name = teacherName;
	System.out.println("Physics class teacher name is:  " + name);
  }
  
  public void printFullDetails() {
	Physics physicsTeacher = new Physics();
	physicsTeacher.display("Mark Miller", "Physics", 201);
	System.out.println(physicsTeacher);
  }
}

class Math extends Teacher {
  public void MathTeacherID(int mathId) {
	this.id = mathId;
	System.out.println("Math class teacher id is " + id);
  }
}
