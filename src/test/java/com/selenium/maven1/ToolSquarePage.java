package com.selenium.maven1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolSquarePage {
	WebDriver driver;
	private By home = By.xpath("//iframe[@id='IF2']");
	private By homeframe=By.xpath("//li[@aria-controls='tabs-3']");
	private By tab3=By.xpath("//div [@id='tabs-3']/b");
	private By demo =By.xpath("//*[@id='primary-menu']//span[text()='DEMO SITES']");
    private By handling=By.xpath("//a[@class='ripple']/descendant::span[contains(text(),'Handling Alerts using Selenium WebDriver')]");
	private By simplealert =By.xpath("//button[text()='Simple Alert']");
	private By confirmpopup=By.xpath("//button[text()='Confirm Pop up']");
	private By promptpopup=By.xpath("//button[text()='Prompt Pop up']");
    
	public ToolSquarePage(WebDriver driver)
{
	this.driver=driver;
}
public void frame(){
	driver.switchTo().frame(driver.findElement(home));
}


public void clickOnTab3()
{
	
	driver.findElement(homeframe).click();
}
public String tabContent()
{
	String m=driver.findElement(tab3).getText();
	return m;
}
public void defaultContent()
{
	driver.switchTo().defaultContent();
}
public void demos()
{
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(demo)).build().perform();
}
public void handle()
{
	driver.findElement(handling).click();
}
public String simple()
{
	driver.findElement(simplealert).click();
	Alert alert=driver.switchTo().alert();
	 String g=alert.getText();
	 return g;
	 
}
public void accept()
{
	driver.switchTo().alert().accept();
}
public void confirm()
{
	driver.findElement(confirmpopup).click();
	driver.switchTo().alert().dismiss();
}
public void prompt()
{
	driver.findElement(promptpopup).click();
	driver.switchTo().alert().sendKeys("Yes");
	driver.switchTo().alert().accept();
}






}
