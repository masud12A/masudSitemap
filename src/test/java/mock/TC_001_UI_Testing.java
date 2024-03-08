package mock;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_001_UI_Testing {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test(priority=1)
	public void browser1(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Calley Automatic Call Dialer For Android & IOS Phones");
		
		driver.manage().window().setSize(new Dimension(1920,1080));
		 
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1920x1080\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		

		driver.manage().window().setSize(new Dimension(1366,768));
		 
		String timestamp1=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File  source1=ts1.getScreenshotAs(OutputType.FILE);
		String destination1=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1366x768\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source1, new File(destination1));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		driver.close();
		
	}

	
	@Parameters({"browser"})
	@Test(priority=2)
	public void browser2(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/calley-call-from-browser/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Calley Call From Browser");
		
		driver.manage().window().setSize(new Dimension(1920,1080));
		 
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1920x1080\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		

		driver.manage().window().setSize(new Dimension(1366,768));
		 
		String timestamp1=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File  source1=ts1.getScreenshotAs(OutputType.FILE);
		String destination1=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1366x768\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source1, new File(destination1));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
			
		driver.close();
		
	}
	@Parameters({"browser"})
	@Test(priority=3)
	public void browser3(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/calley-pro-features/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Best Automatic Calling App For Business Owners - Calley PRO");
		
		driver.manage().window().setSize(new Dimension(1920,1080));
		 
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1920x1080\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		

		driver.manage().window().setSize(new Dimension(1366,768));
		 
		String timestamp1=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File  source1=ts1.getScreenshotAs(OutputType.FILE);
		String destination1=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1366x768\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source1, new File(destination1));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		driver.close();
		
	}
		
	@Parameters({"browser"})
	@Test(priority=4)
	public void browser4(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/best-auto-dialer-app/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Calley Is The Best Auto Dialer App For Your Mobile Phone");
		
		driver.manage().window().setSize(new Dimension(1920,1080));
		 
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1920x1080\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		

		driver.manage().window().setSize(new Dimension(1366,768));
		 
		String timestamp1=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File  source1=ts1.getScreenshotAs(OutputType.FILE);
		String destination1=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1366x768\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source1, new File(destination1));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		driver.close();
		
	}
		
	@Parameters({"browser"})
	@Test(priority=5)
	public void browser5(String br)
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "How Does Calley Best Free Automatic Call Dialer Works?");
		
		driver.manage().window().setSize(new Dimension(1920,1080));
		 
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File  source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1920x1080\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source, new File(destination));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		

		driver.manage().window().setSize(new Dimension(1366,768));
		 
		String timestamp1=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File  source1=ts1.getScreenshotAs(OutputType.FILE);
		String destination1=System.getProperty("user.dir")+"\\DeviceName\\"+"\\Desktop\\"+"\\Resolution\\"+"\\1366x768\\"+"\\Screenshots\\"+"_"+timestamp+".png";
			
		try
			{
		FileUtils.copyFile(source1, new File(destination1));
			}
		catch(Exception e)
		{
		 e.getMessage();
		}
		
		driver.close();
		
	}
		
	

}
