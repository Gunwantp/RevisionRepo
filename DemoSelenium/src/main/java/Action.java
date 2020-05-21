import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
        HashMap<String, Integer>prefs=new HashMap();
        prefs.put("profile.default_content_setting_values.notifications",1);
        opt.setExperimentalOption("prefs",prefs);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions(driver);
		WebElement MSection = driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Men')]"));
		WebElement Bag = driver.findElement((By.xpath("//a[@class='desktop-categoryName'][contains(text(),'Bags & Backpacks')]")));
		act.moveToElement(MSection).perform();
		Thread.sleep(1500);
		act.click(Bag).perform();
		System.out.println("Title of current Page : "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.quit();
	}

}
