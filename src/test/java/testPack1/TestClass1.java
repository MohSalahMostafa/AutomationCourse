package testPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void firstTest(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com.eg");
        driver.quit();
    }
    @Test
    public void seconTest(){
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com.eg");
        String URLName = driver.getTitle();
        Assert.assertEquals(URLName, "Google");
        driver.quit();
    }
}
