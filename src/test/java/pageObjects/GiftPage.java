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

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;

public class GiftPage {
    public WebDriver driver;
    WebDriverWait wait;
    public GiftPage(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By email = By.id("j_username");
    By password = By.id("j_password");
    By signInBtn = By.xpath("//form[@id='loginForm']//button[@type='submit']");
    //By writer = By.cssSelector("div > ul.sub-menu.bangla-menu > li:nth-child(1)");
    By writer = By.id("js--authors");
    By writerName = By.cssSelector("#js--authors-menu > div > div:nth-child(1) > li:nth-child(1) > a");

    By bestSorting = By.cssSelector("label[for='SOLD_COUNT_DESC']");
    By shopByCategories = By.cssSelector("label[for='rok-filter-categoryIds-677']");

    By wholeNovelByCategories = By.cssSelector("label[for='rok-filter-categoryIds-716']");

    By booktitle = By.cssSelector("div.browse__content-books-wrapper > div > div:nth-child(1) > div > a");
    By addToCart = By.cssSelector("#js--details-btn-area>:nth-child(2)");
    By closeTab = By.cssSelector("#js--feature-popup > div.feature-popup__header > button");
    By gotoCart = By.cssSelector("#js--details-btn-area >:nth-child(2)");
    By plusBtn = By.id("btn-plus");
    By minusBtn = By.id("btn-minus");

    By orderGift = By.xpath("//a[@id='js-continue-to-gift-shipping']");

    By giftToName = By.id("giftName");
    By giftToPhone = By.id("giftPhone");
   // By giftToCity = By.xpath("//select[@id='js--city-gift']");
  //  By giftToArea = By.xpath("//select[@id=['js--area-gift']");
    By giftToAddress = By.id("giftAddress");
   // By giftToOccasion = By.name("giftFor");
    By giftMsg = By.id("js--gift-message");


   // By giftFromCity =By.xpath("//select[@id='js--from-city']");
   // By giftFromArea = By.xpath("//select[@id='js--from-area']");
    By giftFromAddress = By.id("sender-address");




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
    public void setBestSorting(){
        driver.findElement(bestSorting).click();
    }

    public void setShopByCategories(){
        driver.findElement(shopByCategories).click();
    }
    public void setWholeNovelByCategories(){
        driver.findElement(wholeNovelByCategories).click();
    }


    public void callJavaScriptExecutorFunction() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,350)");
        Thread.sleep(3000);
    }

    public void setBookTitle(){
        driver.findElement(booktitle).click();
    }

    public void nexttab(){
        ArrayList<String> newTab= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
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

    public void setPlusBtn(){
        driver.findElement(plusBtn).click();
    }
    public void setMinusBtn(){
        driver.findElement(minusBtn).click();
    }





    public void setOrderGift(){
        driver.findElement(orderGift).click();
    }

    public void setGiftToName(String gToName){
        driver.findElement(giftToName).sendKeys(gToName);
    }

    public void setGiftToPhone(String gToPhone){
        driver.findElement(giftToPhone).sendKeys(gToPhone);
    }

    public void setGiftToCity() {
        Select giftToCity = new Select(driver.findElement(By.xpath("//select[@id='js--city-gift']")));
        giftToCity.selectByValue("26");
    }

    public void setGiftToArea(){
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement giftToArea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--area-gift']")));
        Select giftarea = new Select(giftToArea);
        giftarea.selectByValue("265");

    }

    public void setGiftToZone(){
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement giftToZone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--zone-gift']")));
        Select giftZone = new Select(giftToZone);
        giftZone.selectByValue("337");

    }

    public void setGiftToOccasion(){
//        Select giftOccasion = new Select((WebElement) giftToOccasion);
//        giftOccasion.selectByValue("Anniversary");
        Select giftOccasion = new Select(driver.findElement(By.xpath("//select[@name='giftFor']")));
        giftOccasion.selectByValue("Friendship");

    }

    public void setGiftToAddress(String gToAddress){
        driver.findElement(giftToAddress).sendKeys(gToAddress);
    }

    public void setGiftMsg(String gMsg){
        driver.findElement(giftMsg).sendKeys(gMsg);
    }



    public void setGiftFromCity(){
        Select giftFromCity = new Select(driver.findElement(By.xpath("//select[@id='js--from-city']")));
        giftFromCity.selectByValue("2");
    }

    public void setGiftFromArea(){
        wait =new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement giftFromArea = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='js--from-area']")));
        Select giftfarea = new Select(giftFromArea);
        giftfarea.selectByValue("110");
    }


   public void setGiftFromAddress(String address){
        driver.findElement(giftFromAddress).sendKeys(address);
   }



}
