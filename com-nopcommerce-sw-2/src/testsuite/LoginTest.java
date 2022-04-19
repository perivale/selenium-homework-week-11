package testsuite;

import browesrfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BestTest {
   String baseurl="https://demo.nopcommerce.com/";

    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

            // Find log in link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();

            //This is from requirement
            String expectedMessage = "Welcome, Please Sign In!";
            // Find the  element and get the text
            String actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
            // Validate actual and expected message
            Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);


    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find element to username filed
        WebElement username=driver.findElement(By.id("Email"));
        //sending element to userfiled
        username.sendKeys("Shilpa@2010gmail.com");
        //find element to password filed
        WebElement password=driver.findElement(By.name("Password"));
        //sending element to password filed
        password.sendKeys("ab123");
        //find element to login filed
        WebElement loginbutton=driver.findElement(By.linkText("Log in"));
        loginbutton.click();
        //find element to logout button

        String expectedfiled="Log out";
        String actualfiled=driver.findElement(By.linkText("Log out")).getText();
        //velidate actual and expected result

         Assert.assertEquals(actualfiled,expectedfiled);
      //  System.out.println(actualfiled);
    }
    @Test
    public void verifyTheErrorMessage(){
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find element to username filed
        WebElement username=driver.findElement(By.id("Email"));
        //sending element to userfiled
        username.sendKeys("shilpa2_2010@gamil.com ");
        //find element to password filed
        WebElement password=driver.findElement(By.name("Password"));
        //sending element to password filed
        password.sendKeys("123");
        //find element to login filed
        WebElement loginbutton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginbutton.click();
        String expectedmessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualmessage=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        //validate actualmessage and expectedmessage
        Assert.assertEquals(actualmessage,expectedmessage);

    }
    @After
    public void teardown(){
        closeBrowser();
    }

}
