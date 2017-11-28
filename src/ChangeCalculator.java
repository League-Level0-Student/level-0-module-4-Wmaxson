//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {


String nickleAmount = JOptionPane.showInputDialog("How many nickles do you have?");
int nickles = Integer.parseInt(nickleAmount);
double nickles1 = nickles * 0.05;
System.out.println(nickles1);

String dimeAmount = JOptionPane.showInputDialog("How many dimes do you have?");
int dimes = Integer.parseInt(dimeAmount);
double dimes1 = dimes * 0.10;
System.out.println(dimes1);

String QuarterAmount = JOptionPane.showInputDialog("How many Quarters do you have?");
int Quarters = Integer.parseInt(QuarterAmount);
double Quarters1 = Quarters * 0.25;
System.out.println(Quarters1);
		// Calculate how much money the user has and save it in a double variable 
double Amount = nickles1 + dimes1 + Quarters1;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + Amount + " \n\n\n ERROR 404: Sandwich not found");
	}
}

