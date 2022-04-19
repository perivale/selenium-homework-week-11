package testsuite;

import browesrfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BestTest {
    String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //find elementto computerfiled
        WebElement computerfiled=driver.findElement(By.linkText("Computers"));
        computerfiled.click();
        String expectedfiled="Computers";
        String actualresults=driver.findElement(By.linkText("Computers")).getText();
        //validated actual and expected result
        Assert.assertEquals(expectedfiled,actualresults);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //find filed electronic filed
        WebElement electronics=driver.findElement(By.linkText("Electronics"));
        electronics.click();
        String expectedfiled="Electronics";
        String actualfiled=driver.findElement(By.linkText("Electronics")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedfiled,actualfiled);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //find filed apparel element
        WebElement apparel=driver.findElement(By.linkText("Apparel"));
        apparel.click();
        String expectedresult="Apparel";
        String actualresult=driver.findElement(By.linkText("Apparel")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedresult,actualresult);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //find element to digital download filed element
        WebElement digitaldownloadfiled=driver.findElement(By.linkText("Digital downloads"));
        digitaldownloadfiled.click();
        String expectedresult="Digital downloads";
        String actualresult=driver.findElement(By.linkText("Digital downloads")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedresult,actualresult);

    }
    @Test
    public  void userShouldNavigateToBooksPageSuccessfully(){
        //find element to books filed element
        WebElement booksfiled=driver.findElement(By.linkText("Books"));
        booksfiled.click();
        String expectedresult="Books";
        String actualresult=driver.findElement(By.linkText("Books")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedresult,actualresult);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //find element to jewlary filed element
        WebElement jewlaryfiled=driver.findElement(By.linkText("Jewelry"));
        jewlaryfiled.click();
        String expectedresult="Jewelry";
        String actualresult=driver.findElement(By.linkText("Jewelry")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedresult,actualresult);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //find element to giftcard filed element
        WebElement giftcardfiled=driver.findElement(By.linkText("Gift Cards"));
        giftcardfiled.click();
        String expectedresult="Gift Cards";
        String actualresult=driver.findElement(By.linkText("Gift Cards")).getText();
        //validate actual and expected result
        Assert.assertEquals(expectedresult,actualresult);

    }
    @After
    public void teardown(){
        closeBrowser();
    }

}
