package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseClass;

public class EmployeeList extends BaseClass {


	@FindBy(xpath="//a[contains(text(),'Employee List')]")
	WebElement EmpList;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement EmployeeName_search;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")
	WebElement searchBtn;

	public EmployeeList() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public void navigationEmployeeList() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Employee List')]")));
		EmpList.click();

	}
	public void enterEmployeeNameInSearch(String empName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")));
		EmployeeName_search.sendKeys(empName);

	}
	public void serchBtton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")));
		searchBtn.click();
	}


}
