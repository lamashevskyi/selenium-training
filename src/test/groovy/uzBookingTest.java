import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class uzBookingTest {

    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.navigate().to("http://booking.uz.gov.ua/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void openPage() {

    }



}
