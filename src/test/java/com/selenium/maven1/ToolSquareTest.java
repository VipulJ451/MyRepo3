package com.selenium.maven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolSquareTest {
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void after()
	{
		driver.quit();
	}
	@Test
	public void toolSquare()
	{
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		ToolSquarePage tsp=new ToolSquarePage(driver);
		tsp.frame();
		tsp.clickOnTab3();
		String d=tsp.tabContent();
		Assert.assertTrue("Content 3 Title".equals(d));
		tsp.defaultContent();
		tsp.demos();
		tsp.handle();
		String e=tsp.simple();
		 Assert.assertTrue("A simple Alert".equals(e));
		 System.out.println(e);
		 tsp.accept();
		 tsp.confirm();
		 tsp.prompt();
		
	}	
	@Test
	public void iphone()
	{
		driver.get("http://store.demoqa.com/");
		IphonePage iph=new IphonePage(driver);
		iph.menu();
		 iph.product();
		 iph.iphone();
		 iph.isAddToCartButtonVisible();
		 System.out.println("Present");
		 iph.check();
		 iph.continued();
		 iph.countries();
		 String p=iph.selected();
		 Assert.assertTrue( "http://store.demoqa.com/products-page/checkout/".equals(p));
		 System.out.println(p);
		
	}
}

