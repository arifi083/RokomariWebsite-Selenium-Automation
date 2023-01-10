package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.BestSellerProductPage;
import pageObjects.SignIn;

public class TC_BestSellerProductTest_005 extends BaseClass {

    @Test
    public void bestSellingTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        BestSellerProductPage bestSellerProductPage = new BestSellerProductPage(driver);

        bestSellerProductPage.setEmail(email2);
        Thread.sleep(2000);
        bestSellerProductPage.setPassword(password2);
        Thread.sleep(2000);
        bestSellerProductPage.setSignInBtn();
        Thread.sleep(2000);

        bestSellerProductPage.actionWriter();
        Thread.sleep(2000);
        bestSellerProductPage.setBestSorting();
        Thread.sleep(2000);
        bestSellerProductPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        bestSellerProductPage.setShopByCategories();
        Thread.sleep(4000);
        bestSellerProductPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        bestSellerProductPage.setWholeNovelByCategories();
        Thread.sleep(3000);
        bestSellerProductPage.callJavaScriptExecutorFunction();
        Thread.sleep(3000);


        bestSellerProductPage.setBookTitle();
        Thread.sleep(3000);
        bestSellerProductPage.nexttab();
        Thread.sleep(2000);
        bestSellerProductPage.setAddToCart();
        Thread.sleep(2000);
        bestSellerProductPage.setCloseCartTab();
        Thread.sleep(3000);

        bestSellerProductPage.setGotoCart();
        Thread.sleep(3000);
        bestSellerProductPage.setPlusBtn();
        Thread.sleep(2000);
        bestSellerProductPage.setPlusBtn();
        Thread.sleep(2000);
        bestSellerProductPage.setMinusBtn();
        Thread.sleep(2000);
        bestSellerProductPage.setMinusBtn();
        Thread.sleep(2000);


        bestSellerProductPage.setPlaceOrder();
        Thread.sleep(4000);
        bestSellerProductPage.setSelectCity();
        Thread.sleep(5000);
        bestSellerProductPage.setSelectArea();
        Thread.sleep(4000);
        bestSellerProductPage.callJavaScriptExecutorFunction();
        bestSellerProductPage.setAddress(address);
        Thread.sleep(4000);
    }

}
