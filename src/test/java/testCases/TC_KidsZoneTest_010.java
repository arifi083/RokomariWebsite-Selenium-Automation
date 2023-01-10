package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.KidsZonePage;

public class TC_KidsZoneTest_010 extends BaseClass {
    @Test
    public void kidsZone() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        KidsZonePage kidsZonePage = new KidsZonePage(driver);

        kidsZonePage.setEmail(email2);
        Thread.sleep(2000);
        kidsZonePage.setPassword(password2);
        Thread.sleep(2000);
        kidsZonePage.setSignInBtn();
        Thread.sleep(2000);

        kidsZonePage.setClickKidsZoneNavbar();
        Thread.sleep(3000);
        kidsZonePage.clickShopByCategory();
        Thread.sleep(2000);
        kidsZonePage.clickShopBySecondCategories();
        Thread.sleep(2000);
        kidsZonePage.clickShopByThirdCategories();
        Thread.sleep(2000);
        kidsZonePage.clickBestSellerSorting();
        Thread.sleep(2000);
        kidsZonePage.firstWindowScroll();
        kidsZonePage.clickBrandFiltering();
        kidsZonePage.secondWindowScroll();
        kidsZonePage.clikViewDetails();

        kidsZonePage.setClickAddtoCart();
        Thread.sleep(3000);
        kidsZonePage.secondWindowScroll();
        kidsZonePage.setClickGotoCart();
        Thread.sleep(3000);
        kidsZonePage.secondWindowScroll();
        kidsZonePage.setClickPlaceOrder();
        Thread.sleep(2000);
        kidsZonePage.setSelectCity();
        Thread.sleep(2000);
        kidsZonePage.setSelectArea();
        Thread.sleep(2000);
        kidsZonePage.secondWindowScroll();
        kidsZonePage.setAddress(address);
        Thread.sleep(2000);


    }
}
