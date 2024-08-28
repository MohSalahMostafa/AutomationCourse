import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sigmaWebsite {
    @Test
    public void navigateTo() throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.navigate().to("https://www.sigma-emea.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"top\"]/header/div/div/div/div[3]/div/div/a[1]")).click();
//       Thread.sleep(200000);
        driver.quit();
    }
}
