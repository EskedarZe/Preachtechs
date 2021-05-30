package weekoneDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocatorsAndDropDown {public static void main(String[] args) {
	//step1: Launch Chrome Browser//
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
	//Step2: Load url//
			driver.get("http://iarchtaps.com:8080/opentaps");
	//step03: Maximize window
			driver.manage().window().maximize();
	//Step 4 Enter the user name//
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	//Step5: Enter Password//
			driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Step6: log in//
			driver.findElement(By.className("decorativeSubmit")).click();
	//step07 click the CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();
	//step08 click the leads
			driver.findElement(By.linkText("Leads")).click();
	//step09 click the create leads
			driver.findElement(By.linkText("Create Lead")).click();	
	//step10: choose the value from Drop down
			Select dropdown=new Select (driver.findElement(By.id("createLeadForm_industryEnumId")));
	//once the  drop down element is declared, we can then start selecting items
	//option 01: selecting itsms by visibile text
			dropdown.selectByVisibleText("Aerospace");
	//option02: selectong items by value
			dropdown.selectByValue("IND_HARDWARE");
	//option03: selecting items by index
			dropdown.selectByIndex(3);
			
			
			
		}


	}
;