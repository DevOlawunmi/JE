package co.uk.justeat.pages;

import co.uk.justeat.common.DriverLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RestaurantDetailsPage extends BasePage {
    public RestaurantDetailsPage(WebDriver driver){
        DriverLibrary.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
