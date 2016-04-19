import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class uzBookingTest {

    UZBookingPage UZ;
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        UZ = PageFactory.initElements(driver, UZBookingPage.class);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void openPage() {
        UZ.openPage();
    }



}
