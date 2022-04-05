package introduction;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch Firefox driver
		System.setProperty("webdriver.Firefox.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\Firefoxdriver_win32 (1)\\Firefoxdriver.exe");
		WebDriver Driver = new ChromeDriver();
		// launch Opera driver
		System.setProperty("webdriver.Opera.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\Operadriver_win32 (1)\\Operadriver.exe");
		WebDriver Driver1 = new OperaDriver();
		// launch Microsoft driver
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\msegedriver_win32 (1)\\Microsoftdriver.exe");
		//driver.get("https://www.google.com/chrome/");
				Driver.manage().window().maximize();
				Driver.navigate().to("https://www.myntra.com/");

					
					// Choose any section like men or women from menu bar
					Actions a = new Actions(Driver);
					a.moveToElement(Driver.findElement(By.xpath("//a[contains(text(),'Men')]"))).build().perform();
					a.click();
					// Verify Category
					WebElement category = Driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"));
					JavascriptExecutor js = (JavascriptExecutor) Driver;
					//Click on sort by and choose What’s new
					js.executeScript("arguments[0].click()", category);
					Actions a1 = new Actions(Driver);
					a1.moveToElement(Driver.findElement(By.xpath("//div[@class='sort-sortBy']"))).build().perform();
					a1.moveToElement(Driver.findElement(By.xpath("//label[contains(text(),\"What's New\")]"))).click().build()
							.perform();
					Thread.sleep(2000);
					// Verify Filters Like Brand,Discount,Range etc.
					a1.moveToElement(Driver.findElement(By.cssSelector("ul[class='brand-list'] input[value='Roadster']"))).click()
							.build().perform();
					Thread.sleep(2000);
					// Verify Discount
					a1.moveToElement(Driver.findElement(By.cssSelector("[class='discount-list'] li:nth-child(2)"))).click().build()
							.perform();
					Thread.sleep(2000);
					// Verify Range
					a1.moveToElement(Driver.findElement(By.cssSelector("[class='Range'] li:nth-child(2)"))).click().build()
							.perform();
					Thread.sleep(2000);
					// Selecting Product
					a1.moveToElement(
							Driver.findElement(By.cssSelector("[class='product base'] li:nth-child(1)"))).click().sendKeys("Roadster Men Navy Blue & Olive Green Striped Polo Collar T-shirt",Keys.ENTER);
			}
			
 }
}
	
			


