package adminweb;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shopick {
	WebDriver driver;
	
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    XSSFWorkbook workbook;
     String s="/home/indhu/Downloads/Online Business listing update.xlsx";
		
	
	
	
	
	@Test
	public void Ts_001() throws Exception {
		Thread.sleep(1500);
		driver.findElement(By.id("adminEmail")).click();
		driver.findElement(By.id("adminEmail")).sendKeys("admin@shopick.com");
		
}
	
	
	@BeforeTest
public void beforetest() throws Exception

	{
		System.setProperty("webdriver.chrome.driver", "/home/indhu/Downloads/selenium setup/chromedriver_linux64/chromedriver");
	 driver=new ChromeDriver();
	driver.get("http://192.168.2.80:8084/login");
	driver.manage().window().maximize();
	
	}
	
	
	
	 
				
@AfterTest
public void aftertest()
{
	driver.close();
}
}