package tests.day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_SeleniumWebDriver {
    public static void main(String[] args) {
        // ilk adimi atlayip direk webdriver objesi olusturalim
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        /*
        Selenium 4.1son versiyonlarindan birinde kendi webDriver classini ekledi.
        boylece oncesinde driver.exe dosyasini tanitmasak da
        istedigimiz browseri calistirir

        Sadece oncelikle bizden bir driver bekledigi icin
        birazcik gec calisir

        Sirketler acik kaynakli driver kullanmayi tercih etmez
        genellikle  satin aldiklari bir driveri kullanmanizi isterler
        bu durumda size verdikleri driver ile ilk satiri yazmalisiniz
         */
    }
}
