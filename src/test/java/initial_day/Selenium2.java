package initial_day;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		//open url
		
		driver.get("https://www.zomato.com/");
		System.out.println("URL opened");
		
		//get title of webpage
		System.out.println(driver.getTitle());
		
		//getcurrent url
		System.out.println(driver.getCurrentUrl());
		
		//get pageSource
		
		System.out.println(driver.getPageSource());
		
		//maximize the current window
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.quit();
		
		//to close the parent  window 
		//driver.close();
	}
}
