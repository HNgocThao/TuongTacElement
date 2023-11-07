import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class XayDungKichBan {
    public static void main(String[] args) throws IOException, InterruptedException{
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang https://demoqa.com/elements
        driver.get("https://demoqa.com/elements");

        driver.findElement(By.xpath("//span[text()='Check Box']")).click();

        //Cach1:
        driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
        driver.findElement(By.xpath("//span[text()='Commands']/preceding::span[@class='rct-checkbox' and position()=2]")).click();
        driver.findElement(By.xpath("//span[text()='Angular']/preceding::span[@class='rct-checkbox' and position()=2]")).click();
        driver.findElement(By.xpath("//span[text()='Private']/preceding::span[@class='rct-checkbox' and position()=2]")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[text()='Excel File.doc']")).click();
        driver.findElement(By.xpath("//span[text()='Excel File.doc']/preceding::span[@class='rct-checkbox' and position()=2]")).click();

        //Cach2:
//        driver.findElement(By.cssSelector(".rct-icon-expand-all")).click();
//        driver.findElement(By.cssSelector(".rct-node:nth-child(1) > ol > .rct-node:nth-child(1) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();
//        driver.findElement(By.cssSelector(".rct-node:nth-child(2) .rct-node:nth-child(1) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();
//        driver.findElement(By.cssSelector(".rct-node:nth-child(4) .rct-checkbox > .rct-icon")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".rct-node:nth-child(3) .rct-node:nth-child(2) .rct-checkbox > .rct-icon")).click();

    }
}
