package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BestTest {
    public static WebDriver driver;
    public void openbrowser(String baseurl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //set obj
        driver=new ChromeDriver();
        //get url
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //get the implicite wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}}
