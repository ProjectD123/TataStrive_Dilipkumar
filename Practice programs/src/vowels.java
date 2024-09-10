import java.util.Scanner;

public class vowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING");
        String name = sc.nextLine();

        String result = removeVowels(name);  
        System.out.println("String after removing vowels: " + result);
    }

 
    public static String removeVowels(String input) {
        String vowels = "aeiouAEIOU";
        StringBuilder filteredString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.indexOf(currentChar) == -1) {
                filteredString.append(currentChar);
            }
        }

        return filteredString.toString();
    }
}



