package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.PazaramaPages;
import utilities.Driver;
import utilities.ReusableMethods;


public class PazaramaSD {
    final static Logger logger = LogManager.getLogger(PazaramaSD.class);
    PazaramaPages pazaramaPages = new PazaramaPages();

    @Given("User opens the Pazarama mobile app")
    public void userOpensThePazaramaMobileApp() {

        Driver.getAppiumDriver();
        logger.info("Pazarama app was launched");
    }

    @And("Reaches the homepage by skipping preview pages")
    public void reachesTheHomepageBySkippingPreviewPages() {
        pazaramaPages.tapOnSkippingButton();
        logger.info("Preview pages before homepage skipped");
    }

    @And("Verify that the app opens correctly")
    public void verifyThatTheAppOpensCorrectly() {
        pazaramaPages.assertionAppOpenedProperly();
        logger.info("Verified that the app was opened correctly");
    }

    @Given("Tap on {string} tab from the sub tabs")
    public void tap_on_tab_from_the_sub_tabs(String string) {
        pazaramaPages.tapOnTheCategoriesButton();
        logger.info("Clicked on the 'Categories' tab at the bottom of the page");
    }

    @Given("Choose the {string}")
    public void choose_the(String string) {
        pazaramaPages.selectSubCategory();
        logger.info("Desired category selected");
    }

    @Given("Search by typing {string} in the search box")
    public void search_by_typing_in_the_search_box(String product) {
        pazaramaPages.productSearch(product);
        logger.info("Search by entering the product name in the search box");
    }

    @Given("The first one of the results is added to the cart")
    public void the_first_one_of_the_results_is_added_to_the_cart() throws InterruptedException {

        pazaramaPages.addToCart();
        logger.info("The product has been added to cart");

    }


    @Given("Verify that the product has been added to the cart")
    public void verify_that_the_product_has_been_added_to_the_cart() {

        pazaramaPages.assertionProductHasBeenAddedToCart();
        logger.info("Verified that the product has been added to cart");

    }


}