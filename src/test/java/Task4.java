import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Task4 {


    public class Test4 {
        @Test
        public void firstTest(){
            WebDriver driver;
            driver = new FirefoxDriver();
            driver.get("https://www.google.com.eg");
            driver.findElement(By.xpath("//span[@dir='ltr'])[3]")).click();
            //driver.quit();
}
}
}