import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class git1 {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("Will work with code/Users/rohitbaweja/Desktop/chromedriver");
		System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("q")).sendKeys("Rohit Baweja");
		System.out.println("Results are coming ...");
	}
	
	
}
