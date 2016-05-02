import java.util.Scanner;

public class LeapYear
	{

		public static void main(String[] args)
			{
			boolean yes = true;
			while (yes = true)
				{
			    Scanner userInput1 =new Scanner (System.in);
		        System.out.println("Please input any year.");
		        int year = userInput1.nextInt();
		        if (year > 1582)
		        	{
		            if (year % 4 == 0)
		              {
		        	  if (year % 100 == 0)
		        		{
		        	    if (year % 400 == 0)
		        	    	{
		                    System.out.println("That year is a leap year.");
		        	    	}
		        	    else if (year % 400 != 0)
		        	    	{
		        	        System.out.println("That year is not a leap year.");	
		        	    	}
		        		}
		        	  else if (year % 1000 != 0)
		        		{
		        		System.out.println("That year is a leap year.");	
		        		}
		             }
		           else if (year % 4 != 0)
		             {
		        	 System.out.println("That year is not a leap year.");
		             }
		        else if (year < 1582)
		           {
		           System.out.println("That year is not a leap year.");  
		           }
				 }
				}
			}

	}
