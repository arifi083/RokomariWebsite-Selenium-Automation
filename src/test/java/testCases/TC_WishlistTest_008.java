package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.DetailsPage;
import pageObjects.WishlistPage;

public class TC_WishlistTest_008 extends BaseClass {

    @Test
    public void wishlistTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        WishlistPage wishlistPage= new WishlistPage(driver);

        wishlistPage.setEmail(email2);
        Thread.sleep(2000);
        wishlistPage.setPassword(password2);
        Thread.sleep(2000);
        wishlistPage.setSignInBtn();
        Thread.sleep(2000);


        wishlistPage.actionWriter();
        wishlistPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        wishlistPage.setShopByCategories();
        Thread.sleep(2000);
        wishlistPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);

        wishlistPage.setBookDetails();
        Thread.sleep(3000);
        wishlistPage.callJavaScriptExecutorFunction();
        wishlistPage.setClickWishlistBtn();
        Thread.sleep(3000);
        wishlistPage.setClickWishlisTElement();
        Thread.sleep(3000);
        wishlistPage.checkWishlistMsg();
        Thread.sleep(2000);
        wishlistPage.clickDropDownBtn();
        Thread.sleep(3000);
        wishlistPage.clickWishlist();
        Thread.sleep(4000);
        wishlistPage.checkWishlistPageMsg();
        Thread.sleep(2000);





    }
}
