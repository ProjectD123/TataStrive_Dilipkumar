package day6;

public class DayScholar extends Student
{
	
	private float  distance;
	float km=0;
	
	
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFees,float distance)
	{
		super(studentId, studentName, department, gender, category, collegeFees);
		this.distance=distance;
		
	}


	@Override
	public double calculateTotalFees()
	{
		
		if(distance>=30 && distance<=40)
		{
			 km=28000;
		}
		else if(distance>=20 && distance<=30)
		{
			km=20000;
		}
		else if(distance>=10 && distance<=20)
		{
			 km=12000;
		}
		else if(distance>=10)
		{
			 km=6000;
		}
		
		
		return km+=collegeFees;
	}

}
