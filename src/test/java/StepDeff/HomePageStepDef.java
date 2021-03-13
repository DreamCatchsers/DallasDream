package StepDeff;

import com.test.PageAction.HomePageAction;
import com.test.utill.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef extends TestBase {
	
	HomePageAction homePageAction = new HomePageAction();
	
	
	@Given("^launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	    getURL(URL);
	}

	@Then("^Enter XPS in Search field$")
	public void enter_XPS_in_Search_field() throws Throwable {
		homePageAction.EnterXPSinSearchfield();
	    
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		homePageAction.ClickonSearchbutton();
	    
	}

	@Then("^Verify Search result Should display$")
	public void verify_Search_result_Should_display() throws Throwable {
		homePageAction.VerifySearchresultShoulddisplay();
	    
	}
	@Then("^Click Signin link$")
	public void click_Signin_link() throws Throwable {
		homePageAction.ClickSigninlink();
	}

	@Then("^Enter Enail$")
	public void enter_Enail() throws Throwable {
		homePageAction.EnterEnail();
	}
	//Bari
	@When("^Click on Dress Button$")
	public void click_on_Dress_Button() throws Throwable {
	    
	}

	@Then("^Click on Add to cart Button$")
	public void click_on_Add_to_cart_Button() throws Throwable {
	    
	}

	@Then("^Click on Proceed to checkout Button(\\d+)$")
	public void click_on_Proceed_to_checkout_Button(int arg1) throws Throwable {
	    
	}

	@Then("^Verify SHOPPING-CART SUMMARY page should display$")
	public void verify_SHOPPING_CART_SUMMARY_page_should_display() throws Throwable {
	    
	}


}
