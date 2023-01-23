package week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String input) {
		if (input.length() > 0) {
		System.out.println("***" + input + "***");
		} else {
			//this is to print out a message with the name of the method to know 
			//if the string message is less than one letter
			System.out.println("Asterisk Log: Please enter your message");
		}
		
		
	}
		
	
	
	@Override
	public void Error(String input) {
		
		if ( input.length() > 0) {
			//i created a for loop to make sure that the message is always 
			//encapsulated in asterisk
			//upperbar
		for ( int i = -12; i <= input.length(); i++) {
			System.out.print("*");
		} System.out.println();//inside
		System.out.println("***Error: " + input + "***");
			//lowerbar
		for ( int i = -12; i <= input.length(); i++) {
			System.out.print("*");
		} System.out.println();
		}else {
			//this is to print out a message with the name of the method to know 
			//if the string message is less than one letter
			System.out.println("Asterisk Error: Please enter your message");
		}
	}
		
}
