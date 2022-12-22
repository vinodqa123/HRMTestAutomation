package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseClass;

public class EmployeeList extends BaseClass {

	By EmpList=By.xpath("//a[contains(text(),'Employee List')]");

	By EmployeeName_search=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");

	By searchBtn=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");


	public EmployeeList() throws IOException {
		super();
	//	PageFactory.initElements(driver, this);
	}

	public void navigationEmployeeList() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(EmpList));
		driver.findElement(EmpList).click();

	}
	public void enterEmployeeNameInSearch(String empName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(EmployeeName_search));
		driver.findElement(EmployeeName_search).sendKeys(empName);

	}
	public void serchBtton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
		driver.findElement(searchBtn).click();
	}
	public Boolean verifyEmpInGrid(String EmpName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),"+EmpName+")]")));
		boolean name=driver.findElement(By.xpath("//div[contains(text(),"+EmpName+")]")).isDisplayed();
		return name;

	}


}
