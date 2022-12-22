package stepDefinitions;

import java.io.IOException;

import Base.BaseClass;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends BaseClass {

	public LoginTest() throws IOException {
		super();
		login=new LoginPage();
		// TODO Auto-generated constructor stub
	}

	LoginPage login;


	@Given("^User is on Login page$")
	public void user_is_on_Login_page() throws Throwable {
		System.out.println("user is on Login Page");
	}

	@When("^User entered UserName & password$")
	public void user_entered_UserName_password() throws Throwable {

		login.enterUserName(prop.getProperty("username"));
		login.enterPassword(prop.getProperty("password"));

	}

	@Then("^User should be on Home Page$")
	public void user_should_be_on_Home_Page() throws Throwable {
		login.loginbtn();

	   System.out.println("User should be on Home Page");

	}

}
