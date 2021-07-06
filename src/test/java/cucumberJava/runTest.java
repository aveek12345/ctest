package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 
import org.junit.runner.RunWith;
@RunWith(Cucumber.class) 
@Cucumber.Options(

//format = {"pretty", "html:target/cucumber"}
 format={"json:target/cucumber.json"}
       
        
       
 
                 ) 

public class runTest { }
