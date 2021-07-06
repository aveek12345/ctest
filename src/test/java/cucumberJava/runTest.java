package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) 
@Cucumber.Options(

//format = {"pretty", "html:target/cucumber"}
 plugin = {
                "pretty",
                "html:results/html",
                "json:results/json/result.json",
                "junit:results/junit/cucumber.xml"
        }
       
        
       
 
                 ) 

public class runTest { }
