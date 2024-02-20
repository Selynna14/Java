/**
*This is a test program for using JOptionPane.
* It includes asking for name, 2 integers, one decimal, division, and multiplication.
* @author Selynna Song 
* @ version 1.0
* date: 2/16/2024
*/
//one surprise code 
import javax.swing.*;
public class PaneMe
{
public static void main (String[] args)
	{
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
		int dialogButton;
		JOptionPane.showMessageDialog(null,"This program will ask you for your name, two integers, 1 decimal. Then, the two integers will be divided and multiplied by the decimal. ");
		
		dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "Do you want to proceed?","COMFIRMATION", dialogButton);
            if(dialogButton == JOptionPane.YES_OPTION) 
            {
				badName = true;
				badInt1 = true;
				badInt2 = true;
				badDec = true;  
			}
            if(dialogButton == JOptionPane.NO_OPTION) 
            {
				badName = false;
				badInt1 = false;
				badInt2 = false;
				badDec = false;
                JOptionPane.showMessageDialog(null,"Okay, Bye!");
                System.exit(0);
             }
		/*
		while(badName)
		{
		if (userName.length()<=0);
				{		
					userName = JOptionPane.showInputDialog("What is your name?");
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
		}
		*/
		//while loop for first integer.
		while(badInt1==true)
		{
			if (num1.length()<=0)
			{

				num1 = JOptionPane.showInputDialog("Enter an integer: ");
				
			}
			try
			{
				int1 =  Integer.parseInt(num1);
				badInt1 = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+ e);
				badInt1 = true;
			}
		}
		//while loop for second integer.
		while (badInt2)
		{
			if (num2.length()<=0)
			{
				num2 = JOptionPane.showInputDialog("Enter another integer: ");
				
			}
			try
			{
				int2 =  Integer.parseInt(num2);
				badInt2 = false;
			}
			catch (Exception e)
			{
				System.out.println("Error!"+ e);
				badInt2 = true;
			}
		}
		div = (double)int1/(double)int2;
		mult = div * newDec;
	}
}
