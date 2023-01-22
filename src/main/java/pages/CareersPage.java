package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareersPage {
    private final WebDriver driver;
    private final By searchformField = By.id("autoComplete");
    private final By filterName = By.xpath("label[for='chisinau'] span[class='custom-checkbox__label']");

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchJob(String jobName) {
        driver.findElement(searchformField).sendKeys(jobName);
        driver.findElement(searchformField).sendKeys(Keys.ENTER);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void filterResults() {
        WebElement radio = driver.findElement(filterName);
        radio.click();
    }
}
