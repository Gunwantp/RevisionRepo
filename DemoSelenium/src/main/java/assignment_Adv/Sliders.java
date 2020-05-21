package assignment_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sliders {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver =new ChromeDriver(opt);
		driver.get("http://practice.automationtesting.in/");
		
		WebElement Shop = driver.findElement(By.xpath("//ul[@class='main-nav']//li[1]//a"));
		Shop.click();
		Thread.sleep(5000);
		System.out.println("On the Shop Page");
		driver.navigate().back();
		System.out.println("Back to Home Page");
		
		Thread.sleep(2000);
//		driver.quit();
		;

	}

}
