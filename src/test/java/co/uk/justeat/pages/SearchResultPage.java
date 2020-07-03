package co.uk.justeat.pages;

import co.uk.justeat.common.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy
    public void isCorrectURLDisplayedForSearch(String area){
        driver.getCurrentUrl().contains(area);}

public void isPageTitleDisplayed(){

}

}
