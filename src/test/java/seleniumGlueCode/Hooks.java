package seleniumGlueCode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
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
        driverManager = DriverManagerFactory.getManager(DriverType.EDGE);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Scenario number: " + numberOfCase + " was completed");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
