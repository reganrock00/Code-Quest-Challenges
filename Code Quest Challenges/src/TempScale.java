import java.util.Scanner;

public class TempScale
	{
        static int choice;
        static int choice2;
		public static void main(String[] args)
			{
			boolean yes = true;
			while (yes = true)
				{
				Scanner userInput =new Scanner (System.in);
				Scanner userInput2 =new Scanner (System.in);
				System.out.println("Do you want 1: Fahrenheit to Celsius or 2: Celcius to Fahrenheit?");
				choice = userInput.nextInt();
				
				if (choice == 1)
					{
						System.out.println("Please input degrees Fahrenheit");
			            choice2 = userInput.nextInt();
			            System.out.println(((choice2 - 32) / 1.8) + " degrees Celsius");
					}
				if (choice == 2)
					{
						System.out.println("Please input degrees Celcius");
			            choice2 = userInput.nextInt();	
			            System.out.println(((choice2 * 1.8) + 32) + " degrees Fahrenheit");
					}
				}

			}

	}
