package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AboveCartPage;


public class TC_AboveCartTest_004 extends BaseClass {
    String baseUrl="https://www.rokomari.com/login";
    @Test
    public void aboveCartTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        AboveCartPage acart= new AboveCartPage(driver);

        acart.setEmail(email2);
        Thread.sleep(2000);
        acart.setPassword(password2);
        Thread.sleep(2000);
        acart.setSignInBtn();
        Thread.sleep(2000);


        acart.actionWriter();
        acart.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        acart.setShopByCategories();
        Thread.sleep(2000);
        acart.callJavaScriptExecutorFunction();
        Thread.sleep(2000);

        acart.setToCart();
        Thread.sleep(3000);

         acart.setMinicart();
         Thread.sleep(4000);

        acart.setPlaceOrder();
        Thread.sleep(4000);
        acart.setSelectCity();
        Thread.sleep(5000);
        acart.setSelectArea();
        Thread.sleep(4000);
        acart.setAddress(address);
        Thread.sleep(4000);
    }
}
