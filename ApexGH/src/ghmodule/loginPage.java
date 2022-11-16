package ghmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPage {
	
	WebDriver driver;

  @Test
  public void Alertwithoktest() {
	  
	 driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Alerts.html");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
	  driver.switchTo().alert().accept();
	  driver.close();
	  
  }
}
