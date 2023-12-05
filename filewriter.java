package asd;
import java.io.FileWriter;
import java.io.IOException;
public class filewriter {
	public static void main(String [] args) {
	String data= "My file!!";
	FileWriter writer = null;
	try {
		writer=new FileWriter("input.txt");
				writer.write(data);
				writer.flush();
				writer.close();
		
	}
	catch(IOException e){
		e.printStackTrace();
		
	}
	}

}
