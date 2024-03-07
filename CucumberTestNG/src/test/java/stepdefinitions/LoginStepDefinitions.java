package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	
	WebDriver driver;

	@After
	public void takeScreenshotOnFailure(Scenario scenario) {

	if (scenario.isFailed()) {

	TakesScreenshot ts = (TakesScreenshot) driver;

	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(src, "image/png", "screenshot");
	}

	}
	
	@Given("User Opens the Browser")
	public void user_opens_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\upend\\eclipse-workspace\\tutorialsninja\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("Navigates to Google Page")
	public void navigates_to_google_page() {
		driver.get("https://www.google.com");
		driver.findElement(By.id("Name")).sendKeys("Name");
	}

	@Then("Get the Title of the page")
	public void get_the_title_of_the_page() {
		String titlename = driver.getTitle();
		System.out.println(titlename);
	}

	@Then("User Closes the Browser")
	public void user_closes_the_browser() {
		driver.close();
	}

	@When("Navigates to Youtube Page")
	public void navigates_to_youtube_page() {
		driver.get("https://www.youtube.com");
	}

}
