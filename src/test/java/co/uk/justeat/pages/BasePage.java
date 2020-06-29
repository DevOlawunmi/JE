package co.uk.justeat.pages;

import co.uk.justeat.common.DriverLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLibrary {
    public Select select;
    public String BASE_URL = "https://www.just-eat.co.uk/";

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }

    public void selectElementByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void waitForElementToBeDisplayed(WebElement element)
    {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
