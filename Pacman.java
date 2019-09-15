/*
<applet code=TheProgram height=1000 width =1000>
</applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class TheProgram extends Applet implements KeyListener
{
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed( KeyEvent ke )
	{
		int key=ke.getKeyCode();
		switch(key)
		{
			case KeyEvent.VK_LEFT: 
						// Move Player LEFT
						break;
			case KeyEvent.VK_RIGHT:
						// Move Player RIGHT
						break;
			case KeyEvent.VK_UP:
						// Move Player UP
						break;
			case KeyEvent.VK_DOWN:
						// Move Player DOWN
						break;
		}
	}
	public void keyReleased( KeyEvent ke)
	{}
	public void keyTyped( KeyEvent ke)
	{}
	public void paint( Graphics g)
	{}
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
