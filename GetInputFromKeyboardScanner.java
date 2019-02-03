
import java.util.Scanner; 
public class GetInputFromKeyboardScanner{
	
	public static void main (String[ ] args) {

				String name= "";
				System.out.print ("Please Enter Your Name:");

Scanner reader = new Scanner(System.in);  // Reading from System.in
name = reader.nextLine(); // Scans the next token of the input as an int.
//once finished
reader.close();
System.out.println (" Hello " +  name  + " !");

	}
}