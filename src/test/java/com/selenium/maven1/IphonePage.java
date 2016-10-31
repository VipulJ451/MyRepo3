package com.selenium.maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IphonePage {
WebDriver driver;

private By menuitem=By.xpath("//li [@id='menu-item-33']/a");
private By productcategory=By.xpath("//a [@href='http://store.demoqa.com/products-page/product-category/iphones/']");
private By iphonegroup=By.xpath("//div[@class='default_product_display product_view_40 iphones group']/descendant::input[@name='Buy']");
private By checkout=By.xpath("//a [@class='go_to_checkout']");
private By continues=By.xpath("//a [@class='step2']");
private By country=By.xpath("//select[@id='current_country']");
private By select=By.xpath("//input[@name='wpsc_submit_zipcode']");

public IphonePage(WebDriver driver)
{
	this.driver=driver;	
}
public void menu()
{
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(menuitem)).build().perform();
}
public void product()
{
	driver.findElement(productcategory).click();
}
public void iphone()
{
	driver.findElement(iphonegroup).click();
}
public void check()
{
	driver.findElement(checkout).click();
}
public void continued()
{
	driver.findElement(continues).click();
}
public void countries()
{
	Select sel=new Select(driver.findElement(country));
	sel.selectByVisibleText("India");
}
public String selected()
{
	driver.findElement(select).click();
	String a=driver.getCurrentUrl();
	return a;
	
}
public Boolean isAddToCartButtonVisible()
{
 List<WebElement> mylist=driver.findElements(iphonegroup);
 if(mylist.size()==0){
  return false;
 }
 return true;
}

}
