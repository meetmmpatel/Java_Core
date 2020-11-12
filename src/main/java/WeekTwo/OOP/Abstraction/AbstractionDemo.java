package WeekTwo.OOP.Abstraction;

public class AbstractionDemo extends Meal {
  
  public static void main(String[] args) {
	AbstractionDemo food = new AbstractionDemo();
	System.out.println(food.prepMeal("Lunch", "soda"));
	System.out.println(food.prepMeal("Dinner", "wine"));
  }
  
  
  @Override
  public String prepMeal(String mealType, String drink) {
	String foodType = mealType;
	String drinkType = drink;
	return foodType + " " + drinkType;
  }
}


//Class Meal

abstract class Meal {
  public abstract String prepMeal(String mealType, String drink);
}


