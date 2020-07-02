package co.uk.justeat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/div/div/div/form/div/div/label/input")
    private WebElement postCodeField;
    @FindBy (className = "Form_c-search-btn-text_6RDDX")
    private WebElement searchButton;




    public void enterPostcode(String postcode){
        waitForElementToBeDisplayed(postCodeField);
        postCodeField.clear();
        postCodeField.sendKeys(postcode);
    }

    public void clickOnSearchButton(){
        searchButton.click();
            }
     public void isCorrectURLDisplayedForSearch(String area){
        driver.getCurrentUrl().contains(area);
     }
}
