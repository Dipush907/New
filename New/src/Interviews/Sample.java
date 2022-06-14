package Interviews;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public void getData(String Companyname, String name) throws IOException
	
	{
	FileInputStream fis=new FileInputStream("./HEMA/src/Interviews/Properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String name1=pobj.getProperty(name);
		String cname=pobj.getProperty(Companyname);
		System.out.println(name1);
		System.out.println(cname);
		
	}

	
	}
	

