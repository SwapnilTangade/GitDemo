package introduction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/chrome/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");

			
			// Choose any section like men or women from menu bar
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Men')]"))).build().perform();
			a.click();
			// Verify Category
			WebElement category = driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//Click on sort by and choose What’s new
			js.executeScript("arguments[0].click()", category);
			Actions a1 = new Actions(driver);
			a1.moveToElement(driver.findElement(By.xpath("//div[@class='sort-sortBy']"))).build().perform();
			a1.moveToElement(driver.findElement(By.xpath("//label[contains(text(),\"What's New\")]"))).click().build()
					.perform();
			Thread.sleep(2000);
			// Verify Filters Like Brand,Discount,Range etc.
			a1.moveToElement(driver.findElement(By.cssSelector("ul[class='brand-list'] input[value='Roadster']"))).click()
					.build().perform();
			Thread.sleep(2000);
			// Verify Discount
			a1.moveToElement(driver.findElement(By.cssSelector("[class='discount-list'] li:nth-child(2)"))).click().build()
					.perform();
			Thread.sleep(2000);
			// Verify Range
			a1.moveToElement(driver.findElement(By.cssSelector("[class='Range'] li:nth-child(2)"))).click().build()
					.perform();
			Thread.sleep(2000);
			// Selecting Product
			a1.moveToElement(
					driver.findElement(By.cssSelector("[class='product base'] li:nth-child(1)"))).click().sendKeys("Roadster Men Navy Blue & Olive Green Striped Polo Collar T-shirt",Keys.ENTER);
	}
	}


