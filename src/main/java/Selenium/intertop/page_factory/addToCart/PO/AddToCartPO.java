package Selenium.intertop.page_factory.addToCart.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class AddToCartPO extends Item1PO {


    @FindBy(xpath = "//*[@class=\"jsShowPrice btn  \"]")
    private ClickButtonElement SizeItemButton;

    @FindBy(xpath = "//*[@id=\"basket_add_preview\"]")
    private ClickButtonElement AddToCartButt;

    @Step("SelectItem")
    public AddToCartPO choseSize() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement ItemButt = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"jsShowPrice btn  \"]")));
        ItemButt.click();
        SizeItemButton.click();
        return new AddToCartPO();
    }

    @Step("SelectItem")
    public AddToCartPO addToCartItem() {
        AddToCartButt.click();
        return new AddToCartPO();
    }

    @Step("goToUserPage")
    @Link("https://intertop.ua/ua/")
    public AddToCartPO goToUserPage() {
        BrowserFactory.getDriver().get("https://intertop.ua/ua/?gclid=Cj0KCQjwyYKUBhDJARIsAMj9lkHWXABuHULKKHCoxvkpkT9tGiu6QlFTaig9P4eFGXZNAkMvxm5MiEQaAmt4EALw_wcB");
        return this;
    }



};

