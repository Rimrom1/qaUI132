package Selenium.intertop.paralel_run;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    private final static ThreadLocal<WebDriver> INSTANCE =new InheritableThreadLocal<>();

    public static WebDriver getDriver(){
        if(INSTANCE.get()==null){
            throw new RuntimeException("init driver first");
        }
        return INSTANCE.get();
    }
    public static void initDriver(String browserName){
        switch (browserName) {
            case "chrome" -> {
                ChromeDriverManager.getInstance().setup();
                INSTANCE.set(new ChromeDriver());
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                INSTANCE.set(new FirefoxDriver());
            }
            case "IE" -> {
                WebDriverManager.iedriver().setup();
                INSTANCE.set(new InternetExplorerDriver());
            }
            case "Opera" -> {
                WebDriverManager.operadriver().setup();
                INSTANCE.set(new OperaDriver());
            }
            case "Safari" -> {
                WebDriverManager.safaridriver().setup();
                INSTANCE.set(new SafariDriver());
            }
            default -> throw new RuntimeException("invalid browser " + browserName);
        }
    }

}

