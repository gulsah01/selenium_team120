package tests.day02_driverMethodlari_locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorome.driver","src/resources/chromedriver-mac-arm64.zip");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        System.out.println("title "+ driver.getTitle());
        System.out.println("Url :"+ driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println("window handle degeri: "+ driver.getWindowHandle()); //13F89D6EA66EE0AC2B543C570DD8CD2E
        System.out.println("window handle degerleri seti: "+ driver.getWindowHandles());//[13F89D6EA66EE0AC2B543C570DD8CD2E]


        Thread.sleep(3000);
        driver.close();
    }
}
