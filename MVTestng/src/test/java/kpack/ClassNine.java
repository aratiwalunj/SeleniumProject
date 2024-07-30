package kpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassNine {

	@Test(dataProvider="getdata")	
	public void loginTest(String username,String password)
	{
		System.out.println("Login username is: " +username+ "\t Login password is: " +password);
		
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[4][2];
		
		data[0][0]="Arati";
		data[0][1]="arati@123";
		data[1][0]="santosh";
		data[1][1]="santosh@123";
		data[2][0]="rutansh";
		data[2][1]="rutansh@123";
		return data;
		
		
		
	}
}
