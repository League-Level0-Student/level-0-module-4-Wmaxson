//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int answer = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
        int answer1 = JOptionPane.showConfirmDialog(null, "R u on vacation??", "", JOptionPane.YES_NO_OPTION);

        isWeekday = IntToBo(answer);
        isVacation = IntToBo(answer1);
        
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
        if (isVacation == true || isWeekday == false) {
        	JOptionPane.showMessageDialog(null, "sleep in. Wait... if you you awnserd these queastions, why, are you asking a computer if you shold sleep in. Most poeple can make these connections their mind, maybe, you could go to a hospital and see a doctorr about this... ");
			
		}else {
			JOptionPane.showMessageDialog(null, "Get up! *Incert sound effect of pots banging together*");
			
		}
    }
   static boolean IntToBo(int y) {
	   if (y == 0) {
		   return true;
		   
   } else {
	   return false;
   }
   }
}
