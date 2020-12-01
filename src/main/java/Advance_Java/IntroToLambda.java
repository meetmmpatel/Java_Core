package Advance_Java;

import java.awt.*;

public class IntroToLambda {
  
  
  public static void main(String[] args) {
	
	Frame frame = new Frame("Action Listner before java 8");
	Button button = new Button("Click Hear");
	
	button.setBounds(50, 100, 80, 50);
	
	//Without Lambda..
//	button.addActionListener(new ActionListener() {
//	  @Override
//	  public void actionPerformed(ActionEvent e) {
//		System.out.println("Hello World!!");
//	  }
//	});
	
	//With Lambda
	button.addActionListener( e -> {
	  System.out.println("Hello World with lambda..");
	});
	
	frame.add(button);
	frame.setSize(200, 200);
	frame.setLayout(null);
	frame.setVisible(true);
  }
  
  
}
