package com.test.PageAction;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import com.test.PageLocator.HomePageLocator;
import com.test.utill.TestBase;
import com.test.utill.TestData;
import com.test.utill.Utill;



public class HomePageAction extends TestBase{
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	
	public void EnterXPSinSearchfield() {
		homePageLocator.SearchField.sendKeys(TestData.product1);
		
		
		
		
		
	}
	public void ClickonSearchbutton() {
		
		homePageLocator.SearchButton.click();
	}
	public void VerifySearchresultShoulddisplay() {
		
		boolean verifyResult = homePageLocator.XPSPage.isDisplayed();
		
		Assert.assertTrue(verifyResult);
		
		Utill.takescreenshot(driver, "XPS PAGE");
		
		
	}
	public void ClickSigninlink() {
		
		homePageLocator.SigninLink.click();
		
	}
	public void EnterEnail() throws Exception {
		
		
		homePageLocator.Email.sendKeys(TestData.Emailaddress);
		
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	

}
