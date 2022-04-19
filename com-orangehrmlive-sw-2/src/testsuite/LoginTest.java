package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldSuccessfullyWithValidCredentials() {
        //find the username filedelement
        WebElement Username = driver.findElement(By.id("txtUsername"));
        //sending username element to userfiled
        Username.sendKeys("Admin");
        //find the password element to password filed
        WebElement password=driver.findElement(By.name("txtPassword"));
        //sending password to password filed
        password.sendKeys("admin123");
        //fined element to login filed by clicking
        WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();

        //this is from requirment
       String expectedresult="Welcome";
        //find the welcome text element and get the text
        String actualresults=driver.findElement(By.id("welcome")).getText().substring(0,7);
        Assert.assertEquals("letter displayed", expectedresult, actualresults);


    }

    }
