package Sd;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.*;

public class login {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("Webdriver.chrome.driver","//Users//apple//Downloads//chrome-mac-arm64.exe");
		driver=new ChromeDriver();

	}
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {

	}

	@When("Open the url {string}")
	public void open_the_url(String string) {
		driver=new ChromeDriver();
		driver.get(string);

	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String string, String string2) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(string);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(string2);

	}

	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("The user will landing on the home")
	public void the_user_will_landing_on_the_home() {
		String url1=driver.getCurrentUrl();
		System.out.println(url1);

	}

//test comment


}
