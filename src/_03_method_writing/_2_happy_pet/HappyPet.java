package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static boolean sad = true;
	static String pet;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 pet = JOptionPane.showInputDialog("Choose a pet: cat, fish, frog");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(sad == true) {
			int task = JOptionPane.showOptionDialog(null, "What would you like to do?", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet", "feed", "walk" }, null);
			if (task == 0 && pet.equals("cat")) {
				catPet();
			}
			if (task == 1 && pet.equals("cat")) {
				catFeed();
			}
			if (task == 2 && pet.equals("cat")) {
				catWalks();
			}
			if (task == 0 && pet.equals("fish")) {
				fishPet();
			}
			if (task == 1 && pet.equals("fish")) {
				fishFeed();
			}
			if (task == 2 && pet.equals("fish")) {
				fishWalks();
				sad = false;
			}
			if (task == 0 && pet.equals("frog")) {
				frogPet();
			}
			if (task == 1 && pet.equals("frog")) {
				frogFeed();
			}
			if (task == 2 && pet.equals("frog")) {
				frogWalks();
			}
			if(happinessLevel>=10) {
				sad = false;
			}
		}
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			

			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void catPet() {
		JOptionPane.showMessageDialog(null, "the cat purrs happily");
		happinessLevel +=4;
	}
	public static void catFeed() {
		JOptionPane.showMessageDialog(null, "the cat eats happily");
		happinessLevel +=6;
	}
	public static void catWalks() {
		JOptionPane.showMessageDialog(null, "the cat walks happily");
		happinessLevel +=2;
	}
	public static void fishPet() {
		JOptionPane.showMessageDialog(null, "the fish gets sick :(");
		happinessLevel -= 10;
	}
	public static void fishFeed() {
		JOptionPane.showMessageDialog(null, "the fish eats happily");
		happinessLevel +=2;
	}
	public static void fishWalks() {
		JOptionPane.showMessageDialog(null, "the fish suffocates :((((");
		happinessLevel -=100;
	}
	public static void frogPet() {
		JOptionPane.showMessageDialog(null, "the frog is a little uncomfortable");
		happinessLevel -=7;
	}
	public static void frogFeed() {
		JOptionPane.showMessageDialog(null, "the frog eats happily");
		happinessLevel +=6;
	}
	public static void frogWalks() {
		JOptionPane.showMessageDialog(null, "The frog jumps off happily. You never see it again. ");
		happinessLevel +=100;
	}
}