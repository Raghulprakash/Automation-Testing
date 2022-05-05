package selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSpecificProduct {

	public static void main(String[] args) throws InterruptedException{
		    System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.amazon.in/");
			String Window1 = driver.getWindowHandle();
	        driver.manage().window().maximize();
	        
			WebElement Product = driver.findElement(By.id("twotabsearchtextbox"));
			Product.sendKeys("Apple iPhone 13 (128GB) - Midnight");
			Product.submit();
			
			WebElement Item =driver.findElement(By.xpath("//*[text()='Apple iPhone 13 (128GB) - Midnight']"));
			Item.click();
			
			Set<String> Window2 = driver.getWindowHandles();
			for (String newwindows : Window2) {
				driver.switchTo().window(newwindows);
			}
			
			WebElement ProductChange = driver.findElement(By.xpath("//*[@id='a-autoid-12-announce']"));
			ProductChange.click();
			Thread.sleep(4000);
			
			WebElement ColorChange = driver.findElement(By.xpath("//*[@alt='Blue']"));
			ColorChange.click();
			Thread.sleep(4000);
			
			WebElement AddCart = driver.findElement(By.id("add-to-cart-button"));
			AddCart.click();
			
		}

}
