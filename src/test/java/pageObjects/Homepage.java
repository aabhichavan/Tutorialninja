package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testCase.BasePage;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[text()='My Account']")
WebElement myaccount;

@FindBy(xpath="//a[text()='Register']")
WebElement register;

public void myacct()
{
	myaccount.click();
}
public void registerbutton()
{
	register.click();
}

}
