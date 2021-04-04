package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element) throws Exception {
        try{
            element.click();
        }catch (Exception e){
            throw new Exception("Impossible to click on " + element);
        }
    }

    public void click(By element) throws Exception {
        try{
            driver.findElement(element).click();
        }catch (Exception e){
            throw new Exception("Impossible to click on " + element);
        }
    }

    public boolean isDisplayed(WebElement element) throws Exception {
        try{
            return element.isDisplayed();
        }catch (Exception e){
            throw new Exception(element + "was not founded");
        }
    }

    public boolean isDisplayed(By element) throws Exception {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception(element + "was not founded");
        }
    }

    public String getText(WebElement element) throws Exception {
        try{
            return element.getText();
        }catch (Exception e){
            throw new Exception(element + "was not founded");
        }
    }

    public String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception(element + "was not founded");
        }
    }

    public String getTitle() throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("Title was not founded");
        }
    }



}
