package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OneMgLoginPage {
	WebDriver driver;
	
	By clickLogin=By.xpath("//span[normalize-space()='Login']");
	By mobileno= By.xpath("//input[@class='style__input___3NmkT']");
	By email= By.xpath("//div[@id='login-signup-modal--react']//div//div//div//div//div//div//div//div//div//div//input");
	By password=By.xpath("//input[@type='password']");
	By login=By.xpath("//span[normalize-space()='LOGIN']");
	By errorLocator=By.xpath("//span[contains(text(),'Please enter a valid 10 digit Mobile Number or Ema')]");

	public OneMgLoginPage(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		Thread.sleep(2000);
	}
	
	//click the sign in option
	public void click_signin()
	{
		driver.findElement(clickLogin).click();
	}
	// enter mobile number
	public void mobile_number(String values)
	{
		driver.findElement(mobileno).sendKeys(values);
	}
	// enter email id
	public void email(String values)
	{
		driver.findElement(email).sendKeys(values);
	}
	// enter password
	public void pass(String values)
	{
		driver.findElement(password).sendKeys(values);
	}
	//click the login button
	public void sign_in() throws InterruptedException
	{
		 driver.findElement(login).click();
		 Thread.sleep(2000);
	}
	//Verifies the error message "Entered mobile number is not valid. Please enter a valid 10 digit mobile number"
	public String getErrorMessage()
	{
		return driver.findElement(errorLocator).getText().trim();
	}
}
