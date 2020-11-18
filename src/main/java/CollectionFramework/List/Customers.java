package CollectionFramework.List;

public class Customers {
  
  //Encapulation
  private int id;
  private String name;
  private boolean isActive;
  private float totalPurchase;
  
  public Customers() {
  }
  
  public Customers(int id, String name, boolean isActive, float totalPurchase) {
	this.id = id;
	this.name = name;
	this.isActive = isActive;
	this.totalPurchase = totalPurchase;
  }
  
  public int getId() {
	return id;
  }
  
  public void setId(int id) {
	this.id = id;
  }
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  public boolean isActive() {
	return isActive;
  }
  
  public void setActive(boolean active) {
	isActive = active;
  }
  
  public float getTotalPurchase() {
	return totalPurchase;
  }
  
  public void setTotalPurchase(float totalPurchase) {
	this.totalPurchase = totalPurchase;
  }
  
  @Override
  public String toString() {
	return "Customers{" +
			"id=" + id +
			", name='" + name + '\'' +
			", isActive=" + isActive +
			", totalPurchase=" + totalPurchase +
			'}';
  }
}
