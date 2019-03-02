import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class git1 {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("Will work with code/Users/rohitbaweja/Desktop/chromedriver");
		System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println("adding again");
<<<<<<< HEAD
		System.out.println("Try this");
=======
		
		// adding a comment
>>>>>>> bcccedc1d61dfb33cea82be0ddf970b2505c18b0
	}
	
	
}
