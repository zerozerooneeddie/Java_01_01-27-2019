
import java.util.Scanner; 
public class WhileLoop{
		public static void main(String[] args) {

			int x = 0;

			while (x < 10)
			{


        int grade = 0;
         System.out.print ("Please Enter Your Score:");
       Scanner reader = new Scanner(System.in);  // Reading from System.in
			grade = reader.nextInt(); // Scans the next token of the input as an int.
			//once finished
			//reader.close();


				 //System.out.println(x);

      
        if (grade > 90) {
           
            System.out.println (" Congratulations you did great!");
        }

        else if (grade > 60) {
           
            System.out.println (" Congratulations you passed!");
        }

        else {

          	System.out.println (" Sorry you failed!");
	          	}

          x++;

         

		
			}


		}
}