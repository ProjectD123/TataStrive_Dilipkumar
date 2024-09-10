package day1;

import java.util.Scanner;

public class bmiCal {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the height\n");
   double height=sc.nextDouble();
   System.out.println("Enter the weight\n");
   double weight=sc.nextDouble();
   
   double bmi=weight/((height/100)*(height/100));
   
   if(bmi<18.5) 
   {
	   System.out.printf("your bmi is %.2f \n"  ,bmi);
	   double increse=18.5-bmi;
	   System.out.printf("you are underweighted\n you need increse %.2f" ,+increse);
	   
   }
   else if(bmi>=25)
   {
	   System.out.printf("your bmi is:%.2f\n " ,bmi );
	   double decrese=25-bmi;	   
       System.out.printf("you are over weighted\n you need decrese %.2f ",+decrese);  
   }
   else if ((bmi>18.5)&&(bmi<25))
   {
	   System.out.printf("you are correct bmi %.2f" , bmi);
   }
		
	}
	}
