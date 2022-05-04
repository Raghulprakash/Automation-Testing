package selinium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Facebook {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); // website link
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/div[1]/div/img"));
		boolean output= logo.isDisplayed();
		System.out.println(" The Logo is Displayed "+ output);
		
		WebElement Emailadd = driver.findElement(By.id("email"));
		Emailadd.sendKeys("RaghulPrakash");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("123abc");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
		
		WebElement Forgotpassword = driver.findElement(By.xpath("//*[@id=\'login_link\']/div/a"));
		Forgotpassword.click();
		
		driver.navigate().back();
		
		WebElement Createaccount = driver.findElement(By.partialLinkText("Sign up"));
		Createaccount.click();
		
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Raghul");
		
		WebElement Lastname = driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Prakash");
		
		WebElement Mobilenumber = driver.findElement(By.name("reg_email__"));
		Mobilenumber.sendKeys("1234567890");
		
		WebElement NewPassword = driver.findElement(By.name("reg_passwd__"));
		NewPassword.sendKeys("RaghulPrakash");
			
		WebElement Date = driver.findElement(By.id("day"));
		Select date = new Select(Date);
		date.selectByIndex(16);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select month = new Select(Month);
		month.selectByValue("5");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select year = new Select(Year);
		year.selectByVisibleText("1999");
		
	   // WebElement Gender = driver.findElement(By.id("u_0_5_ki"));
	   //  Gender.click();
		
		WebElement Signingin = driver.findElement(By.name("websubmit"));
		Signingin.click();
		
		driver.close();
	}

}
