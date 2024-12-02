package testCases;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest{
	@Test(dataProvider="testData")
	public static void LoginTest(String username , String password) {
	
	
	
	
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.id("login_id")).sendKeys(username);
	driver.findElement(By.id("nextbtn")).click();
	driver.findElement(By.id("pwd_field")).sendKeys(password);
	}
	
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object[][] 
		{ 
			{"arti.vaidya2008@gmail.com" ,"abc@123"}
			
		};
		
	}
		}
				

