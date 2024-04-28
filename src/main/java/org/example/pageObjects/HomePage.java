package org.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(css = "password")
    private WebElement password;

    @FindBy(css = "signIn")
    private WebElement buttonSignIn;

    private String adresse = "https://ztrain-web.vercel.app/en/home";

    public void navigateHomePage() {
        this.getURL(adresse);
    }

    public void SignIn() {
        this.email.sendKeys("tchamoelii@gmail.com");
        this.password.sendKeys("elinor");
        this.buttonSignIn.click();
        System.out.println("Test Reussi.");
    }

}
