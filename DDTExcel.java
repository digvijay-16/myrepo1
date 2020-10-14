package myproj2.myproj2;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DDTExcel {
	WebDriver w;
	@BeforeTest
	public void atstart()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\data\\st\\chromedriver.exe");
		  w=new ChromeDriver();
		
		
	}
	
  @Test(dataProvider = "dp")
  public void f(String us, String pw,String executetest) throws InterruptedException {
	 // Reporter.log(us+" "+pw);
	  System.out.println(executetest);
	  if(executetest.equals("yes"))
	  {
	w.manage().window().maximize();
	  w.get("file:///D:/data/st/prax%2010%20ide/data.html");
	  w.findElement(By.id("username")).sendKeys(us);
	  w.findElement(By.id("password")).sendKeys(pw);
	Thread.sleep(2000);
	  }
	  //w.findElement(By.id("submit")).click();
	 
  }

  @DataProvider
  public Object[][] dp() {
	  ReadExcelFile config = new ReadExcelFile("D:\\data\\digvijay\\digvijay sir\\my keyword and hybrid\\testcase.xlsx");
	  
	  int rows = config.getRowCount(0);
	   
	  Object[][] credentials = new Object[rows][3];
	  
	 for(int i=0;i<rows;i++)
	  {
	  credentials[i][0] = config.getData(0, i, 0); //column1 of excel
	  credentials[i][1] = config.getData(0, i, 1); //column2 of excel
	  credentials[i][2] = config.getData(0, i, 2); //column3 of excel
	  }
	   
	  return credentials;
  }
}
