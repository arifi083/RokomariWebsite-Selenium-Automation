package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Signup {
    public WebDriver driver;
    WebDriverWait wait;
    public Signup(WebDriver rdriver){
        driver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    By signInBtn = By.xpath("//a[contains(text(),'Sign in')]");
    By signUpBtn = By.xpath("//*[text()='Sign up']");
    By fulName =By.id("nm");
    By email = By.id("js-email");
    By phone = By.id("js-phone");
    By password = By.id("pwd");
    By captcha = By.id("g-recaptcha-response");
    By createAccount = By.xpath("//form[@id='accountForm']//button[@type='submit']");


    public void signInButton(){
        driver.findElement(signInBtn).click();
    }

    public void signUpButton(){
        driver.findElement(signUpBtn).click();
    }

    public void fullName(String fname){
        driver.findElement(fulName).sendKeys(fname);
    }

    public void email(String mail){
        driver.findElement(email).sendKeys(mail);
    }

    public void mobile(String phn){
        driver.findElement(phone).sendKeys(phn);
    }

    public void setPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public void recaptha(){

//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("/html/body/div[3]/div/section/div[2]/div[3]/form/div[6]/div/div/div/div/iframe")));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark")));
//        element.click();
        System.out.println("click captcha");

        WebElement iframeSwitch = driver.findElement(By.xpath("/html/body/div[3]/div/section/div[2]/div[3]/form/div[6]/div/div/div/div/iframe"));
        driver.switchTo().frame(iframeSwitch);
        wait =new WebDriverWait(driver, Duration.ofSeconds(60));
        System.out.println("click captcha44444");
       // WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark")));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor")));
       //element.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

    public void creatAccount(){

        wait =new WebDriverWait(driver, Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='accountForm']//button[@type='submit']"))).click();
        WebElement element = driver.findElement(By.xpath("//form[@id='accountForm']//button[@type='submit']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

    }

}
