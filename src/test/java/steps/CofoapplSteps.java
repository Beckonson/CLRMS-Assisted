package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Commonmethods;

public class CofoapplSteps extends Commonmethods {
    @Given("user is logged in to apply for new COO")
    public void user_is_logged_in_to_apply_for_new_coo() {
        WebElement servic = driver.findElement(By.xpath("//span[contains(normalize-space(),'Services')]"));
        servic.click();
        WebElement propty = driver.findElement(By.cssSelector("a[href='/dashboard/services/property-title']"));
        propty.click();
        WebElement newApp = driver.findElement(By.xpath("//button[contains(normalize-space(),'New application')]"));
        newApp.click();
    }
    @When("user Select Regularisation allocation type")
    public void user_select_regularisation_allocation_type() {
        WebElement selAllo = driver.findElement(By.cssSelector("div.flex-1 > div > button.flex"));
        selAllo.click();
        WebElement allocTyp = driver.findElement(By.xpath("//p[contains(normalize-space(),'Select an allocation type to p')]"));
        allocTyp.click();
    }
    @When("user fill all regularization details")
    public void user_fill_all_regularization_details() {
        System.out.println("pass 1");
    }
    @Then("user is able to proceed to make payment")
    public void user_is_able_to_proceed_to_make_payment() {
        System.out.println("pass 1");
    }
}
