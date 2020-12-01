package pratical_application;

public class CodeTest_1 {
  
  String s;
  
  public static void main(String argv[]) {
	CodeTest_1 m = new CodeTest_1();
	m.amethod();
	
	
	//what is value of result will be?
	String[] elements = {"Java", "is", "platform", "independent"};
	String result = (elements.length > 0) ? elements[0] : null;
	System.out.println(result);
 
	int[][] a1 = {{1,2,3},{4,5,6},{7,8,9,10}};
	System.out.print(a1[0][2]+","+a1[1][0]+","+a1[2][1]);
  }
  
  void amethod() {
	System.out.println(s);
  }
  
  
}
