package assignment_Adv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Arrivals {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		WebElement Shop = driver.findElement(By.xpath("//ul[@class='main-nav']//li[1]//a"));
		Shop.click();
		System.out.println("On Shop Page Now");
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Back to Home Page");
				
		List<WebElement> anchor;
		anchor = driver.findElements(By.xpath("//*[@class='themify_builder_row themify_builder_22_row module_row module_row_1 clearfix gutter-default col_align_top']//img"));
		
		
		
		
	}


}
