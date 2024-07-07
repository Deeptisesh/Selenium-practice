import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class loginPageOfVMO {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vwo.com/");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.name("password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();

       driver.wait(300);

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File source=scrShot.getScreenshotAs(OutputType.FILE);
        File target=new File("./SeleniumAssinments/Screenshots/loginpage.png");
        FileUtils.copyFile(source,target);
    }
}
