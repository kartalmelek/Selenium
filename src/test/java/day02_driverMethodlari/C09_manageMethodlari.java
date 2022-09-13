package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        /*
        ileride wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken ,ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir
        veya bir webelementinin kullanabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi  ve sayfadaki elementlereulasim icin beklenecek MAXIMUM
        sureyi belirleme olanagi tanir
         */
        driver.close();
    }
}
