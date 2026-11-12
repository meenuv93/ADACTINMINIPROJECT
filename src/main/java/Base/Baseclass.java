package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass 
{
public WebDriver driver;

@BeforeTest
@Parameters("browser")
public void setup(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("edge")) 
	{
		driver=new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("firefox")) 
	{
		driver=new FirefoxDriver();
	}
	
	driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
}

@BeforeMethod
public void second()
{
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterTest
public void end()
{
	driver.quit();
	}

}
