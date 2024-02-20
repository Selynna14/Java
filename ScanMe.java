/**
*This is a test program for using scanner.
* It includes asking for name, 2 integers, one decimal, division, and multiplication.
* @author Selynna Song 
* @ version 1.0
* date: 2/16/2024
*/
//one surprise code 
import java.util.*;
public class ScanMe
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String userName="";
		int int1=0;
		int int2=0;
		double newDec = 0.0;
		double checkName=0.0;
		String num1="";
		String num2="";
		String dec="";
		double div;
		double mult;
		boolean badName = true;
		boolean badInt1 = true;
		boolean badInt2 = true;
		boolean badDec = true;
		System.out.println("This program will ask you for your name, two integers, 1 decimal. Then, the two integers will be divided and multiplied by the decimal. ");
		
		//While loop for name 
		while(badName)
		{	
			if (userName.length()<=0);
			{		
				System.out.println("What is your name?");
				userName=sc.nextLine();
			}
			try
			{
				//What to do here?
				badName = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+e);
			}
		//while loop for first integer.
		while (badInt1)
		{
			if (num1.length()<=0)
			{
				System.out.println("Enter an integer: ");
				num1=sc.nextLine();
			}
			try
			{
				int1 =  Integer.parseInt(num1);
				badInt1 = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+ e);
			}
		}
		//while loop for second integer.
		while (badInt2)
		{
			if (num2.length()<=0)
			{
				System.out.println("Enter another integer: ");
				num2=sc.nextLine();
			}
			try
			{
				int2 =  Integer.parseInt(num2);
				badInt2 = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+ e);
			}
		}
		//while loop for decimal.
		while (badDec)
		{
			if (dec.length()<=0)
			{
				System.out.println("Enter a decimal: ");
				dec=sc.nextLine();
			}
			try
			{
				newDec =  Double.parseDouble(dec);
				badDec = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+ e);
			}
		}
		div = (double)int1/(double)int2;
		mult = div * newDec;
		System.out.println ("Hello "+ userName +", you entered " +int1 + " and " + int2 + " which is "+div+" and multiplied that result by "+dec + " and ended with "+ mult+".");
	}
}
