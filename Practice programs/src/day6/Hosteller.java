package day6;

import java.util.Scanner;

public class Hosteller extends Student 
{
	private String blockName;
	private String roomType;
	double hostalFees=0;
	double totalFees=0;
	


	
	Scanner sc=new Scanner(System.in);

	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFees,String blockName, String roomType)
	{
		super(studentId, studentName, department, gender, category, collegeFees);
		this.blockName = blockName;
		this.roomType = roomType;
	}

	public String getBlockName() 
	{
		return blockName;
	}

	public void setBlockName(String blockName)
	{
		this.blockName = blockName;
	}

	public String getRoomType() 
	{
		return roomType;
	}

	public void setRoomType(String roomType)
	{
		this.roomType = roomType;
	}




	@Override
	public double calculateTotalFees()
	{
		double hostalFees=getCollegeFees();
		
			if(blockName=="A")
			{
				if(roomType=="AC")
				{	
					hostalFees=60000+8000;
				
			    }
				
			else if(blockName=="B")
			{
				    if(roomType=="AC")
				    {
				    	hostalFees=50000+5000;
				    }
				    else
				    {
						hostalFees=50000;
				    }
					
			}
				
			else if(blockName=="C")
			{
					if(roomType=="AC")
				    {
				    	hostalFees=40000+2500;
				    }
				    else
				    {
				    
						hostalFees=40000;
				    }	
		    }	
		
		return totalFees=hostalFees+collegeFees;
	}
}

