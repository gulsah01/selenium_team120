package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_IlkClass {
    public static void main(String[] args) {
        /* Test icin her class olusturdugumuzda ilk yapmamiz gereken
        WebDriver objesi olusturmaktir
        wevdriver  objesi istedigimiz  browser in bir kopyasini
        olusturup istedigimiz web islemlerini yapacak

        her browser in dosyasi farkli oldugundan
        projemizde kullanmak istedigimiz her browserin driverini
        selenium.dev deki browser bolumunden indirip kopyaliyoruz.


        her classda o class da kulannacagimiz browseri tanitmaliyiz.
         */
        System.setProperty("webdriver.chorome.driver","src/resources/chromedriver");

        // WebDriver  objesi olusturalim

        WebDriver driver= new ChromeDriver();

        // artik bu driver objesi ile istenen otomasyonlari yapabiliriz

        driver.get("https://www.amazon.com");

    }
}
