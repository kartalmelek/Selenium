package day01_seleniumproje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        En ilkel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermemiz gerekir
        bunun icin java kutuphanesinden System.setProperty () methodunu kullaniriz.
        method 2  parametre istemektedir
        ilki kullanacagimiz driver:webdriver.chrome.driver
        ikincisi ise bu driver'in fiziki yolu
         */

        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

        driver.get("https://www.facabook.com");
        Thread.sleep(2000);

        driver.close();
    }
}
