package WeekTwo.OOP.Inheritance;


public class SingleInheritance extends DemoOne {
  
  
  public static void main(String[] args) {
	SingleInheritance inheritance = new SingleInheritance();
	inheritance.productID = 101;
	inheritance.productName = "HP";
	inheritance.description = "Laptop";
	
	System.out.println(inheritance);
	
	inheritance.changeProductName("Apple");
	inheritance.changeDescription("Macbook Pro");
	System.out.println(inheritance);
  }
}


class DemoOne {
  
  String description;
  String productName;
  int productID;
  
  public DemoOne() {
  }
  
  //Const with Args..
  public DemoOne(String description, String productName, int productID) {
	this.description = description;
	this.productName = productName;
	this.productID = productID;
  }
  
  public void changeProductName(String newName) {
	this.productName = newName;
  }
  
  public void changeDescription(String description) {
	this.description = description;
  }
  
  @Override
  public String toString() {
	return "DemoOne{" +
			"description='" + description + '\'' +
			", productName='" + productName + '\'' +
			", productID=" + productID +
			'}';
  }
}
