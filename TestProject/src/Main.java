import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter two strings, I'll tel you if they're equal");
		
		String string1 = scan.nextLine();
		String string2 = scan.nextLine();
		
		if (string1.equals(string2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
}

}