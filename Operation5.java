import java.io.*;
class Operation5
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("C:\\JavaLab\\testing.txt");
		if(f.exists())
		{
			System.out.println("file read :"+f.canRead());
			System.out.println("file write :"+f.canWrite());
			System.out.println("file name :"+f.getName());
			System.out.println("file path :"+f.getAbsolutePath());
			System.out.println("file length :"+f.length());
		}
		else
		{
			System.out.print("Adi already undi ra howle");
		}
	}
}
