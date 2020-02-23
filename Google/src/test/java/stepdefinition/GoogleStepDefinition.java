package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import testhomepage.TestHomePage;

public class GoogleStepDefinition extends TestHomePage {

    @Given("I am at {string}")
    public void i_am_at(String string) {
        // Write code here that turns the phrase above into concrete actions
    getLocalDriver("windows","chrome");
    driver.get(string);
    driver.manage().window().maximize();
    }

    @Given("I search {string}")
    public void i_search(String string) {
        // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath(searchBox)).sendKeys(string, Keys.ENTER);
    }

    @Then("I close Browser")
    public void i_close_Browser() {
        // Write code here that turns the phrase above into concrete actions
    driver.quit();
    }

    @Given("I search value {string}")
    public void i_search_value(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath(searchBox)).sendKeys(string, Keys.ENTER);
        driver.close();
    }

    @Given("I am Searching from DataBase")
    public void iAmSearchingFromDataBase() throws Exception {
        getInItElements();
        searchDataBase();
    }


}
