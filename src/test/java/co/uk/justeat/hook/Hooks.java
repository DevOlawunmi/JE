package co.uk.justeat.hook;

import co.uk.justeat.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browsers {
    String defaultBrowser= "Chrome";
    @Before
public void setUp(){
        launchBrowser(defaultBrowser);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
