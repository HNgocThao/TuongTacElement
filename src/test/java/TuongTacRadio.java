import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TuongTacRadio {
    public static void main(String[] args) {
        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");

//        driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
        // 1. Tuong tac vs phan tu
        String radYesXPath = "//label[text()='Impressive']";
        WebElement radYesLabelEle = driver.findElement(By.xpath(radYesXPath));
        WebElement radYesButtonEle = driver.findElement(By.id("yesRadio"));
        WebElement radImpButtonEle = driver.findElement(By.id("impressiveRadio"));
        WebElement radNoButtonEle = driver.findElement(By.id("noRadio"));

//        Kiem tra Yes check chua ? chua thi check va kiem tra trang thai
        if (!radYesButtonEle.isSelected()) {
            radYesLabelEle.click();
        }
//
//        // 2. Kiem tra xem da duoc chon chua
        boolean isYesChecked = radYesButtonEle.isSelected();
        boolean isImpChecked = radImpButtonEle.isSelected();
        boolean isNoChecked = radNoButtonEle.isSelected();
        System.out.println("Yes button - Checked: "+ isYesChecked);
        System.out.println("Impressive button - Checked: "+ isImpChecked);
        System.out.println("No button - Checked: "+ isNoChecked);
    }
}
