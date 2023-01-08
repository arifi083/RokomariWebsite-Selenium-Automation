package testCases;

import Base.BaseClass;

import org.testng.annotations.Test;
import pageObjects.Signup;

public class TC_SignupTesst_001 extends BaseClass {
    String baseUrl="https://www.rokomari.com/book";
    @Test
    public void signUpTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        Signup signup = new Signup(driver);
        signup.signInButton();
        Thread.sleep(5000);
        signup.signUpButton();
        Thread.sleep(2000);
        signup.fullName(fullName);
        Thread.sleep(2000);
        signup.email(email);
        Thread.sleep(2000);
        signup.mobile(mobile);
        Thread.sleep(2000);
        signup.setPassword(password);
        Thread.sleep(2000);
        signup.recaptha();
        Thread.sleep(5000);
        signup.creatAccount();
        Thread.sleep(5000);





    }
}
