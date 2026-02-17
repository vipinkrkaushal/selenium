package Prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class BlinkWeb {
	
	public static void main(String[]args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		//open blinkit url
		
		driver.get("https://blinkit.com/?srsltid=AfmBOoqH_DOKJzWHs0l1-Ezp5fijhdYVq9DXcLOnQMOcWMQb6sLAhAjm");
		
		String actualTitle=driver.getTitle();
		
		String expectedResult= "30,000+ products delivered to your doorstep | Blinkit";
		
		if(actualTitle.equals(expectedResult))
			System.out.println("Title correct");
		else
			System.out.println("Incorrect Title");
		
		String curl=driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		String expectedURL="https://blinkit.com/?srsltid=AfmBOoqH_DOKJzWHs0l1-Ezp5fijhdYVq9DXcLOnQMOcWMQb6sLAhAjm";
		if(expectedResult.equals(curl))
			System.out.println("CORRECT");
		else
			System.out.println("Incorrect");
		driver.quit();
	}

}
