package com.test.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.test.utill.TestBase;

public class HomePageLocator extends TestBase{
	
	
public HomePageLocator() {
		
		PageFactory.initElements(driver,this);
}
		@FindBy(how=How.XPATH, using="//input[@class='mh-search-input']")
		public WebElement SearchField;
		
		@FindBy(how=How.XPATH, using="//span[@class='mh-search-button-label']")
		public WebElement SearchButton;
		
		@FindBy(how=How.ID, using="directContentTitleText")
		public WebElement XPSPage;
		
		@FindBy(how=How.XPATH, using="//a[@class='login']")
		public WebElement SigninLink;
		
		@FindBy(how=How.ID, using="email_create")
		public WebElement Email;
		
		@FindBy(how=How.ID, using="signInPartialContent")
		public WebElement UsernameField;
		
		@FindBy(how=How.LINK_TEXT, using="Sign in")
		public WebElement Signin;
		
		//Baro
		@FindBy(how=How.XPATH, using="/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
		public WebElement Dress;
		
		
		
		
		
		
		
		
	}
	
	


