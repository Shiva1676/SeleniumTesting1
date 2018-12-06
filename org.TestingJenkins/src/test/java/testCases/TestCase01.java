/**
 * 
 */
package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *
 */
public class TestCase01 {

	@Test
	public void test(){
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("========The Browser is ready to start==========");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/");
		
		System.out.println("===========The application is up and running==========");
		
		driver.quit();
		
		System.out.println("============Browser closed=============");
		
		
	}
	
}
