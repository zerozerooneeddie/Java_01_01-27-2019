
import javax.swing.JOptionPane;

public class GetInputFromKeyboardB{
	
	public static void main (String[ ] args){
		String name= " ";
		name=JOptionPane.showInputDialog("Please Enter Your Name");
		String msg = " Hello " + name + " ! ";
		JOptionPane.showMessageDialog(null, msg);

	}

}