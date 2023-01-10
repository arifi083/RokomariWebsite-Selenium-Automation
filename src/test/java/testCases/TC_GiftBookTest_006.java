package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.BestSellerProductPage;
import pageObjects.GiftPage;

public class TC_GiftBookTest_006 extends BaseClass {

    @Test
    public void GiftBookTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        GiftPage giftPage = new GiftPage(driver);

        giftPage.setEmail(email2);
        Thread.sleep(2000);
        giftPage.setPassword(password2);
        Thread.sleep(2000);
        giftPage.setSignInBtn();
        Thread.sleep(2000);

        giftPage.actionWriter();
        Thread.sleep(2000);
        giftPage.setBestSorting();
        Thread.sleep(3000);
        giftPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        giftPage.setShopByCategories();
        Thread.sleep(4000);
        giftPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        giftPage.setWholeNovelByCategories();
        Thread.sleep(3000);
        giftPage.callJavaScriptExecutorFunction();
        Thread.sleep(3000);


        giftPage.setBookTitle();
        Thread.sleep(3000);
        giftPage.nexttab();
        Thread.sleep(2000);
        giftPage.setAddToCart();
        Thread.sleep(2000);
        giftPage.setCloseCartTab();
        Thread.sleep(3000);

        giftPage.setGotoCart();
        Thread.sleep(3000);
        for(int i=1;i<=3;i++)
        {
            giftPage.setPlusBtn();
            Thread.sleep(2000);
        }

        //giftPage.setPlusBtn();
        Thread.sleep(2000);
        for(int i=1;i<=2;i++){
            giftPage.setMinusBtn();
            Thread.sleep(2000);
        }
       // giftPage.setMinusBtn();
        //Thread.sleep(2000);
        //giftPage.setMinusBtn();
        Thread.sleep(4000);


        giftPage.setOrderGift();
        Thread.sleep(4000);
        giftPage.setGiftToName(giftToPersonName);
        Thread.sleep(2000);
        giftPage.setGiftToPhone(giftToPersonPhone);
        Thread.sleep(2000);
        giftPage.setGiftToCity();
        Thread.sleep(2000);
        giftPage.setGiftToArea();
        Thread.sleep(3000);
        giftPage.setGiftToZone();
        giftPage.callJavaScriptExecutorFunction();
        Thread.sleep(3000);
        giftPage.setGiftFromCity();
        Thread.sleep(2000);
        giftPage.callJavaScriptExecutorFunction();
        giftPage.setGiftFromArea();
        giftPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        giftPage.setGiftToAddress(giftToPersonAddress);
        giftPage.callJavaScriptExecutorFunction();
        giftPage.setGiftFromAddress(address);
        giftPage.callJavaScriptExecutorFunction();
        giftPage.setGiftToOccasion();
        Thread.sleep(3000);
        giftPage.setGiftMsg(giftMsg);
        Thread.sleep(3000);



    }
}
