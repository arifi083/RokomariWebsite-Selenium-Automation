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

public class KidsZonePage {
    public WebDriver driver;
    WebDriverWait wait;
    public KidsZonePage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By email = By.id("j_username");
    By password = By.id("j_password");
    By signInBtn = By.xpath("//form[@id='loginForm']//button[@type='submit']");

    By kidsZoneNavbar = By.cssSelector("div.container-fluid.custom-container > ul > li:nth-child(4) > a");
    By shopByCategory = By.cssSelector("div.filter-list > div > a:nth-child(2)");
    By shopBySecondCategories = By.cssSelector("div.filter-list > div > a:nth-child(1)");

    By shopByThirdCategories = By.cssSelector("div.filter-list > div > a:nth-child(1)");

    By bestSeller = By.cssSelector("label[for='SOLD_COUNT_DESC']");
    By brandFilTter = By.cssSelector("#js--publisherIds > div:nth-child(1) > label");

    By divtoys = By.cssSelector("div.browse__content-books-wrapper > div> div:nth-child(2)>div");

    By toysViewDetails = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(2) > div > div>a");

    By addToCart = By.cssSelector("#js--details-btn-area > a");
    By goToCart = By.cssSelector("#js--details-btn-area > a");
    By placeOrder = By.xpath("//a[@id='js-continue-to-shipping']");
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

    public void setClickKidsZoneNavbar(){
        driver.findElement(kidsZoneNavbar).click();
    }

    public void clickShopByCategory(){
        driver.findElement(shopByCategory).click();
    }
    public void clickShopBySecondCategories(){
        driver.findElement(shopBySecondCategories).click();
    }

    public void clickShopByThirdCategories(){
        driver.findElement(shopByThirdCategories).click();
    }

    public void clickBestSellerSorting(){
        driver.findElement(bestSeller).click();
    }

    public void clickBrandFiltering(){
       driver.findElement(brandFilTter).click();
    }

    public void clikViewDetails() throws InterruptedException {

        Actions action=new Actions(driver);
        WebElement viewDivToys=driver.findElement(divtoys);
        action.moveToElement(viewDivToys).build().perform();
        //hover over the element last line

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toysViewDetails));

        WebElement clickViewDetails=driver.findElement(toysViewDetails);
        action.moveToElement(clickViewDetails);
        action.click().build().perform();
        Thread.sleep(2000);

    }

    public void setClickAddtoCart(){
        driver.findElement(addToCart).click();
    }
    public void setClickGotoCart(){
        driver.findElement(goToCart).click();
    }

    public void setClickPlaceOrder(){
        driver.findElement(placeOrder).click();
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

    public void firstWindowScroll() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,350)");
        Thread.sleep(3000);
    }

    public void secondWindowScroll() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,270)");
        Thread.sleep(3000);
    }




}
