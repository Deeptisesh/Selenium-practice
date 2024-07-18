package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bookingInKatalonapp {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Home Page
        driver.get("https://katalon-demo-cura.herokuapp.com/");
         driver.findElement(By.id("btn-make-appointment")).click();

         //Login Page
         driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
         driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");
         driver.findElement(By.id("btn-login")).click();

        //Booking Page
        // select from dropdown
        WebElement combo_facilitydropdown=driver.findElement(By.id("combo_facility"));
        Select facility=new Select(combo_facilitydropdown);
        facility.selectByValue("Tokyo CURA Healthcare Center");
        facility.selectByVisibleText("Hongkong CURA Healthcare Center");

        //select Radio button
        driver.findElement(By.id("radio_program_medicaid")).click();

        // select calender date
        driver.findElement(By.name("visit_date")).click();
        driver.findElement(By.xpath("//td[normalize-space()='16']")).click();

        driver.findElement(By.id("txt_comment")).sendKeys("this is for future booking");

        driver.findElement(By.id("btn-book-appointment")).click();






    }
}
