package InlabWeek1;
public class Main {
	 public static void main(String[] args) {
	     // Create an instance of the Logger
	     Logger logger = Logger.getInstance();

	     // Create instances of EndUser
	     EndUser user1 = new EndUser("Alice");
	     EndUser user2 = new EndUser("Bob");

	     // Log messages using the logger through EndUser instances
	     user1.performAction("Login");
	     user2.performAction("Logout");
	 }
	}