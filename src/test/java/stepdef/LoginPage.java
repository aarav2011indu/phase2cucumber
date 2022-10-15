package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {

			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			
		}
		
	    // Write code here that turns the phrase above into concrete actions
	

	@Given("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
		
		WebElement LoginLink = driver.findElement(By.name("login-button"));
		LoginLink.click();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter the incorrect Username as {string} and Passowrd as {string}")
	public void i_enter_the_incorrect_Username_as_and_Passowrd_as(String string, String string2) {
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys("abc@xyz.com");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Test@1234");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String String) {
		WebElement Error = driver.findElement(By.xpath("//*[@data-test='error']"));
		String ActError = Error.getText();
		
		System.out.println(ActError);
		
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter the correct Username as {string} and Passowrd as {string}")
	public void i_enter_the_correct_Username_as_and_Passowrd_as(String string, String string2) {
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys("standard_user");

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {

		driver.get("https://www.saucedemo.com/inventory.html");
		
	    // Write code here that turns the phrase above into concrete actions
	}



	

	}

