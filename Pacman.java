import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


class TheProgram
{
	public static main void{String args[])
	{
		int exit=0, c;
		Scanner scan=new Scanner(Sytem.in);
		
		do
		{
			c=scan.nextInt();
			switch(c)
			{
				case 1:
					exit=1;
					break;
				default:
					System.out.println("\a\nERROR: Invalid Menu Input);
					break;
			}
		}while(exit==0);
	}
}
