package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.BaseClass;



public class LoginPage extends BaseClass  {

	By userName=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
	By passWord=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
	By loginBtn=By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");

	public LoginPage() throws IOException{
		super();
	//	PageFactory.initElements(driver, this);
	}

	public void enterUserName(String UserName) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		driver.findElement(userName).sendKeys(UserName);
		Thread.sleep(1000);
	}
	public void enterPassword(String Password) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(passWord));
		driver.findElement(passWord).sendKeys(Password);


	}
	public void loginbtn() throws InterruptedException{
		driver.findElement(loginBtn).click();
		System.out.println("Driver Object: "+driver);
		Thread.sleep(4000);

	}

}
