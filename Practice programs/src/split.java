public class split {
	public static void main(String args[]) {
		String text= "Dilip,lokesh,kumar,java";
		String[] names=text.split(",");
		for(String str:names) {
			System.out.println(str);
		}

    
}
}
