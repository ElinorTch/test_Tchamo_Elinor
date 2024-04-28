import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirsTest {
    private WebDriver driver;
    private String path = "src/test/resources/driver/chromedriver.exe";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", this.path);
        this.driver = new ChromeDriver();
    }

    @Test
    public void signUp() {
        this.driver.get("https://ztrain-web.vercel.app/en/home");
        this.driver.findElement(By.id("email_register")).sendKeys("elinor@gmail.com");
        this.driver.findElement(By.id("password_register")).sendKeys("12345678");
        this.driver.findElement(By.id("confirm_password_register")).sendKeys("12345678");
        this.driver.findElement(By.id("btn_register"));
    }

    @Test
    public void signIn() {
        this.driver.get("http://localhost:4200/signIn");
        this.driver.findElement(By.id("email")).sendKeys("tchamoelii@gmail.com");
        this.driver.findElement(By.id("password")).sendKeys("elinor");
        this.driver.findElement(By.id("signIn")).click();

        String email = "";
        boolean visibled = this.driver.findElement(By.id("email")).isDisplayed();

        if (visibled) {
            email = this.driver.findElement(By.id("email")).getText();
            System.out.println("Email : " + email);
            Assert.assertEquals(email, "tchamoelii@gmail.com", "Connexion reussie");
        } else {
            System.out.println("Pas d'email");
        }
    }
}
