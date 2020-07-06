package P1;
import java.util.Scanner;

public class LinearSearch  {
	public static void main(String args[])
	{
		int counter =0, num, item , array[];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of element :");
		num = input.nextInt();
		array = new int[num];
		System.out.println("Enter "  +  num  +  "integers");
		for(counter = 0 ; counter< num; counter++)
			array[counter]= input.nextInt();
		
		
		System.out.println("Enter the search value :");
		item = input.nextInt();
		for (counter = 0; counter < num; counter++)
		{
			if(array[counter]==item)
			{
				 // counter++;
				System.out.println(item+" is present at location "+counter);
				
				break;
				
			}
			if(counter ==num)
				System.out.println(item + "doesn't exist in array");
			
		}
		
	}

}
