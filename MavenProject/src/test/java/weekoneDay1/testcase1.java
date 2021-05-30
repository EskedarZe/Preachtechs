package weekoneDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://iarchtaps.com:8080/opentaps");
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testcompany");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Johnny");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cat");
	Select dropdown=new Select (driver.findElement(By.id("createLeadForm_dataSourceId")));
	dropdown.selectByVisibleText("Cold Call");
	Select dropdown2=new Select (driver.findElement(By.id("createLeadForm_marketingCampaignId")));
	dropdown2.selectByValue("CATRQ_AUTOMOBILE");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("4087526596");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@abc.com");
	driver.findElement(By.className("smallSubmit")).click();
	// need to capture lead ID
	
	driver.close();
	

	
}
	

}
