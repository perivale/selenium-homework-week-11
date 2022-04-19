package testsuite;

import browserfactory.BaseTest;
import com.beust.ah.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl="http://the-internet.herokuapp.com/login";
    @Before
    public void setup(){
       openbrowser(baseurl);
    }

    @Test
    public void userShouldLoginInSuccessfullyWithValidCrentals(){
        //find the username filed element
        WebElement username=driver.findElement(By.id("username"));
        //sending tje element to username filed
        username.sendKeys("tomsmith");
        //find the password filed element
        WebElement password=driver.findElement(By.name("password"));
        //sending the element to password filed
        password.sendKeys("SuperSecretPassword!");
        //find elementin login button and click on login button
        WebElement loginbutton=driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginbutton.click();

        String expectedrusulte="Secure Area.";
        //find the element text element and get the text
        String actualresulte=driver.findElement(By.xpath("//h4[@class='subheader']")).getText().substring(15,27);
        //validate actual and expected results
        Assert.assertEquals(expectedrusulte,actualresulte);


    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        //find the username filed element
        WebElement username=driver.findElement(By.id("username"));
        //sending tje element to username filed
        username.sendKeys("tomsmith1");
        //find the password filed element
        WebElement password=driver.findElement(By.name("password"));
        //sending the element to password filed
        password.sendKeys("SuperSecretPassword!");
        //find elementin login button and click on login button
        WebElement loginbutton=driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        loginbutton.click();
        String expectedresult="Your password is invalid!";
        String actualresults=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        Assert.assertEquals(expectedresult,actualresults);

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        //find the username filed element
        WebElement username=driver.findElement(By.id("username"));
        //sending tje element to username filed
        username.sendKeys("tomsmith");
        //find the password filed element
        WebElement password=driver.findElement(By.name("password"));
        //sending the element to password filed
        password.sendKeys("SuperSecretPassword!");
        //find elementin login button and click on login button
        WebElement loginbutton=driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginbutton.click();

        String expectedresults="You logged into a secure area!";
        String actualresults=driver.findElement(By.className("flash")).getText();
        //validate actual and expected message
        Assert.assertEquals(expectedresults,actualresults);

    }
    @After
    public void closebrowser(){

        //driver.close();
    }
}
