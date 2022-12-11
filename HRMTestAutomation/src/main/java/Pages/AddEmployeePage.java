package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseClass;




public class AddEmployeePage extends BaseClass {

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	WebElement PIM_Menu;

	@FindBy(xpath="//header/div[1]/div[1]/span[1]/h6[1]")
	WebElement PIM_Header;

	@FindBy(xpath="//header/div[1]/div[1]/span[1]/h6[1]")
	WebElement dashboard;

	@FindBy(xpath="//a[contains(text(),'Add Employee')]")
	WebElement AddEmployee_Menu;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]")
	WebElement AddEmployee_Header;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement firstname;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")
	WebElement lastName;

	@FindBy(xpath="//img[@class=''employee-image']")
	WebElement employeeImg;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")
	WebElement saveBtn;


	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]")
	WebElement EmployeeDetails;

	@FindBy(xpath="//a[contains(text(),'Employee List')]")
	WebElement EmpList;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement EmployeeName_search;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
	WebElement searchBtn;


	// //header/div[1]/div[1]/span[1]/h6[1]

	public AddEmployeePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public String f_Name;
	public String l_Name;

	public void navigateToPIMMenu() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")));
		PIM_Menu.click();

	}
	public Boolean verifyPIMMenuHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")));
		String PIMHeader=PIM_Header.getText();
		Boolean PIMHeader1=PIMHeader.equalsIgnoreCase("PIM");
		return PIMHeader1;
	}
	public Boolean clickOnAddEmployee() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Add Employee')]")));
		AddEmployee_Menu.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]")));
		String EmployeeHeader=AddEmployee_Header.getText();
		Boolean employee=EmployeeHeader.equalsIgnoreCase("Add Employee");
		return employee;

	}
	public void enterEmployeeFirstName(String fname) {
		f_Name=fname;
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")));
			firstname.clear();
			firstname.sendKeys(fname);

	}
	public void enterEmployeeLastName(String lname) {
		l_Name=lname;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")));
		lastName.clear();
		lastName.sendKeys(lname);
	}

	public void uploadEmployeeProfile() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class=''employee-image']")));
	//	employeeImg.sendKeys("")

	}
	public void SaveEmployee() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")));
		saveBtn.click();

	}
	public Boolean verifyEmployee() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]")));
		String emp=EmployeeDetails.getText();
		Boolean empDet=emp.equalsIgnoreCase(f_Name+" "+l_Name);
		return empDet;
	}

	public void navigateToEmployeeListMenu() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Employee List')]")));
		EmpList.click();

	}
	public Boolean dashbaordHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")));
		String dashheader=dashboard.getText();
		return dashheader.equalsIgnoreCase(dashheader);

	}


}
