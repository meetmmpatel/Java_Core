package WeekTwo.FileIO;

import java.io.*;

public class FileIntro {
  
  // method that will verify if file is created or not
  static void createFile() {
	File file = new File("Data.txt");
	try {
	  boolean isFile = file.createNewFile();
	  
	  if (isFile) {
		System.out.println("File has been created..");
	  } else {
		System.out.println("File is already created");
	  }
	  
	} catch (IOException e) {
	  System.out.println("File not found!");
	  e.getMessage();
	}
  }
  
  //How to write the file using try with resource..
  
  static void writeFile() {
	try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt"))) {
	  
	  String message = "This is file writer method with try with resource";
	  //Write file with message
	  writer.write(message);
	  
	  //create new line inside file
	  writer.newLine();
	  
	  writer.write(message);
	  writer.close();
	  
	} catch (IOException e) {
	  e.printStackTrace();
	}
  }
  
  
  //How to read the file
  static void readFile() {
	
	try (BufferedReader reader = new BufferedReader(new FileReader("Data.txt"))) {
	  
	  String currentLine;
	  while ((currentLine = reader.readLine()) != null) {
		System.out.println(currentLine);
	  }
	} catch (FileNotFoundException exception) {
	  exception.getMessage();
	} catch (IOException e) {
	  e.printStackTrace();
	} finally {
	  System.out.println("Done reading the file");
	}
	
  }
  
  public static void main(String[] args) {
	createFile();
	writeFile();
	readFile();
  }
}
