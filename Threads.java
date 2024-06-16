class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=500;i++)
		System.out.println("i="+i);
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int j=1; j<=500;j++)
		System.out.println("j="+j);
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		for(int k=1; k<=500;k++)
		System.out.println("k="+k);
	}
}

class Threads
{
	public static void main(String args[])
	{
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
	}
}