package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

    @Before
    public void setup() {
        openBrowser(baseurl);

    }

    @Test
    public void userShouldNavigatetoForgotPasswordPageSuccessfully() {
        //find the element to forgotpassword and click on link
        WebElement forgotpassword = driver.findElement(By.linkText("Forgot your password?"));
        forgotpassword.click();

        String expectedforgotpassword = "Forgot your password?";
        String actualforgotpassword = driver.findElement(By.xpath("")).getText();
        //validate actual and expected message
        Assert.assertEquals("this is the message", expectedforgotpassword, actualforgotpassword);

    }
    @After
    public void closebrowser(){
        //closing the browser
        closebrowser();

    }

}
