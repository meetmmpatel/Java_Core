package WeekTwo.FileIO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ReadWriteFileText {
  
  
  public static void main(String[] args) throws IOException, InterruptedException {
	
	//Read File chars
	//Write file chars
	final PipedInputStream reader = new PipedInputStream();
	final PipedOutputStream writer = new PipedOutputStream();
	
	//Connect to reader and writer
	reader.connect(writer);
	
	//Thread in  java
	
	//Write the file..
	Thread writerThread = new Thread(new Runnable() {
	  @Override
	  public void run() {
		for (int i = 65; i < 91; i++) {
		  try {
			writer.write(i);
			Thread.sleep(500);
		  } catch (IOException | InterruptedException e) {
			e.getMessage();
		  }
		}
	  }
	});
	
	//Read The file
	
	Thread readThread = new Thread(new Runnable() {
	  @Override
	  public void run() {
		for (int i = 65; i < 91; i++) {
		  try {
			System.out.print((char) reader.read());
			Thread.sleep(1000);
		  } catch (InterruptedException | IOException e) {
			System.out.println();
		  }
		}
	  }
	});
	
	//Start the thread
	writerThread.start();
	readThread.start();
	
	//Write first and read leater
	writerThread.join();
	readThread.join();
	
	//Close the writer and reader
	writer.close();
	reader.close();
	
	
  }
}
