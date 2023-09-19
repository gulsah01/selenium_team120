import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumIlkTest {
    public static void main(String[] args) {
       System.setProperty("webdriver.chorome.driver","src/resources/chromedriver-mac-arm64.zip");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
    }
}
