package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import Base.BaseClass;
import Pages.AddEmployeePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeTest extends BaseClass{

	AddEmployeePage employeePage;

	public AddEmployeeTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}




	@Given("^User is on Dashboard page$")
	public void user_is_on_Dashboard_page() throws Throwable {
		employeePage=new AddEmployeePage();
		Assert.assertTrue(employeePage.dashbaordHeader());

	}

	@When("^Navigate to PIM Menu$")
	public void navigate_to_PIM_Menu() throws Throwable {
		employeePage.navigateToPIMMenu();

	}

	@Then("^Verify User should be on PIM Menu$")
	public void verify_User_should_be_on_PIM_Menu() throws Throwable {
		Assert.assertTrue(employeePage.verifyPIMMenuHeader());

	}

	@When("^Navigate to Add Employee menu$")
	public void navigate_to_Add_Employee_menu() throws Throwable {
		Assert.assertTrue(employeePage.clickOnAddEmployee());
	}

	@Then("^User should be on Add Employee page$")
	public void user_should_be_on_Add_Employee_page() throws Throwable {

	}

	@When("^Enter Employee first Name & last name$")
	public void enter_Employee_first_Name_last_name() throws Throwable {
		employeePage.enterEmployeeFirstName("Vicky");
		employeePage.enterEmployeeLastName("Shetty");
	}

	@When("^Enter Employee ID$")
	public void enter_Employee_ID() throws Throwable {

	}

	@When("^Upload the Employee profile$")
	public void upload_the_Employee_profile() throws Throwable {

	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws Throwable {
		employeePage.SaveEmployee();
	}

	@Then("^Verify Employee details saved or not$")
	public void verify_Employee_details_saved_or_not() throws Throwable {

	}

	@Then("^navigate to Employee List menu$")
	public void navigate_to_Employee_List_menu() throws Throwable {

	}

	@Then("^Verify employee details displaying or not in grid$")
	public void verify_employee_details_displaying_or_not_in_grid() throws Throwable {

	}

}
