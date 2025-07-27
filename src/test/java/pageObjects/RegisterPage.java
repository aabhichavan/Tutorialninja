package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testCase.BasePage;

public class RegisterPage extends BasePage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}

@FindBy (id="input-firstname")
WebElement fstname;

@FindBy (id="input-lastname")
WebElement lastname;

@FindBy (id="input-email")
WebElement mail;
	
@FindBy (id="input-telephone")
WebElement telephone;

@FindBy (id="input-password")
WebElement password;

@FindBy (id="input-confirm")
WebElement confirmpassword;

@FindBy (xpath="//input[@type='checkbox']")
WebElement checkbox;

@FindBy (xpath="//input[@type='submit']")
WebElement continuebutton;

@FindBy (xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgcofirmation;

public void enterfirstname(String fname)
{
	fstname.sendKeys(fname);
}
public void enterlastname(String lname)
{
	lastname.sendKeys(lname);
}
public void enteremail(String eml)
{
	mail.sendKeys(eml);
}
public void telephone(String tel)
{
	telephone.sendKeys(tel);
}

public void enterpassword(String pwd)
{
	password.sendKeys(pwd);
}
public void enterconfirmpassword(String pwd)
{
	confirmpassword.sendKeys(pwd);
}
public void clickcheckbox()
{
	checkbox.click();
}
public void continebtton()
{
	continuebutton.click();
}

public String getConfirmationMgs()
{
	try {
			return (msgcofirmation.getText());
	} catch(Exception e)
	{
		return (e.getMessage());
	}
}
}
