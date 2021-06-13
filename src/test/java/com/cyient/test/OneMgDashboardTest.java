package com.cyient.test;

import org.testng.annotations.Test;

import com.cyient.base.WrapperBase;
import com.cyient.page.OneMgDashboardPage;

public class OneMgDashboardTest extends WrapperBase{

	@Test(priority=3)
	public void Dashboard() 
	{
		OneMgDashboardPage dpage = new OneMgDashboardPage(driver);
		
		dpage.EnterYourCity();
		dpage.SelectCityName();					//TC 2.3 Change location to mysore
		dpage.ClickOnCOVIDTestandPrevention();	//TC 2.4 Click on COVID Test & Prevention
		dpage.SanitizerandHandwash();			// --> Sanitizers & Handwash Products
		dpage.Dettol();							//TC 2.5 Choose Dettol
		dpage.SelectDiscount();					//TC 2.6 Click Discount 10%
		dpage.SortPrice();						//TC 2.7 Sort price --> low to high
		dpage.SortBy();							//TC 2.7 Sort price --> low to high
		dpage.AddProductToCart();				//TC 2.8 Add all the product to cart
		dpage.ProceedToCart();					//TC 2.9 Proceed to cart
		dpage.getDeliveryLocation();			//TC 2.10 Verified the delivery location as Mysore
		dpage.getTotalAmount();					//TC 2.11 Log the total in the report
		dpage.RemoveItem();						//TC 2.11 Remove all the added item in the cart
	}
}
