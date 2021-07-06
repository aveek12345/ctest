package cucumberJava;
 
import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(

//format = {"pretty", "html:target/cucumber"}
 
       
        format= {"pretty","html:test-output_1",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
       
 
                 ) 

public class runTest { }
