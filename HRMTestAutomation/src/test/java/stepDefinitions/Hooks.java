package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {


	public Hooks() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Before
	public void test() throws InterruptedException, IOException {
		System.out.println("Before");
		browserInitialization();

	}
	@After(order=2)
	public void failedScenario(Scenario sc) throws IOException {

		 if(sc.isFailed()) {
			 try {
			 System.out.println("Driver Object: "+driver);
			 System.out.println("In failed screnaio");
			 TakesScreenshot tc=((TakesScreenshot) driver);
			 byte [] screenshot=tc.getScreenshotAs(OutputType.BYTES);
			 File screenshot1=tc.getScreenshotAs(OutputType.FILE);
			 String  scName=sc.getName();
			 
			 String emScrenshot=scName+".png";
			 String DestFilePath="target/ScreenShots/"+scName+".png";
			 File dest=new File(DestFilePath);
			 
			 FileUtils.copyFile(screenshot1,dest);
			 System.out.println("captured screenshot screnaio");
			 
			 

		 }catch(Exception e){
			 System.out.print("Got an exception while taking screnshot for failed scenario");
		 }
			 
		 }


	}

	@After(order=1)
	public void tearDown() {
		System.out.println("Driver Object: "+driver);
		driver.close();
	}


}
