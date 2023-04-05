import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.GamesAndConsolesPage;
import pageobjects.HomePage;

import java.lang.module.FindException;

public class AmazonTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
    }

    /*@AfterMethod
    public void teardown() {
        driver.quit();
    }*/

    @Test
    public void testAmazon1() {
        // test search
        HomePage homePage = new HomePage(driver);
        //test cookies
        homePage.closeCookiePopup();
        //test click toutes
        homePage.goToGamesAndConsolesPage();

   /* @Test
    public void testAmazon1() {
        // test search
        String keyword = "iPhone 13";
        HomePage homePage = new HomePage(driver);
        homePage.closeCookiePopup();
        homePage.search(keyword);
    }*/

        //test page object "GamesAndConsolesPage"
        GamesAndConsolesPage gamesAndConsolesPage = new GamesAndConsolesPage();
        gamesAndConsolesPage.OpenBestSeller(1);



    }
}