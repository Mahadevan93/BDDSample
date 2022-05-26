package stepDefs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePagestepDefs {
	
	WebDriver driver;
	@Given("User is on Google Search page")
	public void user_is_on_google_search_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   driver.get("https://www.google.com");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
		driver.findElement(By.name("q")).sendKeys("Java Tutorial");
		driver.findElement(By.name("q")).submit();
	    
	}
	@Then("Should display Java Tutorial results page")
	public void should_display_java_tutorial_results_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Java Tutorial - Google Search");
		driver.quit();
	    
	}


	@When("User search IPL")
	public void user_search_IPL() {
		driver.findElement(By.name("q")).sendKeys("IPL");
		driver.findElement(By.name("q")).submit();
	    
	}
	@Then("Should display IPL results page")
	public void should_display_IPL_results_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "IPL - Google Search");
		driver.quit();
	}

	@After
	public void attachScreenWithReport(io.cucumber.java.Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File src = screen.getScreenshotAs(OutputType.FILE);
			byte[] imgByte = FileUtils.readFileToByteArray(src);
					scenario.attach(imgByte, "image/png", "Image1");
		}
	}
	
}
