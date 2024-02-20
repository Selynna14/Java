/**
*This is a test program for using scanner.
* It includes asking for name, 2 integers, one decimal, division, and multiplication.
* @author Selynna Song 
* @ version 1.0
* date: 2/16/2024
*/
//one surprise code 
import java.util.*;
public class Test
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String userName="";
		int int1=0;
		int int2=0;
		double newDec = 0.0;
		String num1="";
		String num2="";
		String dec="";
		double div;
		double mult;
		boolean badInput = true;
		System.out.println("This program will ask you for your name, two integers, 1 decimal. Then, the two integers will be divided and multiplied by the decimal. ");
		
		while(badInput==true)
		{
			if (userName.length()<=0);
			{		
				System.out.println("What is your name?");
				userName=sc.nextLine();
			}
			if (userName.length()>0);
			{
				badInput=false;
			}
		}
		badInput=true;
		while(badInput==true)
		{
			if	(num1.length()<=0)
			{
				System.out.println("Enter an integer: ");
				num1=sc.nextLine();
				try
					{
						int1 =  Integer.parseInt(num1);
						badInput = false;
					}
					catch (Exception e)
					{
						badInput=true;
						System.out.println("Not valid number/n" + "Error!"+e);
						
					}
			}
		}
		badInput=true;
			
		while(badInput==true)		
		{	
			if	(num2.length()<=0)
			{
				System.out.println("Enter another integer: ");
				num2=sc.nextLine();
				try
					{
						int2 =  Integer.parseInt(num1);
						badInput = false;
					}
					catch (Exception e)
					{
						System.out.println("Error!"+e);
						badInput=true;
					}
			}
		}
			badInput=true;
			
		while(badInput==true)
		{
			if	(dec.length()<=0) 
			{	
				System.out.println("Enter another decimal: ");
				dec=sc.nextLine();
				try
					{
						newDec =  Double.parseDouble(dec);
						badInput = false;
					}
					catch (Exception e)
					{
						System.out.println("Error!"+e);
						badInput=true;
					}
			}
		}
		div = (double)int1/(double)int2;
		mult = div * newDec;
		System.out.println ("Hello "+ userName +", you entered " +int1 + " and " + int2 + " which is "+div+" and multiplied that result by "+dec + " and ended with "+ mult+".");
	}

}

