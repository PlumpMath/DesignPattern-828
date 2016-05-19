package decoratepattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream
{
	public LowerCaseInputStream(InputStream in)
	{
		// TODO Auto-generated constructor stub
		super(in);
	}
	public int read() throws IOException
	{
		int c=super.read();
		return (c==-1?c:Character.toLowerCase((char)c));
	}
	public static void main(String[] args)throws Exception
	{
		int c;
		InputStream in=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/decoratepattern/test.txt")));
		while((c=in.read())>=0)
		{
			System.out.print((char)c);
		}
	}
}
