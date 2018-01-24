//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {

	static int Happyness = 0;
	static int Hunger = 0;
	static int Thirst = 0;
	public static void main(String[] args) {
		int Happyness = 0;
		int Hunger = 0;
		int Thirst = 0;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String petName = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
			for (int i = 0; i == 0; i++) {
				i--;
			
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Wat do you want to do with your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "stuff food down its throught", "choke with water." }, null);
			if (task == 0) {
				cuddle();
			}else if (task == 1) {
				Feed();	
			}else if (task == 2) {
				Hydrate();
			}
			}
			if(Happyness<=100 && Hunger>=0 && Thirst>=0) {
			JOptionPane.showMessageDialog(null, "You love your pet");	
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void cuddle() {
		Happyness+=5;
		JOptionPane.showMessageDialog(null, "*Happy noise*\n\nI think its happyness might have gone up\n(Its Happness went up)");
		Hunger+=10;
		Thirst+=10;
	}
	static void Feed() {
		Happyness-=5;
		JOptionPane.showMessageDialog(null, "*Whimper*\n\nI think its Hunger might have gone down\n(Its Happness went down, becouse you just stuffed food down their throught)");
		Hunger-=10;
		
	}
	static void Hydrate() {
		Happyness-=5;
		JOptionPane.showMessageDialog(null, "*Whimper*\n\nI think its Thirst might have gone down\n(Its Happness went down, becouse you flipping stuffed water down their throught)");
		Thirst-=10;
	}
}