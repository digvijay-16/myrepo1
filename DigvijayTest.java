package qansr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
// hi iam renuka i have added this line now
//good morning
public class DigvijayTest {
  @Test
  public void test_product() {
	  System.setProperty("webdriver.chrome.driver", "D:\\data\\st\\chromedriver.exe");
	  WebDriver w=new ChromeDriver();
	w.manage().window().maximize();
	  w.get("https://www.demoblaze.com/index.html");
	  Reporter.log("opened demoblaze site");
	  w.findElement(By.linkText("Log in")).click();
	try {
		Thread.sleep(3000);
	
	  w.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("socthane");
	  Reporter.log("entered user name");
	  w.findElement(By.id("loginpassword")).sendKeys("socthane");
	  Reporter.log("entered user password");
	  
			  w.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
			  Reporter.log("logged in");
				Thread.sleep(3000);
			  w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(3000);
			  w.findElement(By.linkText("Samsung galaxy s6")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			 
			  Alert alert = w.switchTo().alert();
              alert.accept();
              Reporter.log("added Samsung galaxy s6 to cart");
			  w.findElement(By.partialLinkText("Cart")).click();
			  Thread.sleep(3000);
			  w.findElement(By.partialLinkText("Home")).click();
			  w.findElement(By.partialLinkText("Phones")).click();
			  Thread.sleep(2000);
			  w.findElement(By.partialLinkText("Nokia lumia 1520")).click();
			  Thread.sleep(2000);
			  w.findElement(By.linkText("Add to cart")).click();
			  Thread.sleep(2000);
			  Alert alert2 = w.switchTo().alert();
              alert2.accept();
              Reporter.log("added Nokia lumia 1520 to cart");
			  w.findElement(By.partialLinkText("Cart")).click();
			  System.out.println("total "+w.findElement(By.xpath("//*[@id='totalp']")).getAttribute("values"));
			  /*WebElement element = w.findElement(By.linkText("Samsung galaxy s6"));
			  Actions action = new Actions(w);
			  action.moveToElement(element).click().perform();*/
			 // w.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).submit();
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
  }
}
