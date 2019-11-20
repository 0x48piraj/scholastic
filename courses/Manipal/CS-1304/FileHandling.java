import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class file
{
	public static void main(String args[]) throws IOException
	{
		String line;
		FileReader f1= new FileReader("hello.txt");
		BufferedReader b1=new BufferedReader(f1);
		int count=0;
		while((line=b1.readLine())!=null)
		{
			count=count+1;
			{
				if(count>2)
				{
					System.out.println(line);
				}
			}
		}
		
		System.out.println("File content printed after 3rd line.");
	}
}
