package weekoneDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DopdownCK12 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://skryabin.com/market/quote.html");
		Select dropdown=new Select (driver.findElement(By.name("countryOfOrigin")));
		dropdown.selectByVisibleText("Austria");
		dropdown.selectByValue("Belarus");
		dropdown.selectByIndex(3);
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("email")).sendKeys("abc@abc.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("confirmPassword")).sendKeys("12345");
		driver.findElement(By.id("name")).sendKeys("tester123");
		driver.findElement(By.name("agreedToPrivacyPolicy")).click();
		driver.findElement(By.id("formSubmit")).click();
	

}
}
