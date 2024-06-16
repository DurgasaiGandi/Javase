import java.util.Scanner;
public class Matmul
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
	static void mul(int a[][], int b[][],int r,int co)
	{
		int i,j,k;
		System.out.println("matrix A");
		printmat(a,r,co);
		System.out.println("matrix B");
		printmat(b,r,co);
		int c[][]=new int[r][co];
		for(i=0;i<r;i++)
		{
			for(j=0;j<co;j++)
			{
				for(k=0;k<r;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("matrix multiplication");
		printmat(c,r,co);
	}
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter row size");
			int r=sc.nextInt();
			int co=sc.nextInt();
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
			mul(a,b,r,co);
	}
}