package stepDefinitionFile;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import factory.CommonBusinesFuncts;
import io.cucumber.java.en.Given;
import pages.RequestGroup_Pg;
import utils.KeyWords;
import utils.PropertiesFileReader;

public class RequestGroup_SD {
	
	public static WebDriver     driver 			=   HooksCucumbers.Hookdriver;	
	KeyWords        			 		    keys			 	=   new KeyWords(driver);
	CommonBusinesFuncts      cbus				=   new CommonBusinesFuncts(driver);
	RequestGroup_Pg 			   rgpage 			=   new RequestGroup_Pg(driver);
	int 										waitTime  		=  Integer.parseInt(PropertiesFileReader.getProperty("implicitWait"));	
	static Logger 	myLogger 						= LogManager.getLogger(RequestGroup_SD.class.getName());

	
	
	
	@Given("Launch the application URL")
	public void LauncApplicationURL() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));	
		keys.switchFrameByWebElement(rgpage.getIframeHomePage());		
	}
	
	@Given("User Clicks on the Create RGButton")
	public void dummycode1() {
		System.out.println("Dummy Code 1");
		keys.clickElement(rgpage.getWorkTab());	
	}
	
	@Given("Create RG Screen is displayed")
	public void dummycode2() {
		System.out.println("Create RG Screen is displayed");
		keys.clickElement(rgpage.getMyWorkBasket());	
	
	}
	
	
	
	
	
	

}
