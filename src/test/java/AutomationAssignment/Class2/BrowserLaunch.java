package AutomationAssignment.Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BrowserLaunch {
    public static void main(String[] args) throws InterruptedException {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("linux"))
            System.setProperty("webdriver.gecko.driver", "/snap/bin/geckodriver");

        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("name")).sendKeys("Abdulla Md Mutasaddik");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Abdullahmutasaddike@gmail.com");
        driver.findElement(By.id("gender")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("mobile")).sendKeys("01775106554");
        Thread.sleep(2000);

        driver.findElement(By.id("subjects")).sendKeys("Bangla");
        driver.findElement(By.id("hobbies")).click();
        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Bashundhara R/A");
        Select state = new Select(driver.findElement(By.id("state")));
        state.selectByIndex(1);
        Select city = new Select(driver.findElement(By.id("city")));
        city.selectByIndex(2);
        driver.findElement(By.className("btn btn-primary")).click();
    }
}
