import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class First {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\gupawar\\Downloads\\Alert.html");
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		/* Switch Frame */
		/*
		 * driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		 * driver.switchTo().frame("classFrame"); WebElement we =
		 * driver.findElement(By.xpath(
		 * "//div[@class='topNav']//a[contains(text(),'Deprecated')]")); we.click();
		 */
		
				/*
		 * driver.get("https://google.com"); String title1 = driver.getTitle();
		 * System.out.println("Title 1 : " +title1); WebElement inp =
		 * driver.findElement(By.xpath("//input[@name='q']"));
		 * inp.sendKeys("Capgemini India"); inp.submit(); String title2 =
		 * driver.getTitle(); driver.navigate().back(); if(driver.getTitle() == title1)
		 * System.out.println("Title for first page Matches");
		 * 
		 * driver.navigate().forward(); if(driver.getTitle()==title2)
		 * System.out.println("Title 2 matches as well");
		 */
		
		
			
		
		
		
		/*
		 * driver.get("https://google.com");
		 * List<WebElement>list = driver.findElements(By.tagName("a")); for(int i=0;
		 * i<list.size();i++) System.out.println(list.get(i).getText());
		 * 
		 * WebElement we = driver.findElement((By.name("q")));
		 * we.sendKeys("Capgemini India"); we.submit();
		 */	
		
		

	}

}
