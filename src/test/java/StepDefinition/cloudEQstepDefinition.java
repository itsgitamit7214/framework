package StepDefinition;

import PageObject.cloudEQ;
import driverFactory.Drivermanager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cloudEQstepDefinition {



    private cloudEQ CloudEQ  = new cloudEQ(Drivermanager.getDriver());

    @Given("User launches the url")
    public void user_launches_the_url() {
        Drivermanager.getDriver().get("https://www.demoblaze.com/index.html");
    }
    @When("user click on product from the list")
    public void user_click_on_product_from_the_list() {
        CloudEQ.click_product();
    }
    @And("user add the product to the cart")
    public void user_add_the_product_to_the_cart() {
        CloudEQ.add_cart();
    }
    @Then("user navigates to cart")
    public void user_navigates_to_cart() {
        CloudEQ.Cart_btn();
    }
    @And("user clicks on the place order button")
    public void userClicksOnThePlacerOrderButton() {
        CloudEQ.place_order();
    }
    @And("user enters name in the name text field")
    public void user_enters_name_in_the_name_text_field() {
        CloudEQ.enter_name();
    }
    @And("user enter country in the country text field")
    public void user_enter_country_in_the_country_text_field() {
        CloudEQ.enter_country();
    }
    @And("user enter city in the city name text field")
    public void user_enter_city_in_the_city_name_text_field() {
       CloudEQ.enter_city();
    }
    @And("user enter credit card number in the text field")
    public void user_enter_credit_card_number_in_the_text_field() {
      CloudEQ.enter_cardNo();
    }
    @And("user enter card month in the month text field")
    public void user_enter_card_month_in_the_month_text_field() {
      CloudEQ.enter_cardMonth();
    }
    @And("user enter card expiry year in the year text field")
    public void user_enter_card_expiry_year_in_the_year_text_field() {
        CloudEQ.enter_cardYear();
    }
    @Then("user clicks on the purchase button")
    public void user_clicks_on_the_purchase_button() {
        CloudEQ.click_purchase_button();
    }


}

