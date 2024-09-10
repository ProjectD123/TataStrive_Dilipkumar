
public class splitsount {

		public static void main(String[] args) {
			String text = "java is programming language it is widely used in many .Java is platform independent java supports multithreading..... keyword used java";
	        String[] words = text.split("\\s+"); // split by one or more spaces

	        System.out.println("Count: " + words.length);

	        for (int i = 0; i < words.length; i++) {
	            System.out.println("Index " + i + ": " + words[i]);
	        }
	}

}
