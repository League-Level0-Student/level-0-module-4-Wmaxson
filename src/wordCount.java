import javax.swing.JOptionPane;

public class wordCount {
public static void main(String[] args) {
	String theWord = JOptionPane.showInputDialog("What word would you like to repeat");
	String theNumberInWordForm = JOptionPane.showInputDialog("How many times would you like to repeat that word?");
	int theNumber = Integer.parseInt(theNumberInWordForm);
	for (int i = 0; i < theNumber; i++) {
		System.out.println(theWord + " ( " + (i+1) + " )");
	}
	
}
}
