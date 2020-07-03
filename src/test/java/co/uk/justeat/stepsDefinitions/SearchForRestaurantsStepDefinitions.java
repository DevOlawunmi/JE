package co.uk.justeat.stepsDefinitions;

import co.uk.justeat.pages.BasePage;
import co.uk.justeat.pages.HomePage;
import co.uk.justeat.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.support.PageFactory;

public class SearchForRestaurantsStepDefinitions  extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);

    @Given("I navigate to Just Eat website")
    public void i_navigate_to_just_eat_website() {
launchURL();
    }

    @When("I enter my {string}")
    public void i_enter_my(String postcode) {
homePage.enterPostcode(postcode);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
homePage.clickOnSearchButton();
    }

    @Then("all the restaurants within my {string} are displayed")
    public void all_the_restaurants_within_my_are_displayed(String area) {
searchResultPage.isCorrectURLDisplayedForSearch(area);
    }

    @Then("I click on one of the restaurants currently open")
    public void i_click_on_one_of_the_restaurants_currently_open() {

    }

}
