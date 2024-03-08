package mock;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002_Functional {
	
	@Test
	public void test_login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("prexo.mis@dealsdray.com");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Assert.assertEquals(driver.getTitle(), "Prexo");
		
		driver.findElement(By.xpath("//span[@class='sidenavHoverShow css-1s178v5']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Orders']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']")).click();

		
		//driver.findElement(By.xpath("//input[@id='mui-1']")).click();
		driver.findElement(By.xpath("//input[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputSizeSmall css-1imb3v5']")).sendKeys("C:\\Users\\ahame\\Downloads\\demo-data.xlsx");
		 
		WebElement submit_btn=driver.findElement(By.xpath("//button[normalize-space()='Import']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submit_btn);
		
		driver.findElement(By.xpath("//button[normalize-space()='Validate Data']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		Assert.assertEquals(driver.getTitle(), "Prexo");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Validations\\"+"\\Screenshots\\"+"_"+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		driver.close();
	}

}
