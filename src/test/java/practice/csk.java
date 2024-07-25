package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csk {
    public static void main(String[] args) {
        //browser setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.chennaisuperkings.com/");

        //login
        driver.findElement(By.className("loginBtn")).click();

        //login page
//        driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("bedsdsfsd");
//        driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("fdgfgfhh");
//        driver.findElement(By.id("login")).click();

        //Forgot Password

//        driver.findElement(By.xpath("//div[@class='forgot mt-3']")).click();

        //Signup
        driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();

        //Signup page

        driver.findElement(By.id("firstName")).sendKeys("deepti");
        driver.findElement(By.id("lastName")).sendKeys("Seshu");
        driver.findElement(By.id("email")).sendKeys("deeptiseshu@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9502808265");

        driver.findElement(By.xpath("//span[@class='mat-mdc-button-touch-target']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='9']")).click();

        driver.findElement(By.xpath("//span[contains(text(),'JUL 2024')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='2006']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='FEB']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='25']")).click();

        driver.findElement(By.xpath("//input[@id='gender2' and @value='F']")).click();

        driver.findElement(By.id("pin1")).sendKeys("1234");
        driver.findElement(By.id("pin2")).sendKeys("1234");
        driver.findElement(By.id("tnc")).click();
//        driver.findElement(By.id("submit")).click();

        //click on Sign in from signup page

        driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();

        //Home page

            





    }
}
