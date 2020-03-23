package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class OrangeSteps {

WebDriver driver;
	
	@Given("I launch in chrome browser")
	public void i_launch_in_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@When("I open OrangeHRM Homepage")
	public void i_open_OrangeHRM_Homepage() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify the logo present on the page")
	public void i_verify_the_logo_present_on_the_page() {
		 boolean status = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
	     Assert.assertTrue(status);
	}
	
	@When("Enter username and password")
	public void enter_username_and_password() {
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    }

	@When("click on login button")
	 public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();       
	    }

	@Then("user must successfully login to the Dashboard page")
	public void user_must_successfully_login_to_the_Dashboard_page() {
	     String text = driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).getText();
	     Assert.assertEquals(text,"Dashboard");
	    }

	@Then("close Browser")
	public void close_Browser() {
		  driver.quit();
	}



}
