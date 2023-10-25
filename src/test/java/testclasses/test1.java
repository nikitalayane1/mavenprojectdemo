package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 
{
	@BeforeMethod
	public void m1()
	{
		System.out.println("user login ");
	}
    @Test
	public void m2()
	{
		System.out.println("this is m1 method ");
	}
    @Test
    public void m4()
    {
    	System.out.println("this is m4 method");
    }
	@AfterMethod
	public void m3()
	{
		System.out.println(" successfully login ");
	}

}


