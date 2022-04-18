package RTSLabs.tests.Navigate_To_RTS_Labs;

import RTSLabs.tests.base.TestBase;
import RTSLabs.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Navigate_To_RTS_Labs_Test extends TestBase {

    public static void main(String[] args) {

        //1a - Set up for chrome browser driver
        WebDriverManager.chromedriver().setup();

        //1b - Created a way to open up chrome browser with a driver instance
        WebDriver driver = new ChromeDriver();

        //2 - Go to https://www.google.com
        driver.get("https://www.google.com");

        //3 - verify title:
        //Expected: Google

        //4 - Search for RTS Labs In Search Bar

        driver.findElement(By.name("q")).sendKeys("RTS Labs" + Keys.ENTER);

        // 5 - Click on RTS Labs Link to website

        driver.findElement(By.tagName("h3")).click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        if(actualTitle.equals(expectedInTitle)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }

    }

}
