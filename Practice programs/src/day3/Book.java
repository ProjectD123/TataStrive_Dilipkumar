package day3;

public class Book 
	{
	String title;
	String author;
	
	public Book(String title, String author)
	{
		super();
		this.title = title;
		this.author = author;
	}
	
@Override
	public String toString()
	{
		return "Book name........ title=" + title + ", author=" + author + "";
	}


public static void main(String[] args)
	{
	 
	Book book1=new Book("Tamil","Valluvar");
	System.out.println(book1.toString());
	
	Book book2=new Book("English","Dilipkumar");
	System.out.println(book2.toString());
	
	Book book3=new Book("Maths","Kumar");
	System.out.println(book3.toString());
	
}

}
