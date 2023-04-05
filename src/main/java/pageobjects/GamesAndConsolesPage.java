package pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;



import java.time.Duration;

public class GamesAndConsolesPage {
    static WebDriver driver;
    final static int TIMEOUT_SIDE_PANEL = 10;
    static String firstItemExpected = "The Legend of Zelda : Tears of the Kingdom";
    public void OpenBestSeller(int index) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SIDE_PANEL ));
        WebElement proposalItem = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[cel_widget_id=handsfree-browse_OctopusBestSellerAsin] li .a-color-base"))); // [data-cel-widget='handsfree-browse_OctopusBestSellerAsin'] > div div ul li span.a-list-item
        String firstItemActual = proposalItem.getText();

        Assert.isTrue(firstItemActual.contains(firstItemExpected), "The first article in 'Les Meilleures Ventes' is not 'The Legend of Zelda : Tears of the Kingdom'"); // Assert that the first article in 'Les Meilleures Ventes' is 'The Legend of Zelda : Tears of the Kingdom'
        proposalItem.click(); // Open the first article

}
}