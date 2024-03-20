package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pom.GmailHomePage;
import pom.LoginPage;
import util.Utility;

public class TC01_verifyMailSend extends Base{
	LoginPage lp;
	GmailHomePage hp;
  
@BeforeClass
public void OpenBrowser() throws IOException 
{
	lauchBrowser();
	 
	lp = new LoginPage(driver);		
	hp = new GmailHomePage(driver);
	
}

@BeforeMethod
public void EnterloginPageDetails() throws InterruptedException, IOException
{
	lp.enteremail();
	lp.ClickOnNextButton();
	lp.enterPassword();
	lp.Clickonnext2Button();
	hp.clickOnComposeButton();
	hp.enterTofield();
	hp.clickOnCCfield();
	hp.enterCCfield();
	hp.clickOnBccfield();
	hp.enterBccfield();
	
}

@Test
  public void VerifyMailsendSuccessfully () throws InterruptedException   
 {
	hp.entersubject();
	hp.enterTextbody();
	hp.ClickOnSendButton();
	
}

@AfterMethod
public void LogoutGmail() throws InterruptedException
{
	hp.clickOnmButton();
	hp.clickOnsignoutButton();
	
	
}

@AfterClass
public void quiteBrowser() throws InterruptedException 
{
	closeBrowser();
	Utility.waitTime(2000);
}


}
