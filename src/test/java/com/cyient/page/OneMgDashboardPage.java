package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneMgDashboardPage {
	
	WebDriver driver;
	
	By CityLocator=By.xpath("//input[@id='location-selector']");
	By CityNameLocator=By.xpath("//input[@value='Mysore']");
	By CovidTestLocator=By.xpath("//span[normalize-space()='COVID Test & Prevention']");
	By SnHLocator=By.xpath("//a[contains(text(),'Sanitizers & Handwash Products')]");
	By DLocator=By.xpath("//span[contains(text(),'Dettol')]");
	By DiscountLocator=By.xpath("//span[contains(text(),'10% and above')]");
	By SortLocator=By.xpath("//body/div[@id='layout-container']/div[@id='content-container']/div/div/div/div[@id='container']/div/div[@id='category-container']/div/div/div/div/div[1]/div[3]/div[1]");
	By HighLocator=By.xpath("//li[@data-key='price_high']");
	By AddcartLocator=By.xpath("//div[@id='category-container']//div//div//div//div//div//div//div//div//span//div//div");
	By PLocator=By.xpath("//div[@data-auto-cart-counter='true']//div");
	By LocationLocator=By.xpath("//body/div[@id='layout-container']/div[@id='content-container']/div/div/div/div[@id='container']/div/div/div/div/div/div/div/div/div/div/div/div[2]/span[1]");
	By TotalLocator=By.xpath("//div[@data-label='offered-price']");
	By RemoveLocator=By.xpath("//div[@data-tag='cart-line-item']//div//a//div//span");
	
	public OneMgDashboardPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void EnterYourCity()
	{
		driver.findElement(CityLocator).click();
	}
	public void SelectCityName() 	//TC 2.3 Change location to mysore
	{
		driver.findElement(CityNameLocator).click();
	}
	//TC 2.4 Click on COVID Test & Prevention --> Sanitizers & Handwash Products
	public void ClickOnCOVIDTestandPrevention() 
	{
		driver.findElement(CovidTestLocator).click();
	}
	public void SanitizerandHandwash()
	{
		driver.findElement(SnHLocator).click();
	}
	public void Dettol()	//TC 2.5 Choose Dettol
	{
		driver.findElement(DLocator).click();
	}
	public void SelectDiscount()	//TC 2.6 Click Discount 10%
	{
		driver.findElement(DiscountLocator).click();
	}
	public void SortPrice()	//TC 2.7 Sort price --> low to high
	{
		driver.findElement(SortLocator).click();
	}
	public void SortBy()	//TC 2.7 Sort price --> low to high
	{
		driver.findElement(HighLocator).click();
	}
	public void AddProductToCart()	//TC 2.8 Add all the product to cart
	{								//Only 1 product is available here to add to cart.
		driver.findElement(AddcartLocator).click();
	}
	public void ProceedToCart() 	//TC 2.9 Proceed to cart
	{
		driver.findElement(PLocator).click();
	}
	public String getDeliveryLocation()	//TC 2.10 Verify the delivery location as Mysore
	{
		return driver.findElement(LocationLocator).getText().trim();
	}
	public String getTotalAmount()	//TC 2.11 Log the total in the report
	{
		return driver.findElement(TotalLocator).getText().trim();
	}
	public void RemoveItem() 	//TC 2.11 Remove all the added item in the cart
	{
		driver.findElement(RemoveLocator).click();
	}
	
}
