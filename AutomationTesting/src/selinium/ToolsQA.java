package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {

	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//	driver.get("https://demoqa.com/");
			driver.get("https://demoqa.com/books");
			driver.manage().window().maximize();
			
		//	WebElement BookStoreApplication = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
		//	BookStoreApplication.click();
			
			WebElement BookStoreDisplayed = driver.findElement(By.xpath("//div[@class='main-header']"));
		    boolean bookstoredisplayed= BookStoreDisplayed.isDisplayed();
		    System.out.println(" Is It Displayed : "+bookstoredisplayed);
		   
		    WebElement SearchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
		    boolean searchbox = SearchBox.isDisplayed();
		    SearchBox.sendKeys("Speaking JavaScript");
		    System.out.println(" Is searchbox Available : "+searchbox);
		    
		    WebElement Login = driver.findElement(By.id("login"));
		    boolean login = Login.isDisplayed();
		    System.out.println(" Is login Available : "+login);
		    
		    WebElement Image = driver.findElement(By.xpath("//div[text()='Image']"));
		    boolean image = Image.isDisplayed();
		    System.out.println(" Is image Available : "+image);
		    
		    WebElement Title = driver.findElement(By.xpath("//div[text()='Title']"));
		    boolean title = Title.isDisplayed();
		    System.out.println(" Is title Available : "+title);
		    
		    WebElement Author = driver.findElement(By.xpath("//div[text()='Author']"));
		    boolean author = Author.isDisplayed();
		    System.out.println(" Is author Available : "+author);
		    
		    WebElement AuthorName = driver.findElement(By.xpath("//div[text()='Axel Rauschmayer']"));
		    boolean authorname = AuthorName.isDisplayed();
		    System.out.println(" Is author name Available : "+authorname);
		    
		    
		    WebElement Publisher = driver.findElement(By.xpath("//div[text()='Publisher']"));
		    boolean publisher = Publisher.isDisplayed();
		    System.out.println(" Is publisher Available : "+publisher);
		    
		    WebElement PublisherName = driver.findElement(By.xpath("//*[contains(text(),'Reilly Media')]"));
		    boolean publishername = PublisherName.isDisplayed();
		    System.out.println(" Is publisher name Available : "+publishername);
		    
		    SearchBox.clear();// to clear the search box
		    
		    driver.navigate().refresh();// to refresh the website
		    
		    WebElement NewBook = driver.findElement(By.xpath("//*[contains(text(),' Know JS')]"));
		    boolean newbook = NewBook.isDisplayed();
		    System.out.println(" Is newbook Available : "+newbook);
		    
	        Point newbookloc = NewBook.getLocation();
	        String newbooktext=NewBook.getText();
	        System.out.println(" Location of newbook : "+newbookloc);
	        System.out.println(" Name of newbook : "+newbooktext);
		    
		    
	}
}
