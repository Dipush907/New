package Interviews;

import org.testng.annotations.Test;

public class AsciiValues {
	@Test
	public void separator()
	{
		String s="Hema@123";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			int ch=a[i];
			if(ch>=65 && ch<=90||ch>=97 && ch<=122)
			{
				System.out.println("The given character is alphabhet:" +a[i] );
			}
			else if(ch>=47&&ch<=56)
			{
				System.out.println("The given character is numeric:"+ +a[i] );
			}
			else
			{
				System.out.println("The given character is special character:" +a[i] );
			}
		}
	}

}
