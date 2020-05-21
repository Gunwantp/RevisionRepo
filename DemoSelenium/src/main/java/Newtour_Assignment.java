import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtour_Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement Reg = driver.findElement(By.xpath("//a[contains(text(),\"Register\")]"));Reg.click();
		WebElement FN = driver.findElement((By.name("firstName")));
		WebElement LN = driver.findElement(By.name("lastName"));
		WebElement PH = driver.findElement((By.name("phone")));
		WebElement Email = driver.findElement((By.name("userName")));
		WebElement adr1 = driver.findElement((By.name("address1")));
		WebElement adr2 = driver.findElement((By.xpath("//input[@name='address2']")));
		WebElement city = driver.findElement((By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(9) td:nth-child(2) > input:nth-child(1)")));
		WebElement state = driver.findElement((By.xpath("//input[@name='state']")));
		WebElement PC = driver.findElement((By.name("postalCode")));
		WebElement country = driver.findElement((By.name("country")));
		WebElement UN = driver.findElement((By.xpath("//input[@id='email']")));
		WebElement pwd = driver.findElement((By.xpath("//input[@name='password']")));
		WebElement cpw = driver.findElement((By.xpath("//input[@name='confirmPassword']")));
		WebElement subtn = driver.findElement(By.xpath("//input[@name='register']"));
		Select drpcountry = new Select(country);
		
		
						
		FN.sendKeys("GPT");
		LN.sendKeys("GPT_LN");
		PH.sendKeys("12345");
		Email.sendKeys("tst.email.com");
		adr1.sendKeys("Address Line# 1");
		adr2.sendKeys("Address Line# 2");
		city.sendKeys("Nasik");
		state.sendKeys("MH");
		PC.sendKeys("09876");
		drpcountry.selectByVisibleText("INDIA");
		UN.sendKeys("tstuser");
		pwd.sendKeys("pwdpwd");
		cpw.sendKeys("confirm");
		Thread.sleep(3000);
		subtn.click();
		
		String title = driver.getTitle();
		System.out.println("Title of Current WebPage is : " +title);
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
