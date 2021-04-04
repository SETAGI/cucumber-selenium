package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage {

    @FindBy(className = "page-title2")
    private WebElement pageTitleLocator;

    private String titleComicsPage = "Category: comics";

//    private By pageTitleLocator = By.className("page-title");

    public ComicsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleComicsPage);
    }

}
