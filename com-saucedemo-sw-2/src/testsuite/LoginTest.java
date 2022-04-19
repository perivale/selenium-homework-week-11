package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    String baseurl="https://www.saucedemo.com/";

    @Before
    public void setup(){
        openbrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find the element to userfiled
        WebElement username=driver.findElement(By.id("user-name"));
        //sending the usernameto filed element
        username.sendKeys("standard_user");
        //find the element to password filed
        WebElement password=driver.findElement(By.name("password"));
        //sending password to password filed
        password.sendKeys("secret_sauce");
        //find element login filed
        WebElement loginbutton=driver.findElement(By.name("login-button"));
        loginbutton.click();
        //find the element to prouduct element
        WebElement products=driver.findElement(By.className("title"));
        products.click();


    }
    @Test
    public  void verifyThatSixProductsAreDisplayedOnPage(){
        //find the element to userfiled
        WebElement username=driver.findElement(By.id("user-name"));
        //sending the usernameto filed element
        username.sendKeys("standard_user");
        //find the element to password filed
        WebElement password=driver.findElement(By.name("password"));
        //sending password to password filed
        password.sendKeys("secret_sauce");
        //find elementto login filed
        WebElement loginbutton=driver.findElement(By.name("login-button"));
        loginbutton.click();
        //find the element for multiple element
        List<WebElement>value=driver.findElements(By.className("inventory_item_name"));
        int size=value.size();
        System.out.println(size);

        int expectedvalue=6;
        int actualvalue=size;
        //validate expected and actual value
        Assert.assertEquals(expectedvalue,actualvalue);
    }
    @After
    public void tearDown(){
        //close browser
        closebrowser();
    }





}
