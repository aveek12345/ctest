package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(

//format = {"pretty", "html:target/cucumber"}
 format = {"pretty", "html:target/cucumber.json"}
       
        
       
 
                 ) 

public class runTest { }
