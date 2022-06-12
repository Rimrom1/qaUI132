package Selenium.intertop.page_factory.Login.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.decorator.InputElement;
import Selenium.intertop.paralel_run.BrowserFactory;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginInputPO extends MainPagePO {



    @FindBy(xpath = "//*[@id=\"email\"]")
    private InputElement loginInput;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private InputElement passInput;


    @FindBy(xpath = "//*[@type=\"submit\"]")
    private ClickButtonElement logButt;

    @Step("inputLogin")
    public LoginInputPO inputLogin(String login) {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement commentInputable = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"email\"]")));
        commentInputable.click();
        loginInput.sendKeys(login);
        return this;
    }
    @Step("inputPass")
    public LoginInputPO inputPass(String pass) {
        passInput.sendKeys(pass);
        return this;
    }


    @Step("logButt")
    public LoginInputPO login() {
        logButt.click();
        return this;
    }

    @Step("goToUserPage")
    @Link("https://intertop.ua/ua/")
    public LoginInputPO goToUserPage() {
        BrowserFactory.getDriver().get("https://intertop.ua/ua/?gclid=Cj0KCQjwyYKUBhDJARIsAMj9lkHWXABuHULKKHCoxvkpkT9tGiu6QlFTaig9P4eFGXZNAkMvxm5MiEQaAmt4EALw_wcB");
        return this;
    }
}
