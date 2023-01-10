package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.DetailsPage;
import pageObjects.RecentlySoldProductsPage;

public class TC_RecentlySoloProductTest_011 extends BaseClass {
    @Test
    public void recentlySoldTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        RecentlySoldProductsPage recentlySoldProductsPage = new RecentlySoldProductsPage(driver);

        recentlySoldProductsPage.setEmail(email2);
        Thread.sleep(2000);
        recentlySoldProductsPage.setPassword(password2);
        Thread.sleep(2000);
        recentlySoldProductsPage.setSignInBtn();
        Thread.sleep(2000);

        recentlySoldProductsPage.firstWindowScroll();
        Thread.sleep(3000);
        recentlySoldProductsPage.clikViewDetails();
        Thread.sleep(2000);
        recentlySoldProductsPage.senondWindowScroll();
        recentlySoldProductsPage.setAddToCart();
        Thread.sleep(3000);
        recentlySoldProductsPage.setCloseCartTab();
        Thread.sleep(3000);
        recentlySoldProductsPage.setGotoCart();
        Thread.sleep(3000);


        for(int i=1;i<=3;i++){
            recentlySoldProductsPage.setPlusBtn();
            Thread.sleep(2000);
        }
        for (int i=1;i<=2;i++){
            recentlySoldProductsPage.setMinusBtn();
            Thread.sleep(2000);
        }
        Thread.sleep(2000);
        //recentlySoldProductsPage.clickWishlistIcon();
        //Thread.sleep(2000);
        recentlySoldProductsPage.senondWindowScroll();

        recentlySoldProductsPage.setPlaceOrder();
        Thread.sleep(4000);
        recentlySoldProductsPage.setSelectCity();
        Thread.sleep(5000);
        recentlySoldProductsPage.setSelectArea();
        Thread.sleep(4000);
        recentlySoldProductsPage.senondWindowScroll();
        recentlySoldProductsPage.setAddress(address);
        Thread.sleep(4000);

    }
}
