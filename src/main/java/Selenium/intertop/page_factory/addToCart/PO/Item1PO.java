package Selenium.intertop.page_factory.addToCart.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class Item1PO extends Male1PO {


    @FindBy(xpath = "//*[@class=\"one-product-in\"]")
    private ClickButtonElement SelectItemButton;

    @Step("SelectItem")
    public AddToCartPO selectItem() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement ItemButt = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"one-product-in\"]")));
        ItemButt.click();
        SelectItemButton.click();
        return new AddToCartPO();
    }



};

