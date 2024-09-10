package day2;

public class Student  {

	private int id;
	private String name;
	private static int nextId;
	private static String center;
	private static  String country;
	
	static
	{
	   nextId=0;
	   center="TATA STRIVE";
	   country="INDIA";
	}
		
	public Student() 
	{
		super();
	}
	public Student(String name)
	{
		id = ++nextId;
		this.name = name;
	}

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public static String getCenter() 
	{
		return center;
	}

	
	public static String getCountry() 
	{
		return country;
	}

	@Override
	public String toString()
	{
		return "\nid=" + id  + " \nname=" + name + "\ncenter=" +center + "\ncountry=" +country;
	}
	
	
	
	
	
}
