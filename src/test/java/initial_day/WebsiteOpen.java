package initial_day;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteOpen {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // open url
        driver.get("https://express.adobe.com/photo-editor/focused");

        Dimension dim1 = driver.manage().window().getSize();
        System.out.println(dim1);

        System.out.println(driver.getTitle());   
        Thread.sleep(3000);
        
        driver.quit();
    }
}

