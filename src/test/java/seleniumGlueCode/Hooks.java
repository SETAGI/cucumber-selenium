package seleniumGlueCode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    public static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        System.out.println("Scenario number:" + (++numberOfCase));
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenshot =((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
