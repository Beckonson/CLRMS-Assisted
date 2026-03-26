package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class LoginSteps {
    WebDriver driver;

    @Given("user navigate to CLRMS portal")
    public void user_navigate_to_clrms_portal() {

        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.get("https://clrms-assisted-portal-staging.verxid.site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @When("user enter a valid email and password")
    public void user_enter_a_valid_email_and_password() {
        WebElement usernamefield = driver.findElement(By.id("user"));
        usernamefield.sendKeys("clrms.assisted@yopmail.com");
        WebElement passfield = driver.findElement(By.id("password"));
        passfield.sendKeys("Admin@123");
    }

    @When("clicks on login")
    public void clicks_on_login() {
        WebElement submitbt = driver.findElement(By.cssSelector("button[type='submit']"));
        submitbt.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement success = driver.findElement(By.xpath("//button[contains(normalize-space(),'Confirm')]"));
        Assert.assertTrue(success.isDisplayed());
        success.click();

        WebElement dash = driver.findElement(By.xpath("//p[normalize-space()='Dashboard']"));
        Assert.assertTrue(dash.isDisplayed());
        String successmsg = dash.getText();
        System.out.println(successmsg);


    }
}

