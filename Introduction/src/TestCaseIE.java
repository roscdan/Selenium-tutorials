import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCaseIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dana\\WorkyWork\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
