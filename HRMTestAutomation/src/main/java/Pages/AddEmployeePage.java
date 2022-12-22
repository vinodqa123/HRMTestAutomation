package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseClass;


public class AddEmployeePage extends BaseClass {

	By PIM_Menu=By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");

	By PIM_Header=By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");

	By dashboard=By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");

	By AddEmployee_Menu=By.xpath("//a[contains(text(),'Add Employee')]");

	By AddEmployee_Header=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[11]");

	By firstname=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]");

	By lastName=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");

	By employeeImg=By.xpath("//img[@class=''employee-image']");

	By saveBtn=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]");

	By EmployeeDetails=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h6[1]");

	By EmpList=By.xpath("//a[contains(text(),'Employee List')]");

	By EmployeeName_search=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");

	By searchBtn=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");


	public AddEmployeePage() throws IOException {
		super();
	//	PageFactory.initElements(driver, this);
	}

	public String f_Name;
	public String l_Name;

	public void navigateToPIMMenu() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIM_Menu));
		driver.findElement(PIM_Menu).click();

	}
	public Boolean verifyPIMMenuHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(PIM_Header));
		String PIMHeader=driver.findElement(PIM_Header).getText();
		Boolean PIMHeader1=PIMHeader.equalsIgnoreCase("PIM");
		return PIMHeader1;
	}
	public Boolean clickOnAddEmployee() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddEmployee_Menu));
		driver.findElement(AddEmployee_Menu).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddEmployee_Header));
		String EmployeeHeader=driver.findElement(AddEmployee_Header).getText();
		Boolean employee=EmployeeHeader.equalsIgnoreCase("Add Employee");
		return employee;

	}
	public void enterEmployeeFirstName(String fname) {
			f_Name=fname;
			wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
			driver.findElement(firstname).clear();
			driver.findElement(firstname).sendKeys(fname);

	}
	public void enterEmployeeLastName(String lname) {
		l_Name=lname;
		wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(lname);

	}

	public void uploadEmployeeProfile() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(employeeImg));
	//	employeeImg.sendKeys("")

	}
	public void SaveEmployee() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));
		driver.findElement(saveBtn).click();

	}
	public Boolean verifyEmployee() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployeeDetails));
		String emp=driver.findElement(EmployeeDetails).getText();
		Boolean empDet=emp.equalsIgnoreCase(f_Name+" "+l_Name);
		return empDet;
	}

	public void navigateToEmployeeListMenu() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmpList));
		driver.findElement(EmpList).click();

	}
	public Boolean dashbaordHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
		String dashheader=driver.findElement(dashboard).getText();
		return dashheader.equalsIgnoreCase(dashheader);

	}


}
