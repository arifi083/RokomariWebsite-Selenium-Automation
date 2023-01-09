package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.DetailsPage;


public class TC_DetailsCartTest_003 extends BaseClass {

    String baseUrl="https://www.rokomari.com/login";
    @Test
    public void DetailsTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        DetailsPage detail= new DetailsPage(driver);

        detail.setEmail(email2);
        Thread.sleep(2000);
        detail.setPassword(password2);
        Thread.sleep(2000);
        detail.setSignInBtn();
        Thread.sleep(2000);


        detail.actionWriter();
        detail.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        detail.setShopByCategories();
        Thread.sleep(2000);
        detail.callJavaScriptExecutorFunction();
        Thread.sleep(2000);

        detail.setBookDetails();
        Thread.sleep(3000);


        detail.setAddToCart();
        Thread.sleep(3000);
        detail.setCloseCartTab();
        Thread.sleep(3000);
        detail.setGotoCart();
        Thread.sleep(3000);

        detail.setPlaceOrder();
        Thread.sleep(4000);
        detail.setSelectCity();
        Thread.sleep(5000);
        detail.setSelectArea();
        Thread.sleep(4000);
        detail.setAddress(address);
        Thread.sleep(4000);
    }


}
