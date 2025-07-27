package testCase;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.RegisterPage;

public class Hometest {

	public WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	}

	@AfterClass
	public void teardwon()
	{
		driver.quit();
	}
	
	@Test
	public void Registestep()
	{
		Homepage hp=new Homepage(driver);
		hp.myacct();
		hp.registerbutton();
		
		RegisterPage rp =new RegisterPage(driver);
		rp.enterfirstname("Abhijeet");
		rp.enterlastname("chavan");
		rp.enteremail("dmnsk2rsmvsbbrd2434@dmail.com");
		rp.telephone("1332434552");
		rp.enterpassword("Danao@13wd3442");
		rp.enterconfirmpassword("Danao@13wd3442");
		rp.clickcheckbox();
		rp.continebtton();
		String confirmmsg=rp.getConfirmationMgs();
		Assert.assertEquals(confirmmsg, "Your Account Has Been Created!");
		
	}
	
}
