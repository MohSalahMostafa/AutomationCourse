import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task5 {


    public class Test5 {
        @Test
        public void firstTest(){
            WebDriver driver;
            driver = new FirefoxDriver();
            driver.get("https://duckduckgo.com/");
            driver.findElement(By.id("searchbox_input")).sendKeys("Selenium WebDriver");
            Assert.assertEquals("","https://www.selenium.dev/documentation/webdriver/");
            driver.quit();
        }
    }
}
