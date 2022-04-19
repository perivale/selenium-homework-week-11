package testsuite;

import browesrfactory.BestTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BestTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {

        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //finf element to register element
        WebElement regiaterlink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        regiaterlink.click();
        String expectedlink = "Register";
        String actuallink = driver.findElement(By.xpath("//a[contains(text(),'Register')]")).getText();
        //validate actual and expected element
        Assert.assertEquals(actuallink, expectedlink);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //find element on register element
        WebElement regiaterlink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        regiaterlink.click();
        //find element to gender radio button
        WebElement radiobutton = driver.findElement(By.name("Gender"));
        radiobutton.click();
        //find filed in frist name filed
        WebElement firstname = driver.findElement(By.id("FirstName"));
        //sending element in name filed
        firstname.sendKeys("shilpa");
        //find element to lastnamefiled
        WebElement lastname = driver.findElement(By.name("LastName"));
        //sending element in lastname filed
        lastname.sendKeys("patel");
        //find element to birth day element
        WebElement birthdate = driver.findElement(By.name("DateOfBirthDay"));
        //sending element to birthday element
        birthdate.sendKeys("2");
        //find element to birth month element
        WebElement birthmonth = driver.findElement(By.name("DateOfBirthMonth"));
        //sending element to birthmonth element
        birthmonth.sendKeys("march");
        //find element to birth year element
        WebElement birthyear = driver.findElement(By.name("DateOfBirthYear"));
        //sending element to birthyear element
        birthyear.sendKeys("1997");
        //find element to email filed
        WebElement emailfiled = driver.findElement(By.id("Email"));
        //sending element to emialfiled element
        emailfiled.sendKeys("shilpa2_2010@gamil.com");
        //find element to password filed
        WebElement passwordfiled = driver.findElement(By.id("Password"));
        //sending element to emialfiled element
        passwordfiled.sendKeys("shilpa");
        //find element to confirmpassword filed
        WebElement confirmpasswordfiled = driver.findElement(By.id("ConfirmPassword"));
        //sending element to emialfiled element
        confirmpasswordfiled.sendKeys("shilpa");
        //find element to registerbutton filed
        WebElement registerbutton = driver.findElement(By.id("register-button"));
        registerbutton.click();
        //verify rigtertext filed
        String expectedtext = "Your registration completed";
        String actualtext = driver.findElement((By.cssSelector("div.result"))).getText();
        //validate expected and actual text
        Assert.assertEquals(actualtext, expectedtext);


    }

    @After
    public void closebrowser() {

        //driver.close();
    }
}