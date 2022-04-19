package testsuite;

import browserfactory.BestTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BestTest {
    String baseurl="https://courses.ultimateqa.com/";
    @Before
    public void setup(){
        openbrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
    //find element to singin link element
        WebElement signin=driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));
        //click on singin link element
        signin.click();

        String expectedresultes="Welcome Back!";
        String actualresultes=driver.findElement(By.xpath("//h1[contains(text(),'Welcome Back!')]")).getText();
        //validate expectedresult and actualresult
        Assert.assertEquals(expectedresultes,actualresultes);

    }
    @Test
    public void verifyTheErrorMessage(){
        //find element to singin link element
        WebElement signin=driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]"));
        //click on singin link element
        signin.click();
        //find element to username filed
        WebElement username=driver.findElement(By.id("user[email]"));
        //sending email to emailfiled
        username.sendKeys("shilpa2@gmail.com");
        //find element to password filed
        WebElement password=driver.findElement(By.name("user[password]"));
        //sending passowrd to password filed
        password.sendKeys("123456");
        //find element to login field
        WebElement loginbutton=driver.findElement(By.xpath("//input[@value='Sign in']"));
        loginbutton.click();
        //valid results
        String expectedresult="Invalid email or password.";
        String actualresult=driver.findElement(By.xpath("//li[@class='form-error__list-item']")).getText();
        //compare actual and expected
       Assert.assertEquals(expectedresult,actualresult);
    //    System.out.println(actualresult);






    }
}
