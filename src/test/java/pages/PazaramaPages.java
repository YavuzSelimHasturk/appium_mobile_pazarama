package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

public class PazaramaPages {

    public PazaramaPages() {
        PageFactory.initElements(Driver.getAppiumDriver(), this);
    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/btnContinue")
    WebElement skippingButton;

    public void tapOnSkippingButton() {
        skippingButton.click();
    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/logo")
    WebElement pazaramaLogo;

    public void assertionAppOpenedProperly() {
        assert (pazaramaLogo.isDisplayed());
    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/tabCategories")
    WebElement categoriesButton;

    public void tapOnTheCategoriesButton() {
        categoriesButton.click();
    }

    @FindBy(xpath = "//*[@text='Cep Telefonu ve Aksesuar']")
    WebElement sectionCepTelefonu;

    public void selectSubCategory() {
        sectionCepTelefonu.click();
    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/searchArea")
    WebElement searchBox;


    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/fragment_search_input")
    WebElement inputSearchBox;

    public void enterProduct(String product) {
        inputSearchBox.sendKeys(product);

    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/item_search_seller_text")
    WebElement firstProduct;


    public void productSearch(String product) {
        searchBox.click();
        enterProduct(product);
        firstProduct.click();
    }

    @FindBy(xpath = "//*[@text='Sepete Ekle']")
    WebElement buttonSepeteEkle;

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/addBasketButton")
    WebElement buttonSepeteEkle2;

      public void addToCart() throws InterruptedException {
        ReusableMethods.wait(1);
        ReusableMethods.scroll(Driver.getAppiumDriver(), 3);
        ReusableMethods.wait(2);
        buttonSepeteEkle.click();
        ReusableMethods.wait(2);
        buttonSepeteEkle2.click();
    }

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/shoppingBasket")
    WebElement buttonSepet;

    @FindBy(id = "tr.com.topkapidanismanlik.pazarama.app:id/basket_list")
    WebElement sepetList;

    public void assertionProductHasBeenAddedToCart() {
        buttonSepet.click();
        ReusableMethods.wait(2);
        assert (sepetList.isDisplayed());
    }

}