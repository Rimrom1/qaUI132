package Selenium.decorator;

import org.openqa.selenium.WebElement;

public class ClickButtonElement extends CustomElement {

    public ClickButtonElement(WebElement webElement) {
        super(webElement);
    }
    public void click() {
        System.out.println("click");
        getWebElement().click();
    }
}
