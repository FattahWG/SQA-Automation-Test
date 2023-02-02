package user;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import user.page.HomePage;

import static driverSetup.driverSetup.webDriver;
import static org.junit.Assert.assertEquals;

public class searchSteps {
    HomePage homePage = new HomePage(webDriver);
    //Scenario 1
    @Given("user on Tokopedia website")
    public void userOnTokopediaWebsite() {
        homePage.setHome();
    }

    @When("user input {string} on search box")
    public void userInputProductOnSearchBox(String product) throws InterruptedException {
        homePage.productName(product);
        Thread.sleep(5000);
        homePage.searchClick();
    }

    @Then("user will see total product")
    public void userWillSeeResultAsTotalProduct() throws InterruptedException{
        Thread.sleep(5000);
        homePage.totalItem();
    }

    @And("Scrolling the website")
    public void scrollingTheWebsite() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(6000,3000)");
        Thread.sleep(5000);
    }
}
