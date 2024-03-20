package pom;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import util.Utility;

public class LoginPage  {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"identifierId\"]")private WebElement email;
	@FindBy(xpath="//span[text()='Next']")private WebElement nextButton;
	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")private WebElement passwordfield;
	@FindBy(xpath="//span[text()='Next']")private WebElement nextbutton2;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enteremail() throws InterruptedException, IOException
	{
		Utility.waitTime(3000);
		Reporter.log("entering the email", true);
		email.sendKeys(Utility.getProperty("email"));
	}
	
	public void ClickOnNextButton() throws InterruptedException
	{
		Utility.waitTime(2000);
		Reporter.log("Clicking on Next Button", true);
		nextButton.click();
	}
	
	public void enterPassword () throws IOException, InterruptedException
	{
		Utility.waitTime(3000);
		passwordfield.sendKeys(Utility.getProperty("password"));
		Reporter.log("Enteting password", true);
	}
	
	public void Clickonnext2Button() throws InterruptedException
	{
		Utility.waitTime(3000);
		nextbutton2.click();
		Reporter.log("clicking on next2 button", true);
	}
	
		
}

