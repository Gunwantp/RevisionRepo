package com.capg.StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;




public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gupawar\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
	   
	}

	@When("^User enters uname and password$")
	public void user_enters_uname_and_password() throws Throwable {
	   driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("1234567");
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
	    
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	   Assert.assertEquals("Myntra", driver.getTitle());
	
	}

}
