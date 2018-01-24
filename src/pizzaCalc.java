//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 


import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;


public class pizzaCalc {

	public static void main(String[] args) {
			
			int pizzaCost = 11;
			String money = JOptionPane.showInputDialog("How much money you got?");
			int Money = Integer.parseInt(money);
			double pizzas = Money/pizzaCost;
			System.out.println(pizzas);
			JOptionPane.showMessageDialog(null, "You can buy " + pizzas + ". Knock yourself out");
	}
}

