package com.cyient.test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.cyient.ExcelUtility.ExcelLogin;
import com.cyient.base.WrapperBase;
import com.cyient.page.OneMgLoginPage;
@Test
public class OneMgLoginTest extends WrapperBase{
	 //TestCase: To verify Sign in Error Message
		@Test(priority=1)
		public void login1() throws IOException, InterruptedException
		{	
			OneMgLoginPage lpage = new OneMgLoginPage(driver);
			ExcelLogin data = new ExcelLogin();
			lpage.click_signin();
			//TC 1.1 Enter mobile number as "h2h3h3"
			lpage.mobile_number(data.excelusername(2)); //read the user name from excel sheet
			Thread.sleep(30000);
			//TC 1.2 Click Continue
			lpage.sign_in();
			lpage.getErrorMessage(); //Verifies the error message "Entered mobile number is not valid. Please enter a valid 10 digit mobile number"
		}
		
		//validCredential
		@Test(priority=2)
		public void login2() throws IOException, InterruptedException
		{
	        OneMgLoginPage lpage = new OneMgLoginPage(driver);
			ExcelLogin data = new ExcelLogin();
			lpage.click_signin();
			Thread.sleep(2000);
			lpage.email(data.excelusername(1)); //read the user name from excel sheet
			Thread.sleep(2000);
			lpage.pass(data.excelpassword(1));//read the password from excel sheet
			Thread.sleep(30000);
			lpage.sign_in();
			
		}
}

