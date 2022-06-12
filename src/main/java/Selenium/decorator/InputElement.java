package Selenium.decorator;

import org.openqa.selenium.WebElement;


public class InputElement extends CustomElement{

    public InputElement(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(String text) {
        System.out.println("input "+text);
        getWebElement().sendKeys(text);
    }
}

