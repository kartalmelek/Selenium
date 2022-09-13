package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru_01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
      // oldugunu dogrulayin (verify), degilse dogru basligi yazdir.
        driver.get("https://www.facebook.com");
        System.out.println("sayfa basligi :"+ driver.getTitle());

       // 3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualTitle =driver.getTitle();

        String istenenkelime ="facebook";

        if (actualTitle.contains(istenenkelime)){
            System.out.println("title testi  PASSED");
        }else System.out.println("title testi FAILED");

      //  4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");

       // 5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        System.out.println("sayfa basligi :" + driver.getTitle());

       // 6. Tekrar "facebook" sayfasina donun
        driver.navigate().back();

       // 7. Sayfayi yenileyin
        driver.navigate().refresh();

       // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser'i kapatin
        driver.close();


    }
}
