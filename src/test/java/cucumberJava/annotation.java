package cucumberJava;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class annotation { 
   WebDriver driver = null; 
	
   @Given("^I have open the browser$") 
   public void openBrowser() { 
	   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );  
       
       //Instantiating driver object and launching browser
       driver = new ChromeDriver();
      
   } 
	
   @When("^I open Facebook website$") 
   public void goToFacebook() { 
      driver.get("https://www.facebook.com/"); 
      
      
   } 
   
   @Then("^Email placeholder should exist$") 
   public void loginButton() { 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      if(driver.findElement(By.name("email")).isEnabled()) { 
         System.out.println("Test 1 Pass"); 
      } else { 
         System.out.println("Test 1 Fail"); 
      } 
      driver.close(); 
   } 
}