package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    By searchBarLocator = By.cssSelector("#twotabsearchtextbox");
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // Close Cookies
    public void closeCookiePopup() {
        WebElement closeCookiePopup= driver.findElement(By.cssSelector("#sp-cc-accept"));
        closeCookiePopup.click();
    }
// search (string keyword)
   /*public void search(String keyword) {
        driver.findElement(searchBarLocator).sendKeys(keyword + Keys.ENTER);
    }*/

    //goToGamesAndConsolesPage Click Toutes, Click Jeux video et consoles, Click tous
    public void goToGamesAndConsolesPage(){
        WebElement menuToutes = driver.findElement(By.cssSelector(".hm-icon.nav-sprite"));
        menuToutes.click();
    }


}
