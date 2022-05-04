package selinium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class AmazonProduct {

public static void main(String[] args) throws NumberFormatException {

System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
String Window1 = driver.getWindowHandle();

WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
searchbox.sendKeys("iphones");

WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
searchButton.click();

List<WebElement> priceElements = driver.findElements(By.cssSelector("[class='a-price-whole']"));
Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();
for (int i = 0; i < priceElements.size(); i++) {

if (priceElements.get(i).getText() != "") {
map.put(priceElements.get(i), Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
}

}
List<Entry<WebElement, Integer>> le = new ArrayList<Map.Entry<WebElement, Integer>>(map.entrySet());
le.sort(Entry.comparingByValue());
for (Entry e : le) {
System.out.println(e.getValue());

}
le.get(0).getKey().click();
Set<String> Window2 = driver.getWindowHandles();
for (String newwindows : Window2) 
{
driver.switchTo().window(newwindows);	
}
WebElement AddCart = driver.findElement(By.id("add-to-cart-button"));
AddCart.click();
}
}
