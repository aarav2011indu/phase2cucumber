package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
	WebDriver driver = Hooks.driver;
	@When("I click on the Add to cart button  for product Sauce Labs Backpack")
	public void i_click_on_the_Add_to_cart_button_for_product_Sauce_Labs_Backpack() {
		WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		AddToCart.click();
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("your cart  should be {int}")
	public void your_cart_should_be(Integer int1) {
		WebElement cartitem = driver.findElement(By.id("shopping_cart_container"));
		
		String items = cartitem.getText();
		Assert.assertEquals(items,"1");
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
