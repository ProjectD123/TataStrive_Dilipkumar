import java.util.Scanner;
public class CapitalOrSmall {
		public static void main(String args[]) {
			System.out.println("Enter Text");
			 Scanner sc = new Scanner(System.in);
			 String text=sc.nextLine();
		     System.out.println("CAPITAL LETTER: "+text.toUpperCase());
		     System.out.println("SMALL LETTER: "+text.toLowerCase());
}
}
