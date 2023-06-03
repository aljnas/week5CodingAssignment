package week5Code;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Logger asteriskLogger = new AsteriskLogger();
   Logger spacedLogger = new SpacedLogger();
   
   asteriskLogger.log("Test");
   asteriskLogger.error("Fail");
   
   spacedLogger.log("Test");
   spacedLogger.log("Passed");
	}

}
