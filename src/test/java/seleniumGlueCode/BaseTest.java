package seleniumGlueCode;

import POM.ComicsPage;
import POM.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {

    protected WebDriver driver = Hooks.getDriver();
    //protected HomePage homePage = new HomePage(driver);
    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    //protected ComicsPage comicsPage = new ComicsPage(driver);
    protected ComicsPage comicsPage = PageFactory.initElements(driver,ComicsPage.class);

}
