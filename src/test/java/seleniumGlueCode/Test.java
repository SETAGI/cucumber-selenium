package seleniumGlueCode;

import POM.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Test extends BaseTest {

    @Given("^User is in the home page imalittletester$")
    public void user_is_in_the_home_page_imalittletester() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

//    @Given("^User is in the home page imalittletester2$")
//    public void user_is_in_the_home_page_imalittletester2() throws Throwable {
//        Assert.assertTrue(false);
//    }

    @When("^Clicks over The little tester comics button$")
    public void clicks_over_The_little_tester_comics_button() throws Throwable {
        homePage.clickOnTitleComics();
    }

    @Then("^Redirects to comics page$")
    public void redirects_to_comics_page() throws Throwable {
        Assert.assertTrue(comicsPage.isTitleComicsDisplayed(),"The redirected page is not correct");
    }

}
