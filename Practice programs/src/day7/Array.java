package day7;

public class Array
{

	public static void main(String[] args)
	{
		String[] student= {"Dilip","Kumar","Rajesh","Lokesh","Ram"};
	    int[][] marks= {{98,78,67,76,98},{98,78,67,76,98},{98,78,67,76,98},{98,78,67,76,98},{98,78,67,76,98}};

	    for(int i=0;i<student.length;i++)
	    {
	    	System.out.println(student[i]);
	    	int total=0;
	    	for(int j=0;j<marks[i].length;j++)
	    	{
	    		total+=marks[i][j];
	    		System.out.println(marks[i][j]);
	    	}
	    	System.out.println("total:" +total);
	    }   
	}

}
