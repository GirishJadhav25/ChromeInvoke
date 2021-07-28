package CromeInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_CromeDriver {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
	
		
	}

}
