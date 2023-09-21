package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverObjesi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorome.driver","src/resources/chromedriver-mac-arm64.zip");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        // ur yazarken www demesekte istenen url e gider
        // ancak https yazmazsak gitmez

        Thread.sleep(13000);
        driver.close();

    }
}
