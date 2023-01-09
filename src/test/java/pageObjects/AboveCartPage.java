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

public class AboveCartPage {
    public WebDriver driver;
    WebDriverWait wait;
    public AboveCartPage(WebDriver rdriver){
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
    By aboveCart = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(3) > div > a > div.book-img > div.cart-btn-area > button");

    By minicart = By.id("cart-icon");
    By continueshoping = By.xpath("//a[@id='js-continue-to-shipping']");

    By elementAddress = By.id("address");


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

    public void setToCart() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement element=driver.findElement(divBookDetails);
        action.moveToElement(element).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(aboveCart));

        WebElement element2=driver.findElement(aboveCart);
        action.moveToElement(element2);
        action.click().build().perform();
        Thread.sleep(2000);

    }

    public void setMinicart(){
        driver.findElement(minicart).click();
    }




    public void setPlaceOrder(){
        driver.findElement(continueshoping).click();
    }

    public void setSelectCity(){
        Select city = new Select(driver.findElement(By.xpath("//select[@id='js--city']")));
        city.selectByValue("2");
    }

    public void setSelectArea(){
        System.out.println("arif");
//        Select area = new Select(driver.findElement(By.xpath("//select[@id='js--area']")));
//        area.selectByVisibleText("উত্তরা");


        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--area']")));
        Select area = new Select(element);
        area.selectByValue("110");


    }

    public void setAddress(String address){
        driver.findElement(elementAddress).sendKeys(address);
    }


}
