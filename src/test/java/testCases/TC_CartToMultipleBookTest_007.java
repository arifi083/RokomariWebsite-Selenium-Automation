package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.AboveCartPage;
import pageObjects.CartToMultipleBookPage;

public class TC_CartToMultipleBookTest_007 extends BaseClass {

    @Test
    public void CartToMultipleBookTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        CartToMultipleBookPage cartToMultipleBookPage= new CartToMultipleBookPage(driver);

        cartToMultipleBookPage.setEmail(email2);
        Thread.sleep(2000);
        cartToMultipleBookPage.setPassword(password2);
        Thread.sleep(2000);
        cartToMultipleBookPage.setSignInBtn();
        Thread.sleep(2000);

        cartToMultipleBookPage.actionWriter();
        Thread.sleep(2000);
        cartToMultipleBookPage.setSortingHighToLow();
        Thread.sleep(3000);
        cartToMultipleBookPage.callJavaScriptExecutorFunction();
        Thread.sleep(3000);
        cartToMultipleBookPage.SetwholeNovelByCategories();
        Thread.sleep(2000);
        cartToMultipleBookPage.callJavaScriptExecutorFunction();
        cartToMultipleBookPage.setWrittenCollection();
        Thread.sleep(3000);
        cartToMultipleBookPage.callJavaScriptExecutorFunction();
        cartToMultipleBookPage.setAddToCart3rdBook();
        Thread.sleep(3000);
        cartToMultipleBookPage.setAddToCart4thBook();
        Thread.sleep(3000);
        cartToMultipleBookPage.setMinicart();
//        Thread.sleep(2000);
//        for(int i=1;i<3;i++){
//            cartToMultipleBookPage.setPlusBtn();
//            Thread.sleep(2000);
//        }

//        for(int i=1;i<=2;i++){
//            cartToMultipleBookPage.setMinusBtn();
//            Thread.sleep(2000);
//        }
        Thread.sleep(3000);
        cartToMultipleBookPage.callJavaScriptExecutorFunction();
        cartToMultipleBookPage.setPlaceOrder();
        Thread.sleep(3000);
        cartToMultipleBookPage.setSelectCity();
        Thread.sleep(3000);
        cartToMultipleBookPage.setSelectArea();
        Thread.sleep(2000);
        cartToMultipleBookPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        cartToMultipleBookPage.setAddress(address);
        Thread.sleep(2000);


    }
}
