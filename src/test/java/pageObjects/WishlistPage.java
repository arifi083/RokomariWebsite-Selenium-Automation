package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WishlistPage {
    public WebDriver driver;
    WebDriverWait wait;
    public WishlistPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By email = By.id("j_username");
    By password = By.id("j_password");
    By signInBtn = By.xpath("//form[@id='loginForm']//button[@type='submit']");

    By writer = By.id("js--authors");
    By writerName = By.cssSelector("#js--authors-menu > div > div:nth-child(1) > li:nth-child(1) > a");

    By shopByCategories = By.cssSelector("label[for='rok-filter-categoryIds-677']");

    By divBookDetails = By.cssSelector("div.browse__content-books-wrapper > div> div:nth-child(3)>div");
    By bookDetails = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(3) > div > div>a");


    By wishlistBtn = By.id("js--save-to-booklist");
    By wishlitElement =By.xpath("//*[@id='js--save-to-booklist--item']/li[2]/a");

    By wishlistMsg = By.id("js--message-text");

    By dropDownMenu2 = By.id("dropdownMenu2");
    By wishlistPage = By.cssSelector("div.dropdown.user-menu.show > div > a:nth-child(7)");
    By wishlistPageAssertionMsg = By.cssSelector("div.my-wishlist__heading > h4");



    public void setEmail(String email2){
        driver.findElement(email).sendKeys(email2);
    }
    public void setPassword(String pwd2){
        driver.findElement(password).sendKeys(pwd2);
    }
    public void setSignInBtn(){

        //.findElement(signInBtn).click();
        WebElement element = driver.findElement(signInBtn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void actionWriter(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(writer);
        actions.moveToElement(element).build().perform();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(writerName));

        WebElement element2=driver.findElement(writerName);
        actions.moveToElement(element2);
        actions.click().build().perform();
    }

    public void setShopByCategories(){
        driver.findElement(shopByCategories).click();
    }


    public void callJavaScriptExecutorFunction() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,350)");
        Thread.sleep(3000);
    }

    public void setBookDetails() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement element=driver.findElement(divBookDetails);
        action.moveToElement(element).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(bookDetails));

        WebElement element2=driver.findElement(bookDetails);
        action.moveToElement(element2);
        action.click().build().perform();
        Thread.sleep(2000);

    }

    public void setClickWishlistBtn(){
        driver.findElement(wishlistBtn).click();
    }

    public void setClickWishlisTElement(){
        driver.findElement(wishlitElement).click();
    }

    public void checkWishlistMsg(){
        String checkWishMsg = driver.findElement(wishlistMsg).getText();
        Assert.assertTrue(checkWishMsg.contains("This book is added to your Wish List"));
    }
    public void clickDropDownBtn(){
        driver.findElement(dropDownMenu2).click();
    }

    public void clickWishlist(){
        driver.findElement(wishlistPage).click();
    }

    public void checkWishlistPageMsg(){
       String checkWishlistPageMsg = driver.findElement(wishlistPageAssertionMsg).getText();
       Assert.assertTrue(checkWishlistPageMsg.contains("My Wishlist"));
    }
}
