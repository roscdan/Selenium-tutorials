import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dana\\WorkyWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}

}
