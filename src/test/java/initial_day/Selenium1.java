package initial_day;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[]args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Title is -> "+driver.getTitle());
		System.out.println("Current URL -> "+ driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
	}
}
