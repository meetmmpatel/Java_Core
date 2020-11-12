package WeekTwo.OOP.Inheritance;

public class MultiLevelInheritance {
  
  public static void main(String[] args) {
	
	Cube cube = new Cube();
	cube.volume();
	cube.area();
	cube.display();
	
  }
  
}

class Shape {
  public void display() {
	System.out.println("Inside the Display..");
  }
}

class Rectangle extends Shape {
  public void area() {
	System.out.println("Inside Rectangle Class");
  }
}

class Cube extends Rectangle {
  public void volume() {
	System.out.println("inside Cube");
  }
}
