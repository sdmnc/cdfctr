package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    public static void main(String[] args) {
        BaseTests driver = new BaseTests();
        driver.setUp();
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://softwaremind.com/");
        driver.findElement(By.xpath
                ("//div[@class='cksRight']//button[contains(text(),'OK, I agree')]")).click();
        homePage = new HomePage(driver);

    }

//    @BeforeMethod
//    public void acceptCookies(){
//        driver.findElement(By.xpath
//                ("//div[@class='cksRight']//button[contains(text(),'OK, I agree')]")).click();

  // }
   @AfterClass
   public void tearDown() {
      driver.quit();
  }
}
