package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    WebDriverWait wait;
    public String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
    public String fullName ="atif";
    public String email ="arifiubat066@gmail.com";
    public String mobile ="01772921632";
    public String password ="12345678";
    public String email2 ="arnobaurthohin3@gmail.com";
    public String password2 ="123456789";
    public String address ="Embankment Drive Road, Dhaka 1230";



    @BeforeClass
    public void SetUp(){

        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--headed");
        driver= new ChromeDriver();
        //maximize window size
        driver.manage().window().maximize();
        //timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
