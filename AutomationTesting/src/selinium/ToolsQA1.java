package selinium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQA1 
{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		FileInputStream stream=new FileInputStream("config.properties");
		Properties property=new Properties();
		property.load(stream);
		
			System.setProperty("webdriver.gecko.driver", "");
		    driver = new FirefoxDriver();
			driver.get("https://demoqa.com/books");
			driver.manage().window().maximize();
			
		 	WebElement Login = driver.findElement(By.id("login"));
		    Login.click();
			
			WebElement WordText = driver.findElement(By.xpath("//*[text()='Welcome,']"));
		    boolean wordtext = WordText.isDisplayed();
		    System.out.println(" Is The Text Displayed : "+wordtext);
		    
		    WebElement UserName = driver.findElement(By.id("userName-label"));
		    boolean username = UserName.isDisplayed();
		    System.out.println(" Is The UserName Available : "+username);
		    
		    WebElement Password = driver.findElement(By.id("password-label"));
		    boolean password = Password.isDisplayed();
		    System.out.println(" Is The Password Available : "+password);
		    
		    WebElement LoginButton = driver.findElement(By.id("login"));
		    boolean loginbutton = LoginButton.isDisplayed();
		    System.out.println(" Is The LoginButton Available : "+loginbutton);
		    
		    WebElement NewUser = driver.findElement(By.id("newUser"));
		    boolean newuser = NewUser.isDisplayed();
		    System.out.println(" Is The NewUser Available : "+newuser);
		    NewUser.click();
		    
		    WebElement FirstName = driver.findElement(By.id("firstname"));
		    FirstName.sendKeys("Raghul");
		    
		    WebElement LastName = driver.findElement(By.id("lastname"));
		    LastName.sendKeys("Prakash");
		    
		    WebElement NewUserName = driver.findElement(By.id("userName"));
		    NewUserName.sendKeys("Raghul Prakash");
		    
		    WebElement NewPassword = driver.findElement(By.id("password"));
		    NewPassword.sendKeys("Raghul123@");
		  
//		    WebElement NotRobot = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
//		    NotRobot.click();
//            
//          WebElement NewRegister = driver.findElement(By.xpath("//button[text()='Register']"));
//          NewRegister.click();
            
		    WebElement BacktoLogin = driver.findElement(By.id("gotologin"));
		    BacktoLogin.click();
		    
		    WebElement NewUserName1 = driver.findElement(By.id("userName"));
		    NewUserName1.sendKeys("Raghul Prakash");
		    
		    WebElement NewPassword1 = driver.findElement(By.id("password"));
		    NewPassword1.sendKeys("Raghul123@");
		    
		    WebElement Login1 = driver.findElement(By.id("login"));
		    Login1.click();
		   

	}
}
