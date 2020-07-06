package P1;
import College.Demo; //importing user define package
public class ForLoop1 {
public static void main(String args[])
{
	for(int i = 0 ; i<=5; ++i)
	{
		System.out.println("Print for loop");
	}	
	
	Demo d1 = new Demo(); //from Demo class
	d1.display();
	
}
}
//print for loop 5 times
//hello