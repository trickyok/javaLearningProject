import java.util.Scanner;

public class HelloJoe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Don't ask who Joe is...");
		String joe = input.nextLine();
		input.close();
		joe = joe.toLowerCase();
		
		if (joe.startsWith("who") && joe.contains("joe")) {
			System.out.print("Joe Mama");
		}
		
	}

}
