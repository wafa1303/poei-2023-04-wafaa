package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    By searchBarLocator = By.cssSelector("#twotabsearchtextbox");
    By listAndAccountButtonBy = By.cssSelector("#nav-link-accountList");

    By signInButtonBy = By.cssSelector(".nav-action-button");
    WebDriver driver;
    final static int TIMEOUT_SIDE_PANEL = 10;

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

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SIDE_PANEL ));

    // Click Jeux video et consoles
    WebElement jeuxVideosEtConsoles = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.hmenu-item[data-ref-tag=nav_em_1_1_1_17]")));
        jeuxVideosEtConsoles.click();


        //Select tous les jeux videos
        driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible.hmenu-translateX > li a[class='hmenu-item']")).click(); // Select 'Tous les jeux video'

    }

    // survole de la souris a mettre dans l'exemple de l iphone
    public void createNewAccount() {
        Actions actions = new Actions(driver);

        WebElement buttonAccount = driver.findElement(listAndAccountButtonBy);
        actions.moveToElement(buttonAccount);
        actions.perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(signInButtonBy)).click();
    }






}