package week5Assignment;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger message = new AsteriskLogger();
		
		
		message.Log("Hello");
		message.Error("HELLO");
		
		SpaceLogger input = new SpaceLogger();
		
		input.Log("HELLO");
		input.Error("HELLO");
		
	}

}
