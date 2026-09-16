import java.util.Scanner;

public class ConvertTime {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a time in seconds: ");
		
		int seconds = in.nextInt();
		int minutes = (seconds % 3600) / 60;
		int hours = seconds / 3600;
		int remainingSeconds = seconds % 60;
		
		System.out.println(seconds + " seconds = " 
		+ hours + " hours, " + minutes + " minutes, and " 
		+ remainingSeconds + " seconds.");
	}
}
