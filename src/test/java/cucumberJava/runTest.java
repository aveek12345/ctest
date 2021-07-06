package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(
features="src/test/java/cucumberJava",
format = {"pretty", "html:target/cucumber"}
 
                 ) 

public class runTest { }
