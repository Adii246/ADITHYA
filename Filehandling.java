package asd;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
public static void main(String [] args) {
	char [] data=new char[50];
	FileReader obj = null;
	FileWriter writer= null;
	try {
		 obj=new FileReader("enput.txt");
		 int byteread=obj.read(data);
	      System.out.println(data);
	      obj.close();
	      
	      
	      writer=new FileWriter("output.txt");
	      writer.write(data,0,byteread);
	      writer.flush();
	      writer.close();
	}

	catch(IOException e){
		e.printStackTrace();
		
	}
	
	
}
}
