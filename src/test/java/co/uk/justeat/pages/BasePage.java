package co.uk.justeat.pages;

import co.uk.justeat.common.DriverLibrary;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLibrary {
    public Select select;
    public String BASE_URL = "https://www.just-eat.co.uk/";

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
}
