import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
    @Test
    public void practiceP1()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
    @Test
    public void browserActionsTest()
    {
        /*
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("");
        driver.navigate().to("");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        driver.close();

        driver.getCurrentUrl();
        driver.getPageSource();

        String windowTitle;
        windowTitle = driver.getTitle();

        var windowTitle2 = driver.getTitle();

        driver.getWindowHandle();
        driver.getWindowHandles();

        driver.switchTo();
        driver.switchTo().window("");
        driver.switchTo().newWindow("").get("");
        driver.switchTo().activeElement();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("");

        driver.switchTo().frame(0);
        driver.switchTo().frame("");
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        */
    }
    @Test
    public void task1()
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        var title = driver.getTitle();
//        System.out.println("yourtitleis="+title);
        Assert.assertEquals(title,"Google");
        driver.quit();
    }
    @Test
    public void task2
    {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");

    }
}
