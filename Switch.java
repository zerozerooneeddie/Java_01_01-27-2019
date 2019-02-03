import java.util.Scanner; 
public class Switch{
    public static void main(String[] args) {

    	int grade = 92;

    		System.out.print ("Please Enter Your Score:");
       Scanner reader = new Scanner(System.in);  // Reading from System.in
			grade = reader.nextInt(); // Scans the next token of the input as an int.
			//once finished
			reader.close();

    	switch (grade){
    		case 100:
    			System.out.println(" Excellent");
    			break;
    		case 90:
    			System.out.println(" Good job");
    			break;
    		case 80:
    			System.out.println(" Study Harder!");
    			break;

    		default:
    			System.out.println(" Sorry you failed!");
    

    	}



	}

}