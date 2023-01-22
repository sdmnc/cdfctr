package search;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CareersPage;

import static org.testng.Assert.assertEquals;


public class SearchTest extends BaseTests {
    @Test
    public void testSuccessfulSearch() {
        CareersPage careersPage = homePage.clickCareers();
        careersPage.searchJob("Test Engineer");
        String actualTitle = careersPage.getTitle();
        assertEquals(actualTitle, "IT job offers in Poland / remotely - Software Mind",
                "The Tittle is different");


    }
}
