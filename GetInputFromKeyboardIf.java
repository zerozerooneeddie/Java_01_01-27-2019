import java.util.Scanner; 
public class GetInputFromKeyboardIf{
public static void main(String[] args) {

        int grade = 0;
       System.out.print ("Please Enter Your Score:");
       Scanner reader = new Scanner(System.in);  // Reading from System.in
			grade = reader.nextInt(); // Scans the next token of the input as an int.
			//once finished
			reader.close();

        if (grade > 90) {
           
            System.out.println (" Congratulations you did great!");
        }

        else if (grade > 60) {
           
            System.out.println (" Congratulations you passed!");
        }

        else {

          	System.out.println (" Sorry you failed!");
          }


	}



}
