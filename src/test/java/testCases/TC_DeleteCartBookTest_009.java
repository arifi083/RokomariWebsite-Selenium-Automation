package testCases;

import Base.BaseClass;
import org.testng.annotations.Test;
import pageObjects.DeleteCartBookPage;


public class TC_DeleteCartBookTest_009 extends BaseClass {
    @Test
    public void DleeteCartBookTest() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        DeleteCartBookPage deleteCartBookPage= new DeleteCartBookPage(driver);

        deleteCartBookPage.setEmail(email2);
        Thread.sleep(2000);
        deleteCartBookPage.setPassword(password2);
        Thread.sleep(2000);
        deleteCartBookPage.setSignInBtn();
        Thread.sleep(2000);


        deleteCartBookPage.actionWriter();
        deleteCartBookPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);
        deleteCartBookPage.setShopByCategories();
        Thread.sleep(2000);
        deleteCartBookPage.callJavaScriptExecutorFunction();
        Thread.sleep(2000);

        deleteCartBookPage.setBookDetails();
        Thread.sleep(3000);

        deleteCartBookPage.callJavaScriptExecutorFunction1();
        deleteCartBookPage.setAddToCart();
        Thread.sleep(3000);
        deleteCartBookPage.setCloseCartTab();
        Thread.sleep(3000);
        deleteCartBookPage.setGotoCart();
        Thread.sleep(3000);
        deleteCartBookPage.setTrashIcon();
        Thread.sleep(4000);


    }
}
