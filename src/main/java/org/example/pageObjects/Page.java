package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    private WebDriver driver;

    private String path = "src/test/resources/driver/chromedriver.exe";

    Page() {
        System.setProperty("Webdriver.chrome.driver :", this.path);
        this.driver = new ChromeDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void getURL(String url) {
        this.driver.get(url);
    }
}
