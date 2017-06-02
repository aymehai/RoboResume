import java.util.Scanner;

public class RoboResumeApp {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your name");
		String userName = keyboard.nextLine();
		System.out.println("Please enter your email address");
		String userEmailAddress = keyboard.nextLine();
		RoboResume newUser = new RoboResume(userName, userEmailAddress);
		String userInput = "0";

		// gets education
		System.out.println("Please enter your educational achievements. Press q to leave");
		for (int i = 0; i < newUser.getEducationLength(); i++) {
			userInput = keyboard.nextLine();
			if (userInput.equalsIgnoreCase("q")) {
				break;
			} else
				newUser.setEducation(userInput, i);
		}
		// gets work
		System.out.println("Please enter your work experiences. Press q to leave");
		for (int i = 0; i < newUser.getWorkLength(); i++) {
			userInput = keyboard.nextLine();
			if (userInput.equalsIgnoreCase("q")) {
				break;
			} else
				newUser.setWork(userInput, i);
		}
		// gets skills
		System.out.println("Please enter your skills with rating Press q to leave");
		for (int i = 0; i < newUser.getSkillsLength(); i++) {
			userInput = keyboard.nextLine();
			if (userInput.equalsIgnoreCase("q")) {
				break;
			} else
				newUser.setSkills(userInput, i);
		}

		System.out.println(newUser.toString());
	}

}
