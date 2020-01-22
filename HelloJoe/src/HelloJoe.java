import java.util.Scanner;

public class HelloJoe {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Don't ask who Joe is...");
		String joe = input.nextLine();
		input.close();
		joe = joe.toLowerCase();
		
		if (joe.startsWith("who") && joe.contains("joe")) {
			System.out.print("Joe Mama");
			for (int i = 0; i < 10;) {
				try
		        {
		            runtime.exec("notepad.exe");
		 
		            //OR runtime.exec("notepad");
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
			}
		}
		
	}

}
