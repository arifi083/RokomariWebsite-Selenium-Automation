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

import java.time.Duration;

public class RecentlySoldProductsPage {
    public WebDriver driver;
    WebDriverWait wait;
    public RecentlySoldProductsPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By email = By.id("j_username");
    By password = By.id("j_password");
    By signInBtn = By.xpath("//form[@id='loginForm']//button[@type='submit']");

    By viewDetailsDiv =By.cssSelector("#front-list-recentlySoldProducts > div > div:nth-child(1)");
    By viewDetails = By.cssSelector("#front-list-recentlySoldProducts > div > div:nth-child(1) > div > a");

    By addToCart = By.cssSelector("#js--details-btn-area>:nth-child(2)");
    By closeTab = By.cssSelector("#js--feature-popup > div.feature-popup__header > button");
    By gotoCart = By.cssSelector("#js--details-btn-area >:nth-child(2)");

    By plusBtn = By.id("btn-plus");
    By minusBtn = By.id("btn-minus");
    By addWishlistIcon = By.cssSelector("img.wishlist-icon");
    By placeOrderBtn = By.xpath("//a[@id='js-continue-to-shipping']");
    By elementAddress = By.id("address");




    public void setEmail(String email2){
        driver.findElement(email).sendKeys(email2);
    }
    public void setPassword(String pwd2){
        driver.findElement(password).sendKeys(pwd2);
    }
    public void setSignInBtn(){
        WebElement element = driver.findElement(signInBtn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void clikViewDetails() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement viewDetailsElement=driver.findElement(viewDetailsDiv);
        action.moveToElement(viewDetailsElement).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewDetails));

        WebElement clickViewDetails=driver.findElement(viewDetails);
        action.moveToElement(clickViewDetails);
        action.click().build().perform();
        Thread.sleep(2000);

    }
    public void setAddToCart(){
        driver.findElement(addToCart).click();
    }

    public void setCloseCartTab(){
        driver.findElement(closeTab).click();
    }
    public void setGotoCart(){
        driver.findElement(gotoCart).click();
    }

    public void setPlaceOrder(){
        driver.findElement(placeOrderBtn).click();
    }
    public void setPlusBtn(){
        driver.findElement(plusBtn).click();
    }
    public void setMinusBtn(){
        driver.findElement(minusBtn).click();
    }

    public void clickWishlistIcon(){
        driver.findElement(addWishlistIcon).click();
    }

    public void firstWindowScroll() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,400)");
        Thread.sleep(3000);
    }

    public void senondWindowScroll() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,300)");
        Thread.sleep(3000);
    }


    public void setSelectCity(){
        Select city = new Select(driver.findElement(By.xpath("//select[@id='js--city']")));
        city.selectByValue("2");
    }

    public void setSelectArea(){
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--area']")));
        Select area = new Select(element);
        area.selectByValue("110");
    }
    public void setAddress(String address){
        driver.findElement(elementAddress).sendKeys(address);
    }


}
