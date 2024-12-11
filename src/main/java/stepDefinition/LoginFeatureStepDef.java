package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureStepDef {
	 WebDriver driver;

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/"); // Facebook login page URL
        System.out.println("Navigated to Facebook login page.");
	}
	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
		 WebElement emailField = driver.findElement(By.id("email")); // Email/phone field ID
	        WebElement passwordField = driver.findElement(By.id("pass")); // Password field ID
	        WebElement loginButton = driver.findElement(By.name("login")); // Login button 'name' attribute

	        emailField.sendKeys("summa@gmail.com"); // Replace with valid email/phone
	        passwordField.sendKeys("!@#$%^"); // Replace with valid password
	        loginButton.click();
	        System.out.println("Entered valid credentials and clicked login.");
	}
	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		 String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue("User is not redirected to Facebook homepage.", currentUrl.contains("https://www.facebook.com/"));
	        System.out.println("User successfully redirected to Facebook homepage.");
	}
	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
		 WebElement feedElement = driver.findElement(By.xpath("//div[@role='feed']")); // Assuming the feed element has the 'role=feed' attribute
	        Assert.assertTrue("Facebook feed is not displayed.", feedElement.isDisplayed());
	        System.out.println("Facebook feed is displayed.");
	        driver.quit();
	}

}
