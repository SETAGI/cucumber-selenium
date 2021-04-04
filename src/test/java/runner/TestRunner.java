package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumGlueCode"),
        plugin = {"json:test/report/cucumber-report.json"}
)

public class TestRunner {

    @AfterClass
    public static void finish(){
        try{
            System.out.println("Generating report ");
            String[] cmd = {"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Report generated successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
