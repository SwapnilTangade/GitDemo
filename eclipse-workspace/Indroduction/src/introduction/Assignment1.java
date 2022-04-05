 package introduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rahul\\Desktop\\selenium softwares\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		// launch the browser
		Driver.get("https://qatechhub.com/");

		// maximize the browser

		Driver.manage().window().maximize();

		// print the title of the page
		System.out.println(Driver.getTitle());

		// print current URL
		String strUrl = Driver.getCurrentUrl();
		System.out.println("current Url is :" + strUrl);

		// navigate to facebook
		Driver.navigate().to("http://www.facebook.com");
		Driver.manage().window().maximize();

		// navigate back to QA page

		Driver.navigate().back();

		// print the URL of the current page

		String strUrl2 = Driver.getCurrentUrl();
		System.out.println(" Current url is :" + strUrl2);

		// navigate forward
		Driver.navigate().forward();

		// refresh the page

		Driver.navigate().refresh();

		// close the browser

		Driver.close();

	}
}
	


