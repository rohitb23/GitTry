import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class git1 {

	public static void main(String[] args)   {
		System.out.println("1");
		System.out.println("Will work with code/Users/rohitbaweja/Desktop/chromedriver");
		System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		System.out.println("Working");
		
		//driver.findElement(By.xpath("//*[@id=\"tsf"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("RB");
		driver.findElement(By.name("q")).click();
		System.out.println("Done");
		driver.findElement(By.name("q")).sendKeys("Why");
		System.out.println("Check");
	}
	
	
}
