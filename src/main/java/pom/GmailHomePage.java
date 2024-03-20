package pom;

import java.io.IOException;

import javax.security.auth.Subject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import util.Utility;

public class GmailHomePage {
	WebDriver driver;

	@FindBy(xpath="//div[@class='T-I T-I-KE L3']")private WebElement composeButton;
	@FindBy(xpath="//input[@class='agP aFw']")private WebElement tofield;
	@FindBy(xpath="//span[@class='aB gQ pE']")private WebElement clickccfield;
	@FindBy(xpath="(//input[@class='agP aFw'])[2]")private WebElement ccfield;
	@FindBy(xpath="//span[@class='baT']")private WebElement clickBccfield;
	@FindBy(xpath="(//input[@class='agP aFw'])[3]")private WebElement Bccfield;
	@FindBy(xpath="//input[@name='subjectbox']")private WebElement subjectbox;
	@FindBy(xpath="//div[@class='Am aiL Al editable LW-avf tS-tW']")private WebElement textbody;
	@FindBy(xpath="//a[@class='gb_d gb_Fa gb_J']")private WebElement mButtom;
	@FindBy(xpath="//a[@class='V5tzAf jFfZdd Dn5Ezd']")private WebElement signoutButton;
	@FindBy(xpath="(//iframe[@role='presentation'])[3]")private WebElement iframe;
	@FindBy(xpath="//div[text()='Send']")private WebElement sendButton;
	
	public GmailHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnComposeButton() throws InterruptedException
	{
		Utility.waitTime(4000);
		composeButton.click();
		Reporter.log("Clicking on Compose button", true);
	}
	public void enterTofield() throws InterruptedException, IOException
	{
		Utility.waitTime(4000);
		tofield.sendKeys(Utility.getProperty("Tofield"));
		Reporter.log("Entering email into To field ", true);
		
		Utility.ActionsClass(driver);
		Utility.waitTime(2000);
	}
	
	public void clickOnCCfield() throws InterruptedException, IOException  
	{
		Utility.waitTime(2000);
		clickccfield.click();
		Utility.waitTime(2000);
		
	}
	public void enterCCfield() throws IOException, InterruptedException
	{
		ccfield.sendKeys(Utility.getProperty("ccfieldid"));
		Reporter.log("entering cc field", true);
		Utility.ActionsClass(driver);
		Utility.waitTime(2000);
		
	}
	public void clickOnBccfield() throws InterruptedException, IOException
	{
		Utility.waitTime(2000);
		clickBccfield.click();
		Utility.waitTime(2000);
		
	}
	
	public void enterBccfield() throws IOException, InterruptedException
	{
		Bccfield.sendKeys(Utility.getProperty("Bccfieldid"));
		Reporter.log("entering Bcc field", true);
		Utility.ActionsClass(driver);
		Utility.waitTime(2000);
	}
	public void entersubject() throws InterruptedException
	{
		Reporter.log("Entering Subject", true);
		subjectbox.sendKeys("About Test Mail");
		Utility.waitTime(2000);
	}
	public void enterTextbody() throws InterruptedException
	{
		textbody.sendKeys("This is Test Mail");
		Reporter.log("Entering body text ", true);
		Utility.waitTime(2000);
	}
	public void ClickOnSendButton() throws InterruptedException
	{
		sendButton.click();
		Reporter.log("Sending mail", true);
		Utility.waitTime(3000);
	}
	
	public void clickOnmButton() throws InterruptedException
	{
		Utility.waitTime(1500);
		mButtom.click();
		Reporter.log("Clicking on mButton", true);
		Utility.waitTime(3000);
	}
	public void clickOnsignoutButton() throws InterruptedException
	{
		driver.switchTo().frame(iframe);
		signoutButton.click();
		Reporter.log("Signing out Gmail", true);
		Utility.waitTime(5500);
	}
	
	
}
