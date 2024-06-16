import java.util.Scanner;
public class Matadd
{
	static void printmat(int c[][],int r, int co)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<co;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void add(int a[][], int b[][],int r,int co)
	{
		int i,j;
		System.out.println("matrix A");
		printmat(a,r,co);
		System.out.println("matrix B");
		printmat(b,r,co);
		int c[][]=new int[r][co];
		for(i=0;i<r;i++)
		{
			for(j=0;j<co;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("matrix addition");
		printmat(c,r,co);
	}
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter row size");
			int r=sc.nextInt();
			int co=r;
			int i,j;
			int a[][]=new int[r][co];
			int b[][]=new int[r][co];
			System.out.println("elements into matrix A");
			for(i=0;i<r;i++)
			{
				for(j=0;j<co;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter elements into matrix B");
			for(i=0;i<r;i++)
			{
				for(j=0;j<co;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			add(a,b,r,co);
	}
}