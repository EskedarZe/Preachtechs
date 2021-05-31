package weekoneDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		// Launch browser
		driver.get("http://iarchtaps.com:8080/opentaps");
		// enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// enter passowrd
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click on Log in
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click CRM/CFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//  Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//  Click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//  Click on Phone
		driver.findElement(By.xpath("((//ul[@class='x-tab-strip x-tab-strip-top'])/li)[2]")).click();
		// Enter Phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("4087526596");
		//  Click the find leads button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		//need to capture lead ID
		//  Click on first resulting lead
		//driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[2])/a")).click();
		driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1])/a")).clear();
		
		
	}

}
