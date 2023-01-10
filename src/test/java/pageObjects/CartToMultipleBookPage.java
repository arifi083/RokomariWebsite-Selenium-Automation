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

public class CartToMultipleBookPage {
    public WebDriver driver;
    WebDriverWait wait;
    public CartToMultipleBookPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By email = By.id("j_username");
    By password = By.id("j_password");
    By signInBtn = By.xpath("//form[@id='loginForm']//button[@type='submit']");
    By writer = By.id("js--authors");
    By writerName = By.cssSelector("#js--authors-menu > div > div:nth-child(1) > li:nth-child(1) > a");
    By hightToLow = By.xpath("//label[@for='PRICE_DESC']");
    By wholeNovelByCategories = By.cssSelector("label[for='rok-filter-categoryIds-716']");
    By writtenCollection = By.cssSelector("label[for='rok-filter-categoryIds-1321']");
    By div3rdBook = By.cssSelector("div.browse__content-books-wrapper > div> div:nth-child(3)>div");
    By div4thBook =By.cssSelector("div.browse__content-books-wrapper > div> div:nth-child(4)>div");

    By div3rdBookAboveCart = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(3) > div > a > div.book-img > div.cart-btn-area > button");
    By div4thBookAboveCart = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(4) > div > a > div.book-img > div > button");
    By minicart = By.id("cart-icon");
    By plusBtn = By.id("btn-plus");
    By minusBtn = By.id("btn-minus");
    By placeOrder = By.xpath("//a[@id='js-continue-to-shipping']");

    By orderAddress = By.id("address");

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

    public void setSortingHighToLow(){
        driver.findElement(hightToLow).click();
    }

    public void SetwholeNovelByCategories(){
        driver.findElement(wholeNovelByCategories).click();
    }

    public void setWrittenCollection(){
        driver.findElement(writtenCollection).click();
    }

    public void callJavaScriptExecutorFunction() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,350)");
        Thread.sleep(3000);
    }

    public void setAddToCart3rdBook() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement divElement3rdBook = driver.findElement(div3rdBook);
        action.moveToElement(divElement3rdBook).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(div3rdBookAboveCart));

        WebElement cartElement3rdBook=driver.findElement(div3rdBookAboveCart);
        action.moveToElement(cartElement3rdBook);
        action.click().build().perform();
        Thread.sleep(2000);

    }

    public void setAddToCart4thBook() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement divElement34thBook = driver.findElement(div4thBook);
        action.moveToElement(divElement34thBook).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(div4thBookAboveCart));

        WebElement cartElement4thBook=driver.findElement(div4thBookAboveCart);
        action.moveToElement(cartElement4thBook);
        action.click().build().perform();
        Thread.sleep(2000);

    }

    public void setMinicart(){
        driver.findElement(minicart).click();
    }

    public void setPlusBtn(){
        driver.findElement(plusBtn).click();
    }
    public void setMinusBtn(){
        driver.findElement(minusBtn).click();
    }
    public void setPlaceOrder(){
        driver.findElement(placeOrder).click();
    }


    public void setSelectCity(){
        Select city = new Select(driver.findElement(By.xpath("//select[@id='js--city']")));
        city.selectByValue("2");
    }

    public void setSelectArea(){
        System.out.println("arif");
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--area']")));
        Select area = new Select(element);
        area.selectByValue("110");


    }

    public void setAddress(String address){
        driver.findElement(orderAddress ).sendKeys(address);
    }



}
