package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	private static final String Trending = null;
	private static final String Now = null;

	public static void main(String[] args) throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://in.search.yahoo.com/?fr2=inr");
		Driver.findElement( By.xpath("//[@class='title d-i fz-s fw-xl s-label']")).getText();
		//if (text.contentEquals("Trending Now")) {
			//System.out.println("Text : " + text);
		//} 
		//else {
		//	System.out.println("Text : " + text);
			//driver.close();
			//driver.quit();
		//}
		List<WebElement> links = Driver.findElements(By.xpath("(//li[class=icon-find]//"));
		int size = links.size();
		System.out.println("Total Number of Links : " + size);
		for (int i = 0; i < size; i++) {
			System.out.println(links.get(i).getText());
		}

		for (int i = 0; i < size; i++) {
			String linkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			links.get(i).sendKeys(linkTab);
		}
		
		Driver.findElement(By.xpath("//[@title='COVID-19 in India']")).click();
		System.out.print("Total Casses in India : ");
		String cases= Driver.findElement(By.xpath("//*[\"web\"]/ol/li[4]/div/table/tbody/tr[1]/td[2]/div/span")).getText();
		System.out.print(cases+"\n");
		String death = Driver.findElement(By.xpath("//*[\"web\\\"]/ol/li[4]/div/table/tbody/tr[1]/td[4]/div/span")).getText();
		System.out.print("Death Cases : ");
		System.out.print(death);
		Thread.sleep(5000);
		Driver.close();
		Driver.quit();
	}
}