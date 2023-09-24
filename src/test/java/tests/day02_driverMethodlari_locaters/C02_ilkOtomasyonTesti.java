package tests.day02_driverMethodlari_locaters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkOtomasyonTesti {
    //2. Yeni bir class olusturalim : C03_GetMethods
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
//3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        ///4. Sayfa basligini(title) yazdirin
        System.out.println("title "+ driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik= "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Sayfadaki actula title:"+actualTitle);
        }
//6. Sayfa adresini(url) yazdirin
        System.out.println("Url :"+ driver.getCurrentUrl());
//7. Sayfa url’inin “amazon” icerdigini test edin.

//8. Sayfa handle degerini yazdirin
//9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
//10. Sayfayi kapatin.

Thread.sleep(3000);
  driver.close();
    }
}