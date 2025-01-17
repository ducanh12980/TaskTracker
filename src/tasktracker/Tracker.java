package tasktracker;

public class Tracker {
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * handle the user input (command line interface)
	 * through sysarg
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java TaskTracker [command] [arguments...]");
			return;
		}
		
		String command = args[0].toLowerCase();
		
		switch (command) {
		case "add":
			//
		case "update":
			//
		case "delete":
			int x = 0;
			x = 5
			
		}
	}
}
