package WeekTwo.OOP.Abstraction;

public class Zoo {
  
  // move, eat..
  
  public static void main(String[] args) {
	Wolf wolf = new Wolf();
	System.out.println(wolf.makeSound());
	System.out.println(wolf.eat("Wolf"));
	System.out.println(wolf.move("Wolf"));
	
  }
  
}


abstract class Animal {
  public abstract String move(String name);
  
  public abstract String eat(String name);
}

class Wolf extends Animal {
  
  public String makeSound() {
	return "Wolf is barking";
  }
  
  @Override
  public String move(String name) {
	return name + "can move";
  }
  
  @Override
  public String eat(String name) {
	return name + "can eat";
  }
  
}

