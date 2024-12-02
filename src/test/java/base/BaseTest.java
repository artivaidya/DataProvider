package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();

	public static FileReader fr;
	
	@BeforeMethod
	@BeforeTest
	public void setUp() throws IOException {
	if(driver==null) {	
		FileReader fr= new FileReader(System.getProperty("user.dir") + "/src/test/resources/configFiles/congig.properties");
		prop.load(fr);
		
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // Adjust as needed
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        driver.get(prop.getProperty("testurl"));
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
		driver.get(prop.getProperty("testurl"));
	}
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
	driver.close();
	System.out.println("Teardown successful");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
