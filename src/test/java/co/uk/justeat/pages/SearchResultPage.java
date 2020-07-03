package co.uk.justeat.pages;

import co.uk.justeat.common.DriverLibrary;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }

   @FindBy(tagName = "h1")
   private WebElement pageTitle;
    @FindBy(className = "c-listing-item-info")
    private List<WebElement>searchResults;


    public void isCorrectURLDisplayedForSearch(String area){
        driver.getCurrentUrl().contains(area);}

public void isPageTitleDisplayed(){
    Assert.assertTrue(pageTitle.isDisplayed());
}
public RestaurantDetailsPage selectRandomRestaurant(){
    Random random = new Random();
    int ran =random.nextInt(searchResults.size()-1);
    searchResults.get(ran).click();
    return new RestaurantDetailsPage(driver);

}
//    public RestaurantDetailsPage clickOnTheFirstResultLink()
//   {
//        searchResults.get(0).click();
//        return new RestaurantDetailsPage(driver);
//   }


}
