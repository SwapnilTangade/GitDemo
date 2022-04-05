package introduction;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		// launch the browser
		Driver.get("https://in.yahoo.com/");
		//maximize the browser
		Driver.manage().window().maximize();
		// verify text "Trending now"
		String t = "Trending now";
        //explicit wait until text is visible
		WebDriverWait wait = new WebDriverWait(Driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/ol[2]/li[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h4[1]")));
		//absolute xpath for Trending Now
		Driver.findElement(
				By.xpath("/html[1]/body[1]/div[2]/div[1]/ol[2]/li[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/h4[1]"));
		//print text is present
		System.out.println("Text  :" + t + " is present .");

		// verify the number of link present under Trending Now
		// limiting Webdriver scope
		
		WebElement footerdriver = Driver.findElement(By.cssSelector(".compList.lh-l.fz-s.pl-10.pr-10"));
	
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// click on each link in the section and check if page is opening in seperate
		// tab

		for (int i = 0; i < footerdriver.findElements(By.tagName("a")).size(); i++)
		{

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			footerdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}
			//open all the tabs and print the title of each page
	
			Set <String> abc = Driver.getWindowHandles();//10
			Iterator <String> it = abc.iterator();
			while (it.hasNext())
			{
		  Driver.switchTo().window(it.next());
		  System.out.println(Driver.getTitle());
		  //navigate to main page
		  Driver.navigate().to("https://in.yahoo.com/"); 
		  //click on Covid-19 updates
		  Driver.findElement(By.linkText("COVID-19 Updates")).click();
		  
		}

	}
}


