package ODEV;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soru_02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2.  Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
         driver.get("https://www.youtube.com");

        if(driver.getTitle().contains("youtube")){

            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED" +driver.getTitle());

        //3.  Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.

        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("Passed");
        }else System.out.println(" youtube CurrentUrl() = " + driver.getCurrentUrl());

        //4.  Daha sonra Amazon sayfasina gidin https://www.amazon.com/
         driver.navigate().to("https://www.amazon.com");

        //5.  Youtube sayfasina geri donun
        driver.navigate().back();

        //6.  Sayfayi yenileyin
        driver.navigate().refresh();

        //7.  Amazon sayfasina donun
        driver.navigate().forward();

        //8.  Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9.  Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        if(driver.getTitle().contains("Amazon")){
            System.out.println("Passed");
        }else System.out.println(driver.getTitle());

        //10. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

        if(driver.getCurrentUrl().contains("https://www.amazon.com/")){
            System.out.println("Passed");
        }else System.out.println("Test is Failled. actuel URL = "+driver.getCurrentUrl());

        //11. Sayfayi kapatin
        driver.close();
    }
}
