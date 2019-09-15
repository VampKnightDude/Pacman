import java.util.*;

class TheProgram
{
	public static main void{String args[])
	{
		int exit=0, c;
		Scanner scan=new Scanner(Sytem.in);
		System.out.println("This is The Program.");
		
		do
		{
			System.out.pritnln("Make choice: \n 1) Exit.");
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
