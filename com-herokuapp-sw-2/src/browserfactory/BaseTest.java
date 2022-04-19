package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public  void openbrowser(String baseurl){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //set obj
        driver=new ChromeDriver();
        //launch the url
        driver.get(baseurl);
        //maximise window
        driver.manage().window();
        //we give to implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        //close browser
        driver.close();
    }

}
