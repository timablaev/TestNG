import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Test {

    WebDriver webDriver = new ChromeDriver();

    @BeforeMethod
  public void beforeTest(){

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");



    }
    @org.testng.annotations.Test
    public void baseTest() throws InterruptedException {
        WebElement webElement3 = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input"))));
        webElement3.sendKeys("xiaomi");
        WebElement webElement4 = webDriver.findElement(By.className("button_color_green"));
        webElement4.click();
        WebElement webElement5 = webDriver.findElement(By.cssSelector("a.goods-tile__picture"));
        webElement5.click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterTest(){

        webDriver.quit();

    }
}
