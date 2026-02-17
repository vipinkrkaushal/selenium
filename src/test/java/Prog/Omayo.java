package Prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {

	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();

		// open url
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289437%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17738756929062902127%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9303798%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		//getTitle
		
		System.out.println("Title is : "+driver.getTitle());
		
		WebElement mb=driver.findElement(By.id("ap_email_login"));
		mb.sendKeys("vipinkrkaushal@yahoo.in");
		
		WebElement OK=driver.findElement(By.id("continue"));
		OK.click();
		
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("05361265321");
		Thread.sleep(3000);
		driver.quit();
	}
}
