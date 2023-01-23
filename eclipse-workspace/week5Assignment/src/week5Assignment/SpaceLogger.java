package week5Assignment ;

public class SpaceLogger implements Logger{

	@Override
	public void Log(String input) {
		
		if (input.length() > 0) {
		char[] spaceLog = input.toCharArray();
		for (char c : spaceLog) {
			System.out.print(c + " ");
		} System.out.println();
		} else {
			//this is to print out a message with the name of the method to know 
			//if the string message is less than one letter
			System.out.println("SpaceLog: Please enter your message");
		}
	}

	@Override
	public void Error(String input) {
		
		if (input.length() > 0) {
			System.out.print("ERROR: ");
			char[] spaceLog = input.toCharArray();
			for (char c : spaceLog) {
				System.out.print(c + " ");
			}
			} else {
				//this is to print out a message with the name of the method to know 
				//if the string message is less than one letter
				System.out.println("SpaceError: Please enter your message");
			}
	}

	
	
	
}
