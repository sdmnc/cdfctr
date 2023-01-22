package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    private final By careersLink = By.linkText("Careers");
    private final WebDriver driver;

    public CareersPage clickCareers() {
        driver.findElement(careersLink).click();
        return new CareersPage(driver);
    }


}
