package testCases;

import Base.BaseClass;;
import org.testng.annotations.Test;
import pageObjects.SignIn;

import java.time.Duration;

public class TC_SignInTest_002 extends BaseClass {
    String baseUrl="https://www.rokomari.com/login";

    @Test
    public void signInTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        SignIn signIn = new SignIn(driver);

        signIn.setEmail(email2);
        Thread.sleep(2000);
        signIn.setPassword(password2);
        Thread.sleep(2000);
        signIn.setSignInBtn();
        Thread.sleep(2000);

        signIn.actionWriter();
        signIn.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        signIn.setShopByCategories();
        Thread.sleep(2000);
        signIn.callJavaScriptExecutorFunction();
        Thread.sleep(2000);

        signIn.setBookTitle();
        Thread.sleep(3000);
        signIn.nexttab();
        Thread.sleep(2000);
        signIn.setCloseCartTab();
        Thread.sleep(3000);

        signIn.setGotoCart();
        Thread.sleep(3000);
        signIn.setPlaceOrder();
        Thread.sleep(4000);
        signIn.setSelectCity();
        Thread.sleep(5000);
        signIn.setSelectArea();
        Thread.sleep(4000);
        signIn.setAddress(address);
        Thread.sleep(4000);

    }
}
